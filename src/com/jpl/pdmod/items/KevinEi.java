package com.jpl.pdmod.items;

import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.items.bags.Bag;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;

/**
 * Created by jan-torbensendke on 06.04.17.
 */
public class KevinEi extends Item {

    {
        stackable = false;
        name = "Ei";
        image = ItemSpriteSheet.BAG_UPGRADE; //TODO
    }

    @Override
    public String status() {
        return "";

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
    public boolean collect(Bag container) {
        return super.collect();
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

}
