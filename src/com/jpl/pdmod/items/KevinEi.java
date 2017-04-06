package com.jpl.pdmod.items;

import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.actors.Char;
import com.watabou.pixeldungeon.actors.buffs.Buff;
import com.watabou.pixeldungeon.actors.hero.Hero;
import com.watabou.pixeldungeon.actors.hero.HeroClass;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.items.bags.Bag;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.pixeldungeon.utils.GLog;

/**
 * Created by jan-torbensendke on 06.04.17.
 */
public class KevinEi extends Item {
    private int steps = 0;
    private Charger charger;

    {
        stackable = false;
        name = "Ei";
        image = ItemSpriteSheet.KEVINS_EGG;
    }

    @Override
    public String status() {
        return steps + "/10";
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
                "Das ist ein Ei! Bruete es aus um ein tolles Gechenk zu erhalten...";
    }

    @Override
    public int price() {
        return 100 * quantity;
    }


    protected class Charger extends Buff {
        private KevinEi ei;
        public Charger(KevinEi ei){
            this.ei = ei;
        }

        @Override
        public boolean attachTo( Char target ) {
            super.attachTo( target );

            return true;
        }

        @Override
        public boolean act() {
            steps++;

            if (steps == 10){
                GLog.p("Kevins Knuffi ist geschluepft. Bring es schnell zurueck, sonst wird Kevin boese!");
                ei.detach(Dungeon.hero.belongings.backpack);
                new Knuffi().collect(Dungeon.hero.belongings.backpack);
            }

            return super.act();
        }
    }
}
