package com.jpl.pdmod.data;

import com.jpl.pdmod.RLoader;

/**
 * Created by Luis Michaelis on 31.03.2017.
 * Updated by Jan-Torben Sendke on 01.04.2017
 * Updated by Jan-Torben Sendke 02-04-2017
 */
public class HeroData {
    ///////////////////////////////////////////////////////////////////////////
    // DEATH
    ///////////////////////////////////////////////////////////////////////////

    public static class Death {

        public static final String DEATH_TOXIC_GAS = RLoader.get("HeroData.death.toxicgas");
        public static final String DEATH_BLEEDING = RLoader.get("HeroData.death.bleeding");
        public static final String DEATH_FIRE = RLoader.get("HeroData.death.burned");
        public static final String DEATH_HUNGER = RLoader.get("HeroData.death.starved");
        public static final String DEATH_HERO = RLoader.get("HeroData.death.killed");
        public static final String DEATH_DEATHGAZE = RLoader.get("HeroData.death.deathgaze");
        public static final String DEATH_EXPLOSION_BONE = RLoader.get("HeroData.death.bones");
        public static final String DEATH_SHADOWBOLT = RLoader.get("HeroData.death.shadow");
    }

    ///////////////////////////////////////////////////////////////////////////
    // COMMON
    ///////////////////////////////////////////////////////////////////////////

    public static class Common {

        public static final String TXT_LEVEL_UP = RLoader.get("HeroData.Common.levelup");
        public static final String TXT_NEW_LEVEL = RLoader.get("HeroData.Common.newLvl");
        public static final String TXT_YOU_NOW_HAVE	= RLoader.get("HeroData.Common.havenow");
        public static final String TXT_SOMETHING_ELSE	= RLoader.get("HeroData.Common.somethingelse");
        public static final String TXT_LOCKED_CHEST	= RLoader.get("HeroData.Common.chest_locked");
        public static final String TXT_LOCKED_DOOR		= RLoader.get("HeroData.Common.notkey");
        public static final String TXT_NOTICED_SMTH	= RLoader.get("HeroData.Common.noticedsth");
        public static final String TXT_WAIT	= RLoader.get("HeroData.Common.goon");
        public static final String TXT_SEARCH	= RLoader.get("HeroData.Common.search");
        public static final String TXT_LEAVE = RLoader.get("HeroData.Common.dontleave");
        public static final String TXT_ENRAGED = RLoader.get("HeroData.Common.enraged");
        public static final String TXT_DISARM	= RLoader.get("HeroData.Common.knockedouthands");
        public static final String TXT_LIGHTNING_KILLED = RLoader.get("HeroData.Common.death.lightning_bolt");
        public static final String TXT_LOOKS_BETTER	= RLoader.get("HeroData.Common.looks_better_now");
        public static final String TXT_IDENTIFY	= RLoader.get("HeroData.Common.identify_it");
    }


    ///////////////////////////////////////////////////////////////////////////
    // HERO
    ///////////////////////////////////////////////////////////////////////////

    public static class Buff {
        public static final String HERO_TXT_FIRE = RLoader.get("HeroData.Buff.catch.fire");
        public static final String HERO_TXT_PARALYSED = RLoader.get("HeroData.Buff.catch.paralysed");
        public static final String HERO_TXT_POISONED = RLoader.get("HeroData.Buff.catch.poisoned");
        public static final String HERO_TXT_OOZE = RLoader.get("HeroData.Buff.eats_flesh");
        public static final String HERO_TXT_ROOTED = RLoader.get("HeroData.Buff.cantmove");
        public static final String HERO_TXT_WEAKNESS = RLoader.get("HeroData.Buff.weakened");
        public static final String HERO_TXT_BLINDED = RLoader.get("HeroData.Buff.blinded");
        public static final String HERO_TXT_FURIOUS = RLoader.get("HeroData.Buff.furious");
        public static final String HERO_TXT_CHARM = RLoader.get("HeroData.Buff.charmed");
        public static final String HERO_TXT_CRIPPLED = RLoader.get("HeroData.Buff.crippled");
        public static final String HERO_TXT_BLEEDING = RLoader.get("HeroData.Buff.bleeding");
        public static final String HERO_TXT_DIZZY = RLoader.get("HeroData.Buff.spinning");
    }

    ///////////////////////////////////////////////////////////////////////////
    // SPRITE
    ///////////////////////////////////////////////////////////////////////////

    public static class Sprite {
        public static final String SPRITE_FURIOUS = RLoader.get("HeroData.Sprite.furious");
        public static final String SPRITE_ENRAGED = RLoader.get("HeroData.Sprite.enraged");
        public static final String SPRITE_EXCLAMATION = RLoader.get("HeroData.Sprite.!!!");
    }


    ///////////////////////////////////////////////////////////////////////////
    // HERO CLASSES
    ///////////////////////////////////////////////////////////////////////////


    public static class Classes {

        public static final String[] WAR_PERKS = {
            RLoader.get("HeroData.Classes.Warriors.1"),
            RLoader.get("HeroData.Classes.Warriors.2"),
            RLoader.get("HeroData.Classes.Warriors.3"),
            RLoader.get("HeroData.Classes.Warriors.4"),
            RLoader.get("HeroData.Classes.Warriors.5"),
        };
        public static final String[] MAG_PERKS = {
            RLoader.get("HeroData.Classes.Mages.1"),
            RLoader.get("HeroData.Classes.Mages.2"),
            RLoader.get("HeroData.Classes.Mages.3"),
            RLoader.get("HeroData.Classes.Mages.4"),
            RLoader.get("HeroData.Classes.Mages.5")
        };
        public static final String[] ROG_PERKS = {
            RLoader.get("HeroData.Classes.Rogues.1"),
            RLoader.get("HeroData.Classes.Rogues.2"),
            RLoader.get("HeroData.Classes.Rogues.3"),
            RLoader.get("HeroData.Classes.Rogues.4"),
            RLoader.get("HeroData.Classes.Rogues.5"),
            RLoader.get("HeroData.Classes.Rogues.6")
        };
        public static final String[] HUN_PERKS = {
            RLoader.get("HeroData.Classes.Huntresses.1"),
            RLoader.get("HeroData.Classes.Huntresses.2"),
            RLoader.get("HeroData.Classes.Huntresses.3"),
            RLoader.get("HeroData.Classes.Huntresses.4"),
            RLoader.get("HeroData.Classes.Huntresses.5")
        };
    }


    ///////////////////////////////////////////////////////////////////////////
    // SUBCLASSES
    ///////////////////////////////////////////////////////////////////////////

    public static class Subclasses {
        public static final String HERO_SUB_GLADIATOR_NAME = RLoader.get("HeroData.Subclasses.gladiator");
        public static final String HERO_SUB_GLADIATOR_DESC = RLoader.get("HeroData.Subclasses.gladiator.desc --A successful attack with a melee weapon allows the _Gladiator_ to start a combo, in which every next successful hit inflicts more damage.");
        public static final String HERO_SUB_BERSERKER_NAME = RLoader.get("HeroData.Subclasses.berserker");
        public static final String HERO_SUB_BERSERKER_DESC = RLoader.get("HeroData.Subclasses.berserker.desc --When severely wounded, the _Berserker_ enters a state of wild fury significantly increasing his damage output.");
        public static final String HERO_SUB_WARLOCK_NAME = RLoader.get("HeroData.Subclasses.warlock");
        public static final String HERO_SUB_WARLOCK_DESC = RLoader.get("HeroData.Subclasses.warlock.desc --After killing an enemy the _Warlock_ consumes its soul. It heals his wounds and satisfies his hunger.");
        public static final String HERO_SUB_BATTLEMAGE_NAME = RLoader.get("HeroData.Subclasses.battlemage");
        public static final String HERO_SUB_BATTLEMAGE_DESC = RLoader.get("HeroData.Subclasses.battlemage.desc --When fighting with a wand in his hands, the _Battlemage_ inflicts additional damage depending on the current number of charges. Every successful hit restores 1 charge to this wand.");
        public static final String HERO_SUB_ASSASSIN_NAME = RLoader.get("HeroData.Subclasses.assassin");
        public static final String HERO_SUB_ASSASSIN_DESC = RLoader.get("HeroData.Subclasses.assassin.desc --When performing a surprise attack, the _Assassin_ inflicts additional damage to his target.");
        public static final String HERO_SUB_FREERUNNER_NAME = RLoader.get("HeroData.Subclasses.freerunner");
        public static final String HERO_SUB_FREERUNNER_DESC = RLoader.get("HeroData.Subclasses.freerunner.desc --The _Freerunner_ can move almost twice faster, than most of the monsters. When he is running, the Freerunner is much harder to hit. For that he must be unencumbered and not starving.");
        public static final String HERO_SUB_SNIPER_NAME = RLoader.get("HeroData.Subclasses.sniper");
        public static final String HERO_SUB_SNIPER_DESC = RLoader.get("HeroData.Subclasses.sniper.desc --_Snipers_ are able to detect weak points in an enemy's armor, effectively ignoring it when using a missile weapon.");
        public static final String HERO_SUB_WARDEN_NAME = RLoader.get("HeroData.Subclasses.warden");
        public static final String HERO_SUB_WARDEN_DESC = RLoader.get("HeroData.Subclasses.warden.desc --Having a strong connection with forces of nature gives _Wardens_ an ability to gather dewdrops and seeds from plants. Also trampling a high grass grants them a temporary armor buff.");
    }


    ///////////////////////////////////////////////////////////////////////////
    // RESULT DESCRIPTIONS
    ///////////////////////////////////////////////////////////////////////////

    public static class ResultDescriptions {

        // Mobs
        public static final String RESULT_MOB = "Killed by %s on level %d";
        public static final String RESULT_BOSS = "Killed by the %s on level %d";
        // Items
        public static final String RESULT_WAND = "Killed by your own %s on level %d";
        public static final String RESULT_GLYPH = "Killed by the %s on level %d";
        public static final String RESULT_BOMB = "Killed by an explosion of a bomb on level %d";
        // Dungeon features
        public static final String RESULT_TRAP = "Killed by discharge of %s on level %d";
        // Debuffs & blobs
        public static final String RESULT_BURNING = "Burned to death on level %d";
        public static final String RESULT_HUNGER = "Starved to death on level %d";
        public static final String RESULT_POISON = "Died from poison on level %d";
        public static final String RESULT_GAS = "Died from toxic gas on level %d";
        public static final String RESULT_BLEEDING = "Bled to death on level %d";
        public static final String RESULT_OOZE = "Killed by a caustic ooze on level %d";
        public static final String RESULT_FALL = "Fell to death on level %d";
        public static final String RESULT_WIN = "Obtained the Amulet of Yendor";
    }
}
