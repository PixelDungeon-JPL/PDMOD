package com.jpl.pdmod.windows;

import com.jpl.pdmod.data.HeroData;
import com.jpl.pdmod.npcs.Kevin;
import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.utils.GLog;
import com.watabou.pixeldungeon.utils.Utils;
import com.watabou.pixeldungeon.windows.WndQuest;

/**
 * Created by Freddy on 05.04.2017.
 */
public class WndKevin extends WndQuest {
    private static final String TXT_MESSAGE	=
            "Oh, I see you have succeeded! I do hope it hasn't troubled you too much. " +
                    "As I promised, you can choose one of my high quality wands.";
    private static final String TXT_BATTLE		= "Battle wand";
    private static final String TXT_NON_BATTLE	= "Non-battle wand";

    private static final String TXT_FARAWELL	= "Good luck in your quest, %s!";

    private Kevin kevin;
    private Item questItem;


    public WndKevin(final Kevin kevin, final Item item ) {

        super( kevin, TXT_MESSAGE, TXT_BATTLE, TXT_NON_BATTLE );

        this.kevin = kevin;
        questItem = item;
    }

    @Override
    protected void onSelect( int index ) {
        // Kevin Quest

        kevin.yell( Utils.format( TXT_FARAWELL, Dungeon.hero.className() ) );
        kevin.destroy();

        kevin.sprite.die();

        Kevin.Quest.complete();
    }
}
