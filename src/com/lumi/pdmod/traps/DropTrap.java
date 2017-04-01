package com.lumi.pdmod.traps;

import android.content.ClipData;
import com.watabou.noosa.audio.Sample;
import com.watabou.pixeldungeon.Assets;
import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.actors.Char;
import com.watabou.pixeldungeon.actors.hero.Belongings;
import com.watabou.pixeldungeon.actors.hero.Hero;
import com.watabou.pixeldungeon.actors.mobs.Mob;
import com.watabou.pixeldungeon.effects.CellEmitter;
import com.watabou.pixeldungeon.effects.Speck;
import com.watabou.pixeldungeon.scenes.GameScene;
import com.watabou.pixeldungeon.utils.GLog;

/**
 * Created by Luis Michaelis on 31.03.2017.
 */
public class DropTrap {

    // 0xDD3333

    public static void trigger( int pos, Hero h) {
        if (Dungeon.visible[pos]) {
            GLog.w( "You loose your items..." );
            Dungeon.level.drop(h.belongings.weapon, pos).sprite.drop();
        }
    }
}
