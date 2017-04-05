package com.jpl.pdmod.npcs;

import com.jpl.pdmod.data.MobData;
import com.jpl.pdmod.windows.WndKevin;
import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.Journal;
import com.watabou.pixeldungeon.actors.Actor;
import com.watabou.pixeldungeon.actors.Char;
import com.watabou.pixeldungeon.actors.buffs.Buff;
import com.watabou.pixeldungeon.actors.mobs.npcs.NPC;
import com.watabou.pixeldungeon.items.Heap;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.items.quest.CorpseDust;
import com.watabou.pixeldungeon.items.quest.PhantomFish;
import com.watabou.pixeldungeon.items.wands.*;
import com.watabou.pixeldungeon.levels.Level;
import com.watabou.pixeldungeon.levels.PrisonLevel;
import com.watabou.pixeldungeon.levels.Room;
import com.watabou.pixeldungeon.levels.Terrain;
import com.watabou.pixeldungeon.plants.Rotberry;
import com.watabou.pixeldungeon.scenes.GameScene;
import com.watabou.pixeldungeon.sprites.WandmakerSprite;
import com.watabou.pixeldungeon.utils.Utils;
import com.watabou.pixeldungeon.windows.WndQuest;
import com.watabou.pixeldungeon.windows.WndWandmaker;
import com.watabou.utils.Bundle;
import com.watabou.utils.Random;

import java.util.ArrayList;

/**
 * Created by Freddy on 05.04.2017.
 */
public class Kevin extends NPC {
    {
        name = "Kevin";
        spriteClass = WandmakerSprite.class; // TODO: Neue sprite
    }

    @Override
    public void interact() {

    }

    @Override
    public int defenseSkill( Char enemy ) {
        return 1000;
    }

    @Override
    public String defenseVerb() {
        return "failed";
    }

    @Override
    public void damage( int dmg, Object src ) {
    }

    @Override
    public void add( Buff buff ) {
    }

    @Override
    public boolean reset() {
        return true;
    }

    private void tell( String format, Object...args ) {
        GameScene.show( new WndQuest( this, Utils.format( format, args ) ) );
    }

    @Override
    public String description() {
        return "Dies ist ein Kevin...";
    }

    public static class Quest {

        enum Type {
            ILLEGAL( null ), BERRY( berryQuest ), DUST( dustQuest ), FISH( fishQuest );

            public Kevin.QuestHandler handler;
            private Type( Kevin.QuestHandler handler ) {
                this.handler = handler;
            }
        }

        private static Type type;

        private static boolean spawned;
        private static boolean given;

        public static void reset() {
            spawned = false;
        }

        private static final String NODE		= "wandmaker";

        private static final String SPAWNED		= "spawned";
        private static final String TYPE		= "type";
        private static final String ALTERNATIVE	= "alternative";
        private static final String GIVEN		= "given";
        private static final String WAND1		= "wand1";
        private static final String WAND2		= "wand2";

        public static void storeInBundle( Bundle bundle ) {

            Bundle node = new Bundle();

            node.put( SPAWNED, spawned );

            if (spawned) {

                node.put( TYPE, type.toString() );

                node.put( GIVEN, given );
            }

            bundle.put( NODE, node );
        }

        public static void restoreFromBundle( Bundle bundle ) {

            Bundle node = bundle.getBundle( NODE );
        }

        public static void spawn(PrisonLevel level, Room room ) {
            if (!spawned && Dungeon.depth > 6 && Random.Int( 10 - Dungeon.depth ) == 0) {

                Kevin npc = new Kevin();
                do {
                    npc.pos = room.random();
                } while (level.map[npc.pos] == Terrain.ENTRANCE || level.map[npc.pos] == Terrain.SIGN);
                level.mobs.add( npc );
                Actor.occupyCell( npc );

                spawned = true;
                switch (Random.Int( 3 )) {
                    case 0:
                        type = Kevin.Quest.Type.BERRY;
                        break;
                    case 1:
                        type = Kevin.Quest.Type.DUST;
                        break;
                    case 2:
                        type = Kevin.Quest.Type.FISH;
                        int water = 0;
                        for (int i = 0; i < Level.LENGTH; i++) {
                            if (Level.water[i]) {
                                if (++water > Level.LENGTH / 16) {
                                    type = Random.Int( 2 ) == 0 ? Kevin.Quest.Type.BERRY : Kevin.Quest.Type.DUST;
                                    break;
                                }
                            }
                        }
                        break;
                }

                given = false;
            }
        }

        public static void complete() {
            Journal.remove( Journal.Feature.WANDMAKER );
        }
    }

    abstract public static class QuestHandler {
        protected String NPC_KEVIN_Q1;
        protected String NPC_KEVIN_Q2;

        public void interact( Kevin kevin ) {
            if (Quest.given) {

                Item item = checkItem();
                if (item != null) {
                    GameScene.show( new WndKevin( kevin, item ) );
                } else {
                    kevin.tell(NPC_KEVIN_Q1, Dungeon.hero.className() );
                }

            } else {
                kevin.tell(NPC_KEVIN_Q2);
                Quest.given = true;

                placeItem();

                Journal.add( Journal.Feature.WANDMAKER );
            }
        }

        abstract protected Item checkItem();
        abstract protected void placeItem();
    }

    private static final Kevin.QuestHandler berryQuest = new Kevin.QuestHandler() {
        {
            NPC_KEVIN_Q1 = "Q1.1";
            NPC_KEVIN_Q2 = "Q1.2";
        }

        @Override
        protected Item checkItem() {
            return null;
        }

        @Override
        protected void placeItem() {
            // Place quest item
        }
    };

    private static final Kevin.QuestHandler dustQuest = new Kevin.QuestHandler() {
        {
            NPC_KEVIN_Q1 = "Q2.1";
            NPC_KEVIN_Q2 = "Q2.2";
        }

        @Override
        protected Item checkItem() {
            return null;
        }

        @Override
        protected void placeItem() {
            // Place quest item
        }
    };

    private static final Kevin.QuestHandler fishQuest = new Kevin.QuestHandler() {
        {
            NPC_KEVIN_Q1 = "Q3.1";
            NPC_KEVIN_Q2 = "Q3.2";
        }

        @Override
        protected Item checkItem() {
            return null;
        }

        @Override
        protected void placeItem() {
            // Place quest item
        }
    };
}
