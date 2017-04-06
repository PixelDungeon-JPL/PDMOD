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
    private StepCounter charger;

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
            (charger = new StepCounter(this)).attachTo( owner );
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

    @Override
    protected void onDetach() {
        if (charger != null) {
            charger.detach();
            charger = null;
        }
    }

    protected class StepCounter extends Buff {
        private static final float TIME_TO_CHARGE = 1f;

        private KevinEi ei;
        public StepCounter(KevinEi ei){
            this.ei = ei;
        }

        @Override
        public boolean attachTo( Char target ) {
            super.attachTo( target );

            delay();

            return true;
        }

        @Override
        public boolean act() {
            steps++;

            if (steps == 10){
                GLog.p("Kevins Knuffi ist geschluepft. Bring es schnell zurueck sonst wird Kevin boese!");
                ei.detach(Dungeon.hero.belongings.backpack);
                new Knuffi().collect(Dungeon.hero.belongings.backpack);
                ei = null;
            } else if (steps > 10) {
                diactivate();
            } else {
                delay();
            }


            return true;
        }

        protected void delay() {
            float time2charge = ((Hero)target).heroClass == HeroClass.MAGE ?
                    TIME_TO_CHARGE / (float)Math.sqrt( 1 + effectiveLevel() ) :
                    TIME_TO_CHARGE;
            spend( time2charge );
        }
    }
}
