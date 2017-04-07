package com.jpl.pdmod.items;

import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.utils.Bundle;

/**
 * Created by jan-torbensendke on 07.04.17.
 */
public class Shovel extends Item {

    {
        name = "Schaufel";
        stackable = false;
        image = ItemSpriteSheet.SHOVEL;
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
    public String desc() {
        return "Das ist eine Schaufel. Damit kannst du Erdhuegel entfernen und so tolle Items finden! Aber gib acht... unter den Erdhuegeln kann sich auch Boeses befinden.";
    }

    @Override
    public int price() {
        return 80 * quantity;
    }
}
