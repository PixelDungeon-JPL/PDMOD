package com.jpl.pdmod.npcs;

import com.jpl.pdmod.Values;
import com.jpl.pdmod.items.KevinEi;
import com.jpl.pdmod.windows.WndKevin;
import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.Journal;
import com.watabou.pixeldungeon.actors.Actor;
import com.watabou.pixeldungeon.actors.Char;
import com.watabou.pixeldungeon.actors.buffs.Buff;
import com.watabou.pixeldungeon.actors.mobs.npcs.NPC;
import com.watabou.pixeldungeon.actors.mobs.npcs.Wandmaker;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.levels.Room;
import com.watabou.pixeldungeon.levels.SewerLevel;
import com.watabou.pixeldungeon.levels.Terrain;
import com.watabou.pixeldungeon.scenes.GameScene;
import com.watabou.pixeldungeon.sprites.WandmakerSprite;
import com.watabou.pixeldungeon.utils.GLog;
import com.watabou.pixeldungeon.utils.Utils;
import com.watabou.pixeldungeon.windows.WndQuest;
import com.watabou.utils.Bundle;
import com.watabou.utils.Random;

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
        sprite.turnTo( pos, Dungeon.hero.pos );
        Kevin.Quest.type.handler.interact( this );
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
            ILLEGAL( null ), EI(eiQuest)/*, DUST( dustQuest ), FISH( fishQuest )*/;

            public Kevin.QuestHandler handler;
            Type( Kevin.QuestHandler handler ) {
                this.handler = handler;
            }
        }

        private static Type type;

        private static boolean spawned;
        private static boolean given;

        public static void reset() {
            spawned = false;
        }

        private static final String NODE		= "kevin";

        private static final String SPAWNED		= "spawned";
        private static final String TYPE		= "type";
        private static final String GIVEN		= "given";

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

            spawned = node.getBoolean(SPAWNED);

            if (spawned){
                type = Type.valueOf(node.getString(TYPE));
                given = node.getBoolean(GIVEN);
            }
        }

        public static void spawn(SewerLevel level, Room room ) {
            if (!spawned && Dungeon.depth > 6 && Random.Int( 10 - Dungeon.depth ) == 0 || Values.DO_SPAWN_KEVIN_LEVEL_1) {

                Kevin npc = new Kevin();
                do {
                    npc.pos = room.random();
                } while (level.map[npc.pos] == Terrain.ENTRANCE || level.map[npc.pos] == Terrain.SIGN);
                level.mobs.add( npc );
                Actor.occupyCell( npc );

                spawned = true;
                switch (Random.Int( 1 )) {
                    case 0:
                        type = Kevin.Quest.Type.EI;
                        break;
                    /*
                    case 1:
                        type = Kevin.Quest.Type.DUST;
                        break;
                    case 2:
                        type = Kevin.Quest.Type.FISH;
                        break;
                    */
                }

                given = false;
            }
        }

        public static void complete() {
            Journal.remove( Journal.Feature.KEVIN );
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


                if (!giveItem()){
                    GLog.n("Du hast keinen platz!");
                } else {
                    Quest.given = true;
                    Journal.add( Journal.Feature.KEVIN );
                }
            }
        }

        abstract protected Item checkItem();
        abstract protected boolean giveItem();
    }

    private static final Kevin.QuestHandler eiQuest = new Kevin.QuestHandler() {
        {
            NPC_KEVIN_Q1 = "Kannst du bitte dieses Ei für mich aubrueten? Lauf damit 10 Schritte, dann komm zurück!";
            NPC_KEVIN_Q2 = "Das Ei sollst du ausbrueten!";
        }

        @Override
        protected Item checkItem() {
            return Dungeon.hero.belongings.getItem(KevinEi.class);
        }

        @Override
        protected boolean giveItem() {
            return new KevinEi().collect(Dungeon.hero.belongings.backpack);
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
        protected boolean giveItem() {
            // Place quest item
            return false;
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
        protected boolean giveItem() {
            // Place quest item
            return false;
        }
    };
}
