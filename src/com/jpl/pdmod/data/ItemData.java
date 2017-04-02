package com.jpl.pdmod.data;

/**
 * Created by Luis Michaelis on 01.04.2017.
 */
public class ItemData {
    ///////////////////////////////////////////////////////////////////////////
    // Armor
    ///////////////////////////////////////////////////////////////////////////

    public class Armor{
        // Commons
        public static final String ARMOR_TXT_EQUIP_CURSED = "your %s constricts around you painfully";
        public static final String ARMOR_TXT_TO_STRING = "%s :%d";
        public static final String ARMOR_TXT_BROKEN = "broken %s :%d";
        public static final String ARMOR_TXT_INCOMPATIBLE = "Interaction of different types of magic has erased the glyph on this armor!";
        public static final String ARMOR_TXT_INFO_KNOWN = "\n\nThis %d provides damage absorption up to %d points per attack. ";
        public static final String ARMOR_TXT_INFO_UNKNOWN = "\n\nTypical %d provides damage absorption up to %d points per attack and requires %d points of strength. ";
        public static final String ARMOR_TXT_INFO_INADEQUATE_STR_WEARING = "\n\nBecause of your inadequate strength your movement speed and defense skill is decreased. ";
        public static final String ARMOR_TXT_INFO_INADEQUATE_STR_INVENTORY = "\n\nBecause of your inadequate strength wearing this armor will decrease your movement speed and defense skill. ";
        public static final String ARMOR_TXT_TOO_HEAVY = "Probably this armor is too heavy for you. ";
        public static final String ARMOR_TXT_ENCHANTED = "It is enchanted.";
        public static final String ARMOR_TXT_WEARING = "\n\nYou are wearing the%d, %d";
        public static final String ARMOR_TXT_CURSE_KNOWN = "\n\nYou can feel a malevolent magic lurking within the %d.";
        public static final String ARMOR_TXT_LOW_HEALTH = "Your health is too low!";
        public static final String ARMOR_TXT_NOT_EQUIPPED = "You need to be wearing this armor to use its special power!";
        public static final String ARMOR_TXT_AWESOME = "The thing looks awesome!";

        // Cloth
        public static final String ARMOR_CLOTH_NAME = "cloth armor";
        public static final String ARMOR_CLOTH_DESC = "This lightweight armor offers basic protection.";

        // Huntress
        public static final String ARMOR_HUNTRESS_TXT_NO_ENEMIES = "No enemies in sight";
        public static final String ARMOR_HUNTRESS_TXT_NOT_HUNTRESS = "Only huntresses can use this armor!";
        public static final String ARMOR_HUNTRESS_NAME = "huntress cloak";
        public static final String ARMOR_HUNTRESS_DESC = "A huntress in such cloak can create a fan of spectral blades. Each of these blades will target a single enemy in the huntress's field of view, inflicting damage depending on her currently equipped melee weapon.";
        public static final String ARMOR_HUNTRESS_AC_SPECIAL = "SPECTRAL BLADES";

        // Leather
        public static final String ARMOR_LEATHER_NAME = "leather armor";
        public static final String ARMOR_LEATHER_DESC = "Armor made from tanned monster hide. Not as light as cloth armor but provides better protection.";

        // Mage
        public static final String ARMOR_MAGE_AC_SPECIAL = "MOLTEN EARTH";
        public static final String ARMOR_MAGE_TXT_NOT_MAGE = "Only mages can use this armor!";
        public static final String ARMOR_MAGE_NAME = "mage robe";
        public static final String ARMOR_MAGE_DESC = "Wearing this gorgeous robe, a mage can cast a spell of molten earth: all the enemies in his field of view will be set on fire and unable to move at the same time.";

        // Mail
        public static final String ARMOR_MAIL_NAME = "mail armor";
        public static final String ARMOR_MAIL_DESC = "Interlocking metal links make for a tough but flexible suit of armor.";

        // Plate
        public static final String ARMOR_PLATE_NAME = "plate armor";
        public static final String ARMOR_PLATE_DESC = "Enormous plates of metal are joined together into a suit that provides unmatched protection to any adventurer strong enough to bear its staggering weight.";

        // Rogue
        public static final String ARMOR_ROGUE_TXT_FOV = "You can only jump to an empty location in your field of view";
        public static final String ARMOR_ROGUE_TXT_NOT_ROGUE = "Only rogues can use this armor!";
        public static final String ARMOR_ROGUE_AC_SPECIAL = "SMOKE RESULT_BOMB";
        public static final String ARMOR_ROGUE_NAME = "rogue garb";
        public static final String ARMOR_ROGUE_DESC = "Wearing this dark garb, a rogue can perform a trick, that is called \"smoke bomb\"(though no real explosives are used): he blinds enemies who could see him and jumps aside.";
        public static final String ARMOR_ROGUE_TXT_TELEPORT = "Choose a location to jump to";

        // Scale
        public static final String ARMOR_SCALE_NAME = "scale armor";
        public static final String ARMOR_SCALE_DESC = "The metal scales sewn onto a leather vest create a flexible, yet protective armor.";

        // Warrior
        public static final String ARMOR_WARRIOR_AC_SPECIAL = "HEROIC LEAP";
        public static final String ARMOR_WARRIOR_TXT_NOT_WARRIOR = "Only warriors can use this armor!";
        public static final String ARMOR_WARRIOR_NAME = "warrior suit of armor";
        public static final String ARMOR_WARRIOR_DESC = "While this armor looks heavy, it allows a warrior to perform heroic leap towards a targeted location, slamming down to stun all neighbouring enemies.";
        public static final String ARMOR_WARRIOR_TXT_LEAP = "Choose direction to leap";

        // Glyphs
        public static final String ARMOR_GLYPH_ANTI_ENTROPY = "%s of anti-entropy";
        public static final String ARMOR_GLYPH_AFFECTION = "%s of affection";
        public static final String ARMOR_GLYPH_AUTO_REPAIR = "%s of auto-repair";
        public static final String ARMOR_GLYPH_BOUNCE = "%s of bounce";
        public static final String ARMOR_GLYPH_DISPLACEMENT = "%s of displacement";
        public static final String ARMOR_GLYPH_ENTANGLEMENT = "%s of entanglement";
        public static final String ARMOR_GLYPH_METABOLISM = "%s of metabolism";
        public static final String ARMOR_GLYPH_MULTIPLICITY = "%s of multiplicity";
        public static final String ARMOR_GLYPH_STENCH = "%s of stench";
        public static final String ARMOR_GLYPH_POTENTIAL = "%s of potential";
        public static final String ARMOR_GLYPH_VISCOSITY = "%s of viscosity";
    }

    ///////////////////////////////////////////////////////////////////////////
    // BAG
    ///////////////////////////////////////////////////////////////////////////

    public class Bag {
        public static final String BAG_SCROLL_NAME = "scroll holder";
        public static final String BAG_SCROLL_DESC = "You can place any number of scrolls into this tubular container. It saves room in your backpack and protects scrolls from fire.";
        public static final String BAG_SEED_NAME = "seed pouch";
        public static final String BAG_SEED_DESC = "This small velvet pouch allows you to store any number of seeds in it. Very convenient.";
        public static final String BAG_WAND_NAME = "wand holster";
        public static final String BAG_WAND_DESC = "This slim holder is made of leather of some exotic animal. It allows to compactly carry up to %d wands.";
        public static final String BAG_KEY_NAME = "key ring";
        public static final String BAG_KEY_DESC = "This is a copper key ring, that lets you keep all your keys separately from the rest of your belongings.";
    }

    ///////////////////////////////////////////////////////////////////////////
    // FOOD
    ///////////////////////////////////////////////////////////////////////////

    public class Food {
        // Chargrilled
        public static final String FOOD_CHARGRILLED_NAME = "chargrilled meat";
        public static final String FOOD_CHARGRILLED_DESC = "It looks like a decent steak.";
        public static final String FOOD_RATION_MSG = "That food tasted delicious!";

        // Ration
        public static final String FOOD_RATION_NAME = "ration of food";
        public static final String FOOD_RATION_DESC = "Nothing fancy here: dried meat, " +
                "some biscuits - things like that.";

        // Carpaccio
        public static final String FOOD_CARPACCIO_NAME = "frozen carpaccio";
        public static final String FOOD_CARPACCIO_TXT_INVISIBLE = "You see your hands turn invisible!";
        public static final String FOOD_CARPACCIO_TXT_BARKSKIN = "You feel your skin hardens!";
        public static final String FOOD_CARPACCIO_TXT_REFRESHING = "Refreshing!";
        public static final String FOOD_CARPACCIO_HEALING = "You feel better!";
        public static final String FOOD_CARPACCIO_DESC = "It's a piece of frozen raw meat. The only way to eat it is " +
                "by cutting thin slices of it. And this way it's suprisingly good.";

        // Mystery
        public static final String FOOD_MYSTERY_NAME = "mystery meat";
        public static final String FOOD_MYSTERY_MSG = "That food tasted... strange.";
        public static final String FOOD_MYSTERY_TXT_HOT = "Oh it's hot!";
        public static final String FOOD_MYSTERY_TXT_ROOTS = "You can't feel your legs!";
        public static final String FOOD_MYSTERY_TXT_POISON = "You are not feeling well.";
        public static final String FOOD_MYSTERY_TXT_SLOW = "You are stuffed.";
        public static final String FOOD_MYSTERY_DESC = "Eat at your own risk!";

        // Overpriced
        public static final String FOOD_OVERPRICED_NAME = "overpriced food ration";
        public static final String FOOD_OVERPRICED_MSG = "That food tasted ok.";
        public static final String FOOD_OVERPRICED_DESC = "It looks exactly like a standard ration of food but smaller.";

        // Pasty
        public static final String FOOD_PASTY_NAME = "pasty";
        public static final String FOOD_PASTY_DESC = "This is authentic Cornish pasty with traditional filling of beef and potato.";
    }

    ///////////////////////////////////////////////////////////////////////////
    // KEYS
    ///////////////////////////////////////////////////////////////////////////

    public class Key {
        public static final String KEY_GOLDEN_NAME = "golden key";
        public static final String KEY_GOLDEN_DESC = "The notches on this golden key are tiny and intricate. Maybe it can open some chest lock?";

        public static final String KEY_IRON_NAME = "iron key";
        public static final String KEY_IRON_DESC = "The notches on this ancient iron key are well worn; its leather lanyard is battered by age. What door might it open?";
        public static final String KEY_IRON_TXT_DEPTH = "iron key from depth %d";

        public static final String KEY_SKELETON_NAME = "skeleton key";
        public static final String KEY_SKELETON_DESC = "This key looks serious: its head is shaped like a skull. Probably it can open some serious door.";
    }

    ///////////////////////////////////////////////////////////////////////////
    // POTIONS
    ///////////////////////////////////////////////////////////////////////////

    public class Potion {
        public static final String POTION_TXT_BENEFICIAL = "Beneficial potion";
        public static final String POTION_TXT_YES = "Yes, I know what I'm doing";
        public static final String POTION_TXT_NO = "No, I changed my mind";
        public static final String POTION_TXT_SURE_DRINK = "Are you sure you want to drink it? In most cases you should throw such potions at your enemies.";
        public static final String POTION_TXT_SURE_THROW = "Are you sure you want to throw it? In most cases it makes sense to drink it.";
        public static final String POTION_TXT_HARMFUL = "Harmful potion!";
        public static final String POTION_TXT_SPLASH_HARMLESS = "The flask shatters and %s liquid splashes harmlessly";
        public static final String POTION_NAME = " potion";
        public static final String POTION_DEFAULT_INFO = "This flask contains a swirling %s liquid. Who knows what it will do when drunk or thrown?";

        public static final String POTION_EXPERIENCE_NAME = "Potion of Experience";
        public static final String POTION_EXPERIENCE_DESC = "The storied experiences of multitudes of battles reduced to liquid form, this draught will instantly raise your experience level.";

        public static final String POTION_FROST_NAME = "Potion of Frost";
        public static final String POTION_FROST_DESC = "Upon exposure to open air, this chemical will evaporate into a freezing cloud, causing any creature that contacts it to be frozen in place, unable to act and move.";

        public static final String POTION_HEALING_NAME = "Potion of Healing";
        public static final String POTION_HEALING_MSG = "Your wounds heal completely.";
        public static final String POTION_HEALING_DESC = "An elixir that will instantly return you to full health and cure poison.";

        public static final String POTION_INVISIBILITY_NAME = "Potion of Invisibility";
        public static final String POTION_INVISIBILITY_DESC = "Drinking this potion will render you temporarily invisible. While invisible, enemies will be unable to see you. Attacking an enemy, as well as using a wand or a scroll before enemy's eyes, will dispel the effect.";

        public static final String POTION_INVISIBILITY_MSG = "You see your hands turn invisible!";
        public static final String POTION_LEVITATION_NAME = "Potion of Levitation";
        public static final String POTION_LEVITATION_MSG = "You float into the air!";
        public static final String POTION_LEVITATION_DESC = "Drinking this curious liquid will cause you to hover in the air, able to drift effortlessly over traps. Flames and gases fill the air, however, and cannot be bypassed while airborne.";

        public static final String POTION_FLAME_NAME = "Potion of Liquid Flame";
        public static final String POTION_FLAME_DESC = "This flask contains an unstable compound which will burst violently into flame upon exposure to open air.";

        public static final String POTION_MIGHT_NAME = "Potion of Might";
        public static final String POTION_MIGHT_MSG = "Newfound strength surges through your body.";
        public static final String POTION_MIGHT_SPRITE = "+1 str, +5 ht";
        public static final String POTION_MIGHT_DESC = "This powerful liquid will course through your muscles, permanently increasing your strength by one point and health by five points.";

        public static final String POTION_VISION_NAME = "Potion of Mind Vision";
        public static final String POTION_VISION_MSG_MOBS = "You can somehow feel the presence of other creatures' minds!";
        public static final String POTION_VISION_MSG_NO_MOBS = "You can somehow tell that you are alone on this level at the moment.";
        public static final String POTION_VISION_DESC = "After drinking this, your mind will become attuned to the psychic signature of distant creatures, enabling you to sense biological presences through walls. Also this potion will permit you to see through nearby walls and doors.";

        public static final String POTION_GAS_PARALYTIC_NAME = "Potion of Paralytic Gas";
        public static final String POTION_GAS_PARALYTIC_DESC = "Upon exposure to open air, the liquid in this flask will vaporize into a numbing yellow haze. Anyone who inhales the cloud will be paralyzed instantly, unable to move for some time after the cloud dissipates. This item can be thrown at distant enemies to catch them within the effect of the gas.";

        public static final String POTION_PURITY_TXT_FRESHNESS = "You feel uncommon freshness in the air.";
        public static final String POTION_PURITY_TXT_NO_SMELL = "You've stopped sensing any smells!";
        public static final String POTION_PURITY_NAME = "Potion of Purification";
        public static final String POTION_PURITY_DESC = "This reagent will quickly neutralize all harmful gases in the area of effect. Drinking it will give you a temporary immunity to such gases.";

        public static final String POTION_STRENGTH_NAME = "Potion of Strength";
        public static final String POTION_STRENGTH_SPRITE = "+1 str";
        public static final String POTION_STRENGTH_MSG = "Newfound strength surges through your body.";
        public static final String POTION_STRENGTH_DESC = "This powerful liquid will course through your muscles, permanently increasing your strength by one point.";

        public static final String POTION_GAS_TOXIC_NAME = "Potion of Toxic Gas";
        public static final String POTION_GAS_TOXIC_DESC = "Uncorking or shattering this pressurized glass will cause its contents to explode into a deadly cloud of toxic green gas. You might choose to fling this potion at distant enemies instead of uncorking it by hand.";

        public static final String POTION_SATISFY_NAME = "potion of satisfy";
        public static final String POTION_SATISFY_DESC = "You won't be hungry after drinking this elixir";
        public static final String POTION_SATISFY_MSG = "You feel satisfied.";
    }

    ///////////////////////////////////////////////////////////////////////////
    // QUEST
    ///////////////////////////////////////////////////////////////////////////

    public class Quest {
        public static final String ITEM_QUEST_CORPSE_DUST_NAME = "corpse dust";
        public static final String ITEM_QUEST_CORPSE_DUST_DESC = "The ball of corpse dust doesn't differ outwardly from a regular dust ball. However, you know somehow that it's better to get rid of it as soon as possible.";
        public static final String ITEM_QUEST_GOLD_ORE_NAME = "dark gold ore";
        public static final String ITEM_QUEST_GOLD_ORE_DESC = "This metal is called dark not because of its color (it doesn't differ from the normal gold), but because it melts under the daylight, making it useless on the surface.";
        public static final String ITEM_QUEST_ROSE_NAME = "dried rose";
        public static final String ITEM_QUEST_ROSE_DESC = "The rose has dried long ago, but it has kept all its petals somehow.";
        public static final String ITEM_QUEST_DWARF_TOKEN_NAME = "dwarf token";
        public static final String ITEM_QUEST_DWARF_TOKEN_DESC = "Many dwarves and some of their larger creations carry these small pieces of metal of unknown purpose. Maybe they are jewelry or maybe some kind of ID. Dwarves are strange folk.";
        public static final String ITEM_QUEST_PHANTOM_FISH_NAME = "phantom fish";
        public static final String ITEM_QUEST_PHANTOM_FISH_MSG = "You see your hands turn invisible!";
        public static final String ITEM_QUEST_PHANTOM_FISH_DESC = "You can barely see this tiny translucent fish in the air. In the water it becomes effectively invisible.";
        public static final String ITEM_QUEST_PICKAXE_TXT_NO_VEIN = "There is no dark gold vein near you to mine";
        public static final String ITEM_QUEST_PICKAXE_NAME = "pickaxe";
        public static final String ITEM_QUEST_PICKAXE_DESC = "This is a large and sturdy tool for breaking rocks. Probably it can be used as a weapon.";
        public static final String ITEM_QUEST_RAT_SKULL_NAME = "giant rat skull";
        public static final String ITEM_QUEST_RAT_SKULL_DESC = "It could be a nice hunting trophy, but it smells too bad to place it on a wall.";
    }
}
