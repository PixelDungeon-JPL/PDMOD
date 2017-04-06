package com.jpl.pdmod.items;

import com.jpl.pdmod.data.ItemData;
import com.watabou.pixeldungeon.actors.buffs.*;
import com.watabou.pixeldungeon.actors.hero.Hero;
import com.watabou.pixeldungeon.effects.Speck;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.items.food.Food;
import com.watabou.pixeldungeon.items.food.FrozenCarpaccio;
import com.watabou.pixeldungeon.items.food.MysteryMeat;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.pixeldungeon.utils.GLog;
import com.watabou.utils.Random;

/**
 * Created by jan-torbensendke on 06.04.17.
 */
public class Apple extends Food {

    {
        name = "Apfel";
        image = ItemSpriteSheet.APPLE;
        energy = 150;
        stackable = true;
    }

    @Override
    public void execute(Hero hero, String action ) {

        super.execute( hero, action );

        if (action.equals( AC_EAT )) {

        }
    }

    @Override
    public String info() {
        return "Das ist ein Apfel... Guten Apetit!";
    }

    public int price() {
        return 10 * quantity;
    };

}
