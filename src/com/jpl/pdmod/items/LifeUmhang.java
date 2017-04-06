package com.jpl.pdmod.items;

import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.items.bags.Bag;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.pixeldungeon.utils.GLog;

/**
 * Created by Jan-Torben Sendke on 06.04.17.
 */
public class LifeUmhang extends Item {

    private int lifelvl = 0;
    {
        stackable = false;
        name = "LifeUmhang";
        image = ItemSpriteSheet.BAG_UPGRADE; //TODO
    }

    @Override
    public String status() {

        return lifelvl + "/ 100";
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

        return true;
    }

    @Override
    public String info() {
        return
                "Dieser Umhang kann das Leben speichern, welches durch ueberheilen verloren gehen wuerde.";
    }

    @Override
    public int price() {
        return 100 * quantity;
    }



}
