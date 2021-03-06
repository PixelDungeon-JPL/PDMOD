package com.jpl.pdmod.windows;

import com.jpl.pdmod.items.LifeUmhang;
import com.jpl.pdmod.npcs.Kevin;
import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.actors.hero.Hero;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.utils.Utils;
import com.watabou.pixeldungeon.windows.WndQuest;

/**
 * Created by Freddy on 05.04.2017.
 */
public class WndKevin extends WndQuest {
    private static final String TXT_MESSAGE	= "Ah! Danke.";
    private static final String TXT_TAKE = "Life Unhang";

    private static final String TXT_FARAWELL	= "Good luck in your quest, %s!";

    private Kevin kevin;
    private Item questItem;


    public WndKevin(final Kevin kevin, final Item item ) {

        super( kevin, TXT_MESSAGE, TXT_TAKE);

        this.kevin = kevin;
        questItem = item;
    }

    @Override
    protected void onSelect( int index ) {
        LifeUmhang umhang = new LifeUmhang();
        if (!umhang.collect(Dungeon.hero.belongings.backpack)) {
            umhang.doDrop(Dungeon.hero);
        } else {
            kevin.yell(Utils.format(TXT_FARAWELL, Dungeon.hero.className()));
            kevin.destroy();

            kevin.sprite.die();

            Kevin.Quest.complete();
        }
    }

    @Override
    public void destroy() {
        if (Dungeon.hero.belongings.getItem(LifeUmhang.class) == null){
            new LifeUmhang().doDrop(Dungeon.hero);
        }

        super.destroy();
    }
}
