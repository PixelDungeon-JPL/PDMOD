package com.jpl.pdmod.items;

import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.pixeldungeon.utils.GLog;

/**
 * Created by Freddy on 05.04.2017.
 */
public class Bag extends Item {
    {
        stackable = false;
        name = "Bag";
        image = ItemSpriteSheet.BAG_UPGRADE;
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
    public boolean collect(com.watabou.pixeldungeon.items.bags.Bag container) {
        if (container.size < 27) {
            container.size += 4;
            GLog.p("Du hast nun ein groesseres Inventar");
        } else {
            GLog.n("Du kannst deinen Rucksack nicht mehr verbessern.");
        }
        return true;
    }

    @Override
    public String info() {
        return
                "Wow. Eine Tasche.";
    }

    @Override
    public int price() {
        return 100 * quantity;
    }
}
