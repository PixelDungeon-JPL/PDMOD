package com.jpl.pdmod.plants;

import com.jpl.pdmod.potions.PotionOfSatisfy;
import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.actors.Char;
import com.watabou.pixeldungeon.actors.buffs.Buff;
import com.watabou.pixeldungeon.actors.buffs.Vertigo;
import com.watabou.pixeldungeon.effects.CellEmitter;
import com.watabou.pixeldungeon.effects.particles.EnergyParticle;
import com.watabou.pixeldungeon.plants.Plant;
import com.watabou.pixeldungeon.sprites.PlantSpriteSheet;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;

/**
 * Created by Luis Michaelis on 31.03.2017.
 */
public class Hamp extends Plant {
    {
        image = PlantSpriteSheet.PLANT_HANP;
        plantName = "Hamp";

    }

    @Override
    public void activate( Char ch ) {
        super.activate( ch );

        if (ch != null) {
            Buff.affect( ch, Vertigo.class );
        }

        if (Dungeon.visible[pos]) {
            CellEmitter.center( pos ).start(EnergyParticle.FACTORY, 2, 3 );
        }
    }

    @Override
    public String desc() {
        return "Coming soon";
    }

    public static class Seed extends Plant.Seed {
        {
            plantName = "Hamp";

            name = "seed of " + plantName;
            image = ItemSpriteSheet.SEED_HANP;

            plantClass = Hamp.class;
            alchemyClass = PotionOfSatisfy.class;
        }

        @Override
        public String desc() {
            return "Hallo";
        }
    }
}
