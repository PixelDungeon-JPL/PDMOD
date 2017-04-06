package com.jpl.pdmod.items;

import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.actors.Char;
import com.watabou.pixeldungeon.actors.buffs.Buff;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.items.bags.Bag;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.pixeldungeon.utils.GLog;

/**
 * Created by Freddy on 06.04.2017.
 */
public class Knuffi extends Item {
    private int lastDepth = 0;
    private Charger charger;

    {
        stackable = false;
        name = "Ei";
        image = ItemSpriteSheet.KEVINS_KNUFFI;
    }

    @Override
    public boolean isUpgradable() {
        return false;
    }

    @Override
    public boolean isIdentified() {
        return true;
    }

    @Override
    public boolean collect( Bag container ) {
        if (super.collect( container )) {
            if (container.owner != null) {
                charge( container.owner );
            }
            return true;
        } else {
            return false;
        }
    };

    public void charge( Char owner ) {
        if (charger == null) {
            (charger = new Charger(this)).attachTo( owner );
        }
    }

    @Override
    public String info() {
        return
                "Das ist ein Ei! Brüte es aus um ein tolles Gechenk zu erhalten...";
    }

    @Override
    public int price() {
        return 100 * quantity;
    }


    protected class Charger extends Buff {
        private Knuffi ei;
        public Charger(Knuffi ei){
            this.ei = ei;
        }

        @Override
        public boolean attachTo( Char target ) {
            super.attachTo( target );

            return true;
        }

        @Override
        public boolean act() {
            if (lastDepth != Dungeon.depth) {
                GLog.p("Du warst zu lange weg. Kevin ist sauer!");
                // TODO: Kevin follow
            }
            lastDepth = Dungeon.depth;
            return super.act();
        }
    }
}
