package com.jpl.pdmod.data;

import com.jpl.pdmod.RLoader;

/**
 * Created by Luis Michaelis on 31.03.2017.
 * Updated by Jan-Torben Sendke on 01.04.2017
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

        public static final String TXT_LEVEL_UP = "level up!";
        public static final String TXT_NEW_LEVEL = "Welcome to level %d! Now you are healthier and more focused. It's easier for you to hit enemies and dodge their attacks.";
        public static final String TXT_YOU_NOW_HAVE	= "You now have %s";
        public static final String TXT_SOMETHING_ELSE	= "There is something else here";
        public static final String TXT_LOCKED_CHEST	= "This chest is locked and you don't have matching key";
        public static final String TXT_LOCKED_DOOR		= "You don't have a matching key";
        public static final String TXT_NOTICED_SMTH	= "You noticed something";
        public static final String TXT_WAIT	= "...";
        public static final String TXT_SEARCH	= "search";
        public static final String TXT_LEAVE = "One does not simply leave Pixel Dungeon.";
        public static final String TXT_ENRAGED = "%s becomes enraged!";
        public static final String TXT_DISARM	= "%s has knocked the %s from your hands!";
        public static final String TXT_LIGHTNING_KILLED = "%s's lightning bolt killed you...";
        public static final String TXT_LOOKS_BETTER	= "your %s certainly looks better now";
        public static final String TXT_IDENTIFY	= "you are now familiar enough with your %s to identify it. It is %s.";
    }


    ///////////////////////////////////////////////////////////////////////////
    // HERO
    ///////////////////////////////////////////////////////////////////////////

    public static class Buff {
        public static final String HERO_TXT_FIRE = "You catch fire!";
        public static final String HERO_TXT_PARALYSED = "You are paralysed!";
        public static final String HERO_TXT_POISONED = "You are poisoned!";
        public static final String HERO_TXT_OOZE = "Caustic ooze eats your flesh. Wash away it!";
        public static final String HERO_TXT_ROOTED = "You can't move!";
        public static final String HERO_TXT_WEAKNESS = "You feel weakened!";
        public static final String HERO_TXT_BLINDED = "You are blinded!";
        public static final String HERO_TXT_FURIOUS = "You become furious!";
        public static final String HERO_TXT_CHARM = "You are charmed!";
        public static final String HERO_TXT_CRIPPLED = "You are crippled!";
        public static final String HERO_TXT_BLEEDING = "You are bleeding!";
        public static final String HERO_TXT_DIZZY = "Everything is spinning around you!";
    }

    ///////////////////////////////////////////////////////////////////////////
    // SPRITE
    ///////////////////////////////////////////////////////////////////////////

    public static class Sprite {
        public static final String SPRITE_FURIOUS = "furious";
        public static final String SPRITE_ENRAGED = "enraged";
        public static final String SPRITE_EXCLAMATION = "!!!";
    }


    ///////////////////////////////////////////////////////////////////////////
    // HERO CLASSES
    ///////////////////////////////////////////////////////////////////////////


    public static class Classes {

        public static final String[] WAR_PERKS = {
            "Warriors start with 11 points of Strength.",
            "Warriors start with a unique short sword. This sword can be later \"reforged\" to upgrade another melee weapon.",
            "Warriors are less proficient with missile weapons.",
            "Any piece of food restores some health when eaten.",
            "Potions of Strength are identified from the beginning.",
        };
        public static final String[] MAG_PERKS = {
            "Mages start with a unique Wand of Magic Missile. This wand can be later \"disenchanted\" to upgrade another wand.",
            "Mages recharge their wands faster.",
            "When eaten, any piece of food restores 1 charge for all wands in the inventory.",
            "Mages can use wands as a melee weapon.",
            "Scrolls of Identify are identified from the beginning."
        };
        public static final String[] ROG_PERKS = {
            "Rogues start with a Ring of Shadows+1.",
            "Rogues identify a type of a ring on equipping it.",
            "Rogues are proficient with light armor, dodging better while wearing one.",
            "Rogues are proficient in detecting hidden doors and traps.",
            "Rogues can go without food longer.",
            "Scrolls of Magic Mapping are identified from the beginning."
        };
        public static final String[] HUN_PERKS = {
            "Huntresses start with 15 points of Health.",
            "Huntresses start with a unique upgradeable boomerang.",
            "Huntresses are proficient with missile weapons and get a damage bonus for excessive strength when using them.",
            "Huntresses gain more health from dewdrops.",
            "Huntresses sense neighbouring monsters even if they are hidden behind obstacles."
        };
    }


    ///////////////////////////////////////////////////////////////////////////
    // SUBCLASSES
    ///////////////////////////////////////////////////////////////////////////

    public static class Subclasses {
        public static final String HERO_SUB_GLADIATOR_NAME = "gladiator";
        public static final String HERO_SUB_GLADIATOR_DESC = "A successful attack with a melee weapon allows the _Gladiator_ to start a combo, in which every next successful hit inflicts more damage.";
        public static final String HERO_SUB_BERSERKER_NAME = "berserker";
        public static final String HERO_SUB_BERSERKER_DESC = "When severely wounded, the _Berserker_ enters a state of wild fury significantly increasing his damage output.";
        public static final String HERO_SUB_WARLOCK_NAME = "warlock";
        public static final String HERO_SUB_WARLOCK_DESC = "After killing an enemy the _Warlock_ consumes its soul. It heals his wounds and satisfies his hunger.";
        public static final String HERO_SUB_BATTLEMAGE_NAME = "battlemage";
        public static final String HERO_SUB_BATTLEMAGE_DESC = "When fighting with a wand in his hands, the _Battlemage_ inflicts additional damage depending on the current number of charges. Every successful hit restores 1 charge to this wand.";
        public static final String HERO_SUB_ASSASSIN_NAME = "assassin";
        public static final String HERO_SUB_ASSASSIN_DESC = "When performing a surprise attack, the _Assassin_ inflicts additional damage to his target.";
        public static final String HERO_SUB_FREERUNNER_NAME = "freerunner";
        public static final String HERO_SUB_FREERUNNER_DESC = "The _Freerunner_ can move almost twice faster, than most of the monsters. When he is running, the Freerunner is much harder to hit. For that he must be unencumbered and not starving.";
        public static final String HERO_SUB_SNIPER_NAME = "sniper";
        public static final String HERO_SUB_SNIPER_DESC = "_Snipers_ are able to detect weak points in an enemy's armor, effectively ignoring it when using a missile weapon.";
        public static final String HERO_SUB_WARDEN_NAME = "warden";
        public static final String HERO_SUB_WARDEN_DESC = "Having a strong connection with forces of nature gives _Wardens_ an ability to gather dewdrops and seeds from plants. Also trampling a high grass grants them a temporary armor buff.";
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
