package com.jpl.pdmod.mobs;

import com.jpl.pdmod.data.MobData;
import com.watabou.pixeldungeon.actors.Char;
import com.watabou.pixeldungeon.actors.buffs.Buff;
import com.watabou.pixeldungeon.actors.buffs.Burning;
import com.watabou.pixeldungeon.actors.buffs.Frost;
import com.watabou.pixeldungeon.actors.mobs.Mob;
import com.watabou.pixeldungeon.actors.mobs.npcs.NPC;
import com.watabou.pixeldungeon.effects.Speck;
import com.watabou.pixeldungeon.items.potions.PotionOfLiquidFlame;
import com.watabou.pixeldungeon.sprites.WandmakerSprite;
import com.watabou.utils.Random;

/**
 * Created by Freddy on 06.04.2017.
 */
public class EvilKevin extends Mob {
    {
        name = "Evil Kevin";
        spriteClass = WandmakerSprite.class; // TODO: Neue sprite

        HP = HT = 65;
        defenseSkill = 20;

        EXP = 10;
        maxLvl = 20;

        flying = true;

        loot = new PotionOfLiquidFlame();
        lootChance = 0.1f;
    }

    @Override
    public int damageRoll() {
        return Random.NormalIntRange( 16, 20 );
    }

    @Override
    public int attackSkill( Char target ) {
        return 25;
    }

    @Override
    public int dr() {
        return 5;
    }

    @Override
    public int attackProc( Char enemy, int damage ) {
        return damage;
    }

    @Override
    public String description() {
        return "Der boese Kevin";
    }


}
