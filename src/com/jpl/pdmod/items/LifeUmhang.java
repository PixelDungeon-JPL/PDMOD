package com.jpl.pdmod.items;

import com.watabou.pixeldungeon.actors.hero.Hero;
import com.watabou.pixeldungeon.effects.Speck;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.items.bags.Bag;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.pixeldungeon.utils.GLog;

import java.util.ArrayList;

/**
 * Created by Jan-Torben Sendke on 06.04.17.
 */
public class LifeUmhang extends Item {
    public static final String AC_DRINK = "DRINK";
    private int lifelvl = 0;

    {
        stackable = false;
        name = "LifeUmhang";
        image = ItemSpriteSheet.LIFE_UMHANG;
    }

    @Override
    public ArrayList<String> actions(Hero hero) {
        ArrayList<String> actions = super.actions(hero);
        if (lifelvl > 0) {
            actions.add(AC_DRINK);

        }
        return actions;

    }

    @Override
    public void execute(Hero hero, String action) {
        if (action.equals(AC_DRINK)) {
            int missHp = hero.HT -hero.HP;
            int after = hero.HP + lifelvl;
            if (after <= hero.HT) {
                hero.HP += lifelvl;
                lifelvl = 0;
            }
            else {
                hero.HP = hero.HT;
                lifelvl -= missHp;
            }

            hero.sprite.emitter().start( Speck.factory( Speck.HEALING ), 0.4f, 4 );
        }
        else {
            super.execute(hero, action);
        }
    }


    public void addLife (int life) {
        int after = lifelvl + life;

        if (after > 10){
            lifelvl = 10;
        } else {
            lifelvl = after;
        }
    }


    @Override
    public String status() {

        return lifelvl + "/10";
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
    public String info() {
        return
                "Dieser Umhang kann das Leben speichern, welches durch ueberheilen verloren gehen wuerde.";
    }

    @Override
    public int price() {
        return 100 * quantity;
    }

}
