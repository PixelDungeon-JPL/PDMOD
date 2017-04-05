package com.jpl.pdmod.items;

import com.watabou.pixeldungeon.actors.hero.Hero;
import com.watabou.pixeldungeon.items.scrolls.ScrollOfUpgrade;
import com.watabou.pixeldungeon.items.weapon.melee.MeleeWeapon;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.pixeldungeon.utils.GLog;
import com.watabou.utils.Bundle;

import java.util.ArrayList;

/**
 * Created by Freddy on 05.04.2017.
 */
public class ElectricSword extends MeleeWeapon {
    private int hitCount = 0;
    private int neededHits = 20;

    {
        name = "Elektro Schwert";
        image = ItemSpriteSheet.ELECTRIC_SWORD;
    }

    public ElectricSword() {
        super(1, 1.4f, 1);
    }

    @Override
    public ArrayList<String> actions(Hero hero) {
        return super.actions(hero);
    }

    public static final String HITS = "hits";
    public static final String NEEDED = "needed";

    @Override
    public void storeInBundle(Bundle bundle) {
        super.storeInBundle(bundle);
        bundle.put(HITS, hitCount);
        bundle.put(NEEDED, neededHits);
    }

    @Override
    public void restoreFromBundle(Bundle bundle) {
        super.restoreFromBundle(bundle);
        hitCount = bundle.getInt(HITS);
        neededHits = bundle.getInt(NEEDED);
    }

    @Override
    public int damageRoll(Hero hero) {
        hitCount++;

        if (hitCount >= neededHits) {
            GLog.p("Dein Schwert wurde verbessert.");
            new ScrollOfUpgrade().onItemSelected(this);
            hitCount = 0;
            neededHits += 10;
        }

        return super.damageRoll(hero);
    }

    @Override
    public String desc() {
        return "Ein Schwert, das sich selbst verbessert. Du musst fuer ein Upgrade noch " + (50 - hitCount) + " mal schlagen.";
    }

    @Override
    public int typicalSTR() {
        return 11; // CHANGED: Change to 13
    }

    @Override
    protected int max0() {
        return 8;
    }
}
