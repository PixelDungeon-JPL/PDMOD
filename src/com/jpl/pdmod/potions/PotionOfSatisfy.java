package com.jpl.pdmod.potions;

import com.jpl.pdmod.data.ItemData;
import com.watabou.pixeldungeon.actors.buffs.*;
import com.watabou.pixeldungeon.actors.hero.Hero;
import com.watabou.pixeldungeon.effects.Speck;
import com.watabou.pixeldungeon.items.potions.Potion;
import com.watabou.pixeldungeon.utils.GLog;

/**
 * Created by Freddy on 02.04.2017.
 */
public class PotionOfSatisfy extends Potion {

    {
        name = ItemData.Potion.POTION_SATISFY_NAME;
    }

    @Override
    protected void apply( Hero hero ) {
        setKnown();
        hero.buff(Hunger.class).satisfy(Hunger.STARVING);
        hero.sprite.emitter().start( Speck.factory( Speck.LIGHT ), 0.4f, 4 );

        GLog.p(ItemData.Potion.POTION_SATISFY_MSG);
    }

    @Override
    public String desc() {
        return ItemData.Potion.POTION_SATISFY_DESC;
    }

    @Override
    public int price() {
        return isKnown() ? 60 * quantity : super.price();
    }
}
