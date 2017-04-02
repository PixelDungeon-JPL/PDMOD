package com.jpl.pdmod.data;

import com.watabou.pixeldungeon.Dungeon;

/**
 * Created by Luis Michaelis on 31.03.2017.
 */
public class MobData {
    ///////////////////////////////////////////////////////////////////////////
    // MOBS
    ///////////////////////////////////////////////////////////////////////////

    public static class Mobs {
        // Albino Rat
        public static final String MOB_RAT_ALBINO_NAME = "albino rat";
        // Fetid Rat
        public static final String MOB_RAT_FETID_NAME = "fetid rat";
        public static final String MOB_RAT_FETID_DEFENSE = "evaded";
        public static final String MOB_RAT_FETID_DESC = "This marsupial rat is much larger than a regular one. It is surrounded by a foul cloud.";
        // Marsupial Rat
        public static final String MOB_RAT_MARSUPIAL_NAME = "marsupial rat";
        public static final String MOB_RAT_MARSUPIAL_DESC = "Marsupial rats are aggressive, but rather weak denizens of the sewers. They can be dangerous only in big numbers.";
        // Bat
        public static final String MOB_BAT_DESC = "These brisk and tenacious inhabitants of cave domes may defeat much larger opponents by replenishing their health with each successful attack.";
        public static final String MOB_BAT_NAME = "vampire bat";
        // Sewer cab
        public static final String MOB_CRAB_NAME = "sewer crab";
        public static final String MOB_CRAB_DESC = "These huge crabs are at the top of the food chain in the sewers. They are extremely fast and their thick exoskeleton can withstand heavy blows.";
        public static final String MOB_CRAB_DEFENSE = "parried";
        // Curse personification
        public static final String MOB_CURSE_NAME = "curse personification";
        public static final String MOB_CURSE_DESC = "This creature resembles the sad ghost, but it swirls with darkness. Its face bears an expression of despair.";
        // Fire Elemental
        public static final String MOB_ELEMENTAL_NAME = "fire elemental";
        public static final String MOB_ELEMENTAL_DESC = "Wandering fire elementals are a byproduct of summoning greater entities. They are too chaotic in their nature to be controlled by even the most powerful demonologist.";
        // Evil Eye
        public static final String MOB_EYE_NAME = "evil eye";
        public static final String MOB_EYE_DESC = "One of this demon's other names is \"orb of hatred\", because when it sees an enemy, it uses its deathgaze recklessly, often ignoring its allies and wounding them.";
        // Golem
        public static final String MOB_GOLEM_NAME = "golem";
        public static final String MOB_GOLEM_DEFENSE = "blocked";
        public static final String MOB_GOLEM_DESC = "The Dwarves tried to combine their knowledge of mechanisms with their newfound power of elemental binding. They used spirits of earth as the \"soul\" for the mechanical bodies of golems, which were believed to be most controllable of all. Despite this, the tiniest mistake in the ritual could cause an outbreak.";
        // Mimic
        public static final String MOB_MIMIC_NAME = "mimic";
        public static final String MOB_MIMIC_DESC = "Mimics are magical creatures which can take any shape they wish. In dungeons they almost always choose a shape of a treasure chest, because they know how to beckon an adventurer.";
        // Dwarf Monk
        public static final String MOB_MONK_NAME = "dwarf monk";
        public static final String MOB_MONK_DEFENSE = "parried";
        public static final String MOB_MONK_DESC = "These monks are fanatics, who devoted themselves to protecting their city's secrets from all aliens. They don't use any armor or weapons, relying solely on the art of hand-to-hand combat.";
        // Piranha
        public static final String MOB_PIRANHA_NAME = "giant piranha";
        public static final String MOB_PIRANHA_DESC = "These carnivorous fish are not natural inhabitants of underground pools. They were bred specifically to protect flooded treasure vaults.";
        // Scorpio
        public static final String MOB_SCORPIO_NAME = "scorpio";
        public static final String MOB_SCORPIO_DESC = "These huge arachnid-like demonic creatures avoid close combat by all means, firing crippling serrated spikes from long distances.";
        // Acidid Scorpio
        public static final String MOB_ACIDIC_NAME = "acidic scorpio";
        // Gnoll Scout
        public static final String MOB_GNOLL_NAME = "gnoll scout";
        public static final String MOB_GNOLL_DESC = "Gnolls are hyena-like humanoids. They dwell in sewers and dungeons, venturing up to raid the surface from time to time. Gnoll scouts are regular members of their pack, they are not as strong as brutes and not as intelligent as shamans.";
        // Gnoll Shaman
        public static final String MOB_SHAMAN_NAME = "gnoll shaman";
        public static final String MOB_SHAMAN_DESC = "The most intelligent gnolls can master shamanistic magic. Gnoll shamans prefer battle spells to compensate for lack of might, not hesitating to use them on those who question their status in a tribe.";
        // Shieled Brute
        public static final String MOB_SHIELDED_NAME = "shielded brute";
        public static final String MOB_SHIELDED_DEFENSE = "blocked";
        // Skeleton
        public static final String MOB_SKELETON_NAME = "skeleton";
        public static final String MOB_SKELETON_DEFENSE = "blocked";
        public static final String MOB_SKELETON_DESC = "Skeletons are composed of corpses bones from unlucky adventurers and inhabitants of the dungeon, animated by emanations of evil magic from the depths below. After they have been damaged enough, they disintegrate in an explosion of bones.";
        // Cave Spinner
        public static final String MOB_SPINNER_NAME = "cave spinner";
        public static final String MOB_SPINNER_MOVE = "These greenish furry cave spiders try to avoid direct combat, preferring to wait in the distance while their victim, entangled in the spinner's excreted cobweb, slowly dies from their poisonous bite.";
        // Animated statue
        public static final String MOB_STATUE_NAME = "animated statue";
        public static final String MOB_STATUE_DESC = "You would think that i's just another ugly statue of this dungeon, but its red glowing eyes give itself away. While the statue itself is made of stone, the _\" + weapon.name() + \"_, it's wielding, looks real.";
        // Succubus
        public static final String MOB_SUCCUBUS_NAME = "succubus";
        public static final String MOB_SUCCUBUS_DESC = "The succubi are demons that look like seductive (in a slightly gothic way) girls. Using its magic, the succubus can charm a hero, who will become unable to attack anything until the charm wears off.";
        // Flies
        public static final String MOB_SWARM_NAME = "swarm of flies";
        public static final String MOB_SWARM_DEFENSE = "evaded";
        public static final String MOB_SWARM_DESC = "The deadly swarm of flies buzzes angrily. Every non-magical attack will split it into two smaller but equally dangerous swarms.";
        // Thief
        public static final String MOB_THIEF_NAME = "crazy thief";
        public static final String MOB_THIEF_DESC = "Deeper levels of the dungeon have always been a hiding place for all kinds of criminals. Not all of them could keep a clear mind during their extended periods so far from daylight. Long ago, these crazy thieves and bandits have forgotten who they are and why they steal.";
        // Bandit
        public static final String MOB_BANDIT_NAME = "crazy bandit";
        // Warlock
        public static final String MOB_DWARF_WARLOCK_NAME = "dwarf warlock";
        public static final String MOB_DWARF_WARLOCK_DESC = "When dwarves' interests have shifted from engineering to arcane arts, warlocks have come to power in the city. They started with elemental magic, but soon switched to demonology and necromancy.";
        // Wraith
        public static final String MOB_WRAITH_NAME = "wraith";
        public static final String MOB_WRAITH_DESC = "A wraith is a vengeful spirit of a sinner, whose grave or tomb was disturbed. Being an ethereal entity, it is very hard to hit with a regular weapon.";
        public static final String MOB_MONK_SENIOR_NAME = "senior monk";
        public static final String MOB_BRUTE_NAME = "gnoll brute";
        public static final String MOB_BRUTE_DESC = "Brutes are the largest, strongest and toughest of all gnolls. When severely wounded, they go berserk, inflicting even more damage to their enemies.";
    }


    ///////////////////////////////////////////////////////////////////////////
    // BOSSES
    ///////////////////////////////////////////////////////////////////////////

    public static class Bosses {

        // GOO
        public static final String MOB_GOO_NAME_1 = "Goo";
        public static final String MOB_GOO_NAME_2 = "spawn of Goo";
        public static final String MOB_GOO_PUMP = "Goo is pumping itself up!";
        public static final String MOB_GOO_GLURP_1 = "glurp... glurp...";
        public static final String MOB_GOO_GLURP_2 = "GLURP-GLURP!";
        public static final String MOB_GOO_DESC = "Little known about The Goo. It's quite possible that it is not even a creature, but rather a conglomerate of substances from the sewers that gained rudiments of free will.";
        // Dwarf King
        public static final String MOB_KING_NAME = "King of Dwarves";
        public static final String MOB_KING_UNDEAD_NAME = "undead King of Dwarves";
        public static final String MOB_KING_DEFENSE = "parried";
        public static final String MOB_KING_KILL = "You cannot kill me, " + Dungeon.hero.heroClass.title() + "... I am... immortal...";
        public static final String MOB_KING_SUMMON = "Arise, slaves!";
        public static final String MOB_KING_NOTICE = "How dare you!";
        public static final String MOB_KING_DESC = "The last king of dwarves was known for his deep understanding of processes of life and death. He has persuaded members of his court to participate in a ritual, that should have granted them eternal youthfulness. In the end he was the only one, who got it - and an army of undead as a bonus.";
        // For Dwarf King
        public static final String MOB_DWARF_UNDEAD_NAME = "undead dwarf";
        public static final String MOB_DWARF_UNDEAD_DEFENSE = "blocked";
        public static final String MOB_DWARF_UNDEAD_DESC = "These undead dwarves, risen by the will of the King of Dwarves, were members of his court. They appear as skeletons with a stunning amount of facial hair.";
        // DM300
        public static final String MOB_DM_300_NAME = "DM-300";
        public static final String MOB_DM_350_NAME = "DM-350";
        public static final String MOB_DM_REPAIR = "DM-300 repairs itself!";
        public static final String MOB_DM_FAILED = "Mission failed. Shutting down.";
        public static final String MOB_DM_NOTICE = "Unauthorised personnel detected.";
        public static final String MOB_DM_DESC = "This machine was created by the Dwarves several centuries ago. Later, Dwarves started to replace machines with golems, elementals and even demons. Eventually it led their civilization to the decline. The DM-300 and similar machines were typically used for construction and mining, and in some cases, for city defense.";
        // Yog
        public static final String MOB_YOG_NAME = "Yog-Dzewa";
        public static final String MOB_YOG_ECHO_NAME = "echo of Yog-Dzewa";
        public static final String MOB_YOG_DESC = "Yog-Dzewa is an Old God, a powerful entity from the realms of chaos. A century ago, the ancient dwarves barely won the war against its army of demons, but were unable to kill the god itself. Instead, they then imprisoned it in the halls below their city, believing it to be too weak to rise ever again.";
        public static final String MOB_YOG_NOTICE = "Hope is an illusion...";
        public static final String MOB_YOG_KILL = "...";
        // Yogs fists
        public static final String MOB_FIST_ROTTING_NAME = "rotting fist";
        public static final String MOB_FIST_BURNING_NAME = "burning fist";
        // Tengu
        public static final String MOB_TENGU_NAME = "Tengu";
        public static final String MOB_TENGU_MEMORY_NAME = "memory of Tengu";
        public static final String MOB_TENU_KILL = "Free at last...";
        public static final String MOB_TENGU_NOTICE = "Gotcha, " + Dungeon.hero.heroClass.title() + "!";
        public static final String MOB_TENGU_DESC = "Tengu are members of the ancient assassins clan, which is also called Tengu. These assassins are noted for extensive use of shuriken and traps.";
    }


    ///////////////////////////////////////////////////////////////////////////
    // COMMON
    ///////////////////////////////////////////////////////////////////////////

    public static class Common {
        public static final String MOB_TXT_DIED = "You hear something died in the distance";
        public static final String MOB_TXT_FLEEING = "This %s is fleeing";
        public static final String MOB_THIEF_TXT_STOLE = "%s stole %s from you!";
        public static final String MOB_THIEF_TXT_CARRIES = "\n\n%s is carrying a _%s_. Stolen obviously.";
        public static final String MOB_TXT_RAGE = "#$%^";
        public static final String MOB_TXT_EXP = "%+dEXP";
        public static final String MOB_TXT_SLEEPING = "This %s is sleeping";
        public static final String MOB_TXT_WANDERING = "This %s is wandering";
        public static final String MOB_TXT_HUNTING = "This %s is hunting";
        public static final String MOB_TXT_PASSIVE = "This %s is passive";
        protected static final String MOB_TXT_ECHO = "echo of ";
        protected static final String MOB_TXT_NOTICE1 = "?!";
    }


    ///////////////////////////////////////////////////////////////////////////
    // NPCS
    ///////////////////////////////////////////////////////////////////////////

    public static class NPC {
        public static class Bee {
            // Bee
            public static final String NPC_BEE_NAME = "golden bee";
            public static final String NPC_BEE_DESC = "Despite their small size, golden bees tend to protect their master fiercely. They don't live long though.";
        }

        public static class Blacksmith {
            // Blacksmith
            public static final String NPC_BLACKSMITH_TXT_GOLD = "Hey human! Wanna be useful, eh? Take dis pickaxe and mine me some _dark gold ore_, _15 pieces_ should be enough. What do you mean, how am I gonna pay? You greedy...\nOk, ok, I don't have money to pay, but I can do some smithin' for you. Consider yourself lucky, I'm the only blacksmith around.";
            public static final String NPC_BLACKSMITH_TXT_BLOOD = "Hey human! Wanna be useful, eh? Take dis pickaxe and _kill a bat_ wit' it, I need its blood on the head. What do you mean, how am I gonna pay? You greedy...\nOk, ok, I don't have money to pay, but I can do some smithin' for you. Consider yourself lucky, I'm the only blacksmith ar_ound.";
            public static final String NPC_BLACKSMITH_PICKAXE_1 = "Are you kiddin' me? Where is my pickaxe?!";
            public static final String NPC_BLACKSMITH_PICKAXE_2 = "I said I need bat blood on the pickaxe. Chop chop!";
            public static final String NPC_BLACKSMITH_GOLD = "Dark gold ore. 15 pieces. Seriously, is it dat hard?";
            public static final String NPC_BLACKSMITH_TXT_COMPLETED = "Oh, you have returned... Better late dan never.";
            public static final String NPC_BLACKSMITH_TXT_GET_LOST = "I'm busy. Get lost!";
            public static final String NPC_BLACKSMITH_NAME = "troll blacksmith";
            public static final String NPC_BLACKSMITH_VERIFY_1 = "Select 2 different items, not the same item twice!";
            public static final String NPC_BLACKSMITH_VERIFY_2 = "Select 2 items of the same type!";
            public static final String NPC_BLACKSMITH_VERIFY_3 = "I need to know what I'm working with, identify them first!";
            public static final String NPC_BLACKSMITH_VERIFY_4 = "I don't work with cursed items!";
            public static final String NPC_BLACKSMITH_VERIFY_5 = "It's a junk, the quality is too poor!";
            public static final String NPC_BLACKSMITH_VERIFY_6 = "I can't reforge these items!";
            public static final String NPC_BLACKSMITH_DESC = "This troll blacksmith looks like all trolls look: he is tall and lean, and his skin resembles stone in both color and texture. The troll blacksmith is tinkering with unproportionally small tools.";
        }

        public static class Ghost {
            // Sad Ghost
            public static final String NPC_GHOST_NAME = "sad ghost";
            public static final String NPC_GHOST_DEFENSE = "evaded";
            public static final String NPC_GHOST_DESC = "The ghost is barely visible. It looks like a shapeless spot of faint light with a sorrowful face.";
            public static final String NPC_GHOST_TXT_ROSE_1 = "Hello adventurer... Once I was like you - strong and confident... And now I'm dead... But I can't leave this place... Not until I have my _dried rose_... It's very important to me... Some monster stole it from my body...";
            public static final String NPC_GHOST_TXT_ROSE_2 = "Please... Help me... _Find the rose_...";
            public static final String NPC_GHOST_TXT_ROSE_3 = "Yes! Yes!!! This is it! Please give it to me! And you can take one of these items, maybe they will be useful to you in your journey...";
            public static final String NPC_GHOST_TXT_RAT_1 = "Hello adventurer... Once I was like you - strong and confident... And now I'm dead... But I can't leave this place... Not until I have my revenge... Slay the _fetid rat_, that has taken my life...";
            public static final String NPC_GHOST_TXT_RAT_2 = "Please... Help me... _Slay the abomination_...";
            public static final String NPC_GHOST_TXT_RAT_3 = "Yes! The ugly creature is slain and I can finally rest... Please take one of these items, maybe they will be useful to you in your journey...";
            public static final String NPC_GHOST_TXT_CURSE_1 = "Hello adventurer... Once I was like you - strong and confident... And now I'm dead... But I can't leave this place, as I am bound by a horrid curse... Please... Help me... _Destroy the curse_...";
            public static final String NPC_GHOST_TXT_CURSE_2 = "Thank you, %s! The curse is broken and I can finally rest... Please take one of these items, maybe they will be useful to you in your journey...";
            public static final String NPC_GHOST_TXT_YES = "Yes, I will do it for you";
            public static final String NPC_GHOST_TXT_NO = "No, I can't help you";
        }

        public static class Imp {
            // Imp
            public static final String NPC_IMP_NAME = "ambitious imp";
            public static final String NPC_IMP_TXT_GOLEMS_1 = "Are you an adventurer? I love adventurers! You can always rely on them if something needs to be killed. Am I right? For a bounty, of course ;)\nIn my case this is _golems_ who need to be killed. You see, I'm going to start a little business here, but these stupid golems are bad for business! It's very hard to negotiate with wandering lumps of granite, damn them! So please, kill... let's say _6 of them_ and a reward is yours.";
            public static final String NPC_IMP_TXT_MONKS_1 = "Are you an adventurer? I love adventurers! You can always rely on them if something needs to be killed. Am I right? For a bounty, of course ;)\nIn my case this is _monks_ who need to be killed. You see, I'm going to start a little business here, but these lunatics don't buy anything themselves and will scare away other customers. So please, kill... let's say _8 of them_ and a reward is yours.";
            public static final String NPC_IMP_TXT_GOLEMS_2 = "How is your golem safari going?";
            public static final String NPC_IMP_TXT_MONKS_2 = "Oh, you are still alive! I knew that your kung-fu is stronger ;) Just don't forget to grab these monks' tokens.";
            public static final String NPC_IMP_TXT_CYA = "See you, %s!";
            public static final String NPC_IMP_TXT_HEY = "Psst, %s!";
            public static final String NPC_IMP_DEFENSE = "evaded";
            public static final String NPC_IMP_DESC = "Imps are lesser demons. They are notable for neither their strength nor their magic talent, but they are quite smart and sociable. Many imps prefer to live among non-demons.";

            // Imp shopkeeper
            public static final String NPC_IMP_SHOPKEEPER_NAME = "ambitious imp";
            public static final String NPC_IMP_SHOPKEEPER_TXT_GREETINGS = "Hello, friend!";
            public static final String NPC_IMP_SHOPKEEPER_DESC = "Imps are lesser demons. They are notable for neither their strength nor their magic talent. But they are quite smart and sociable, and many of imps prefer to live and do business among non-demons.";
        }

        public static class MirrorImage {
            // Mirror image
            public static final String NPC_IMAGE_DESC = "This illusion bears a close resemblance to you, but it's paler and twitches a little.";
        }

        public static class Rat {
            // Rat King
            public static final String NPC_RAT_NAME = "rat king";
            public static final String NPC_RAT_INTERACT_1 = "I'm not sleeping!";
            public static final String NPC_RAT_INTERACT_2 = "What is it? I have no time for this nonsense. My kingdom won't rule itself!";
            public static final String NPC_RAT_DESC = "This rat is a little bigger than a regular marsupial rat and it's wearing a tiny crown on its head.";
        }

        public static class Shopkeeper {
            // Shopkeeper
            public static final String NPC_SHOPKEEPER_NAME = "shopkeeper";
            public static final String NPC_SHOPKEEPER_DESC = "This stout guy looks more appropriate for a trade district in some large city than for a dungeon. His prices explain why he prefers to do business here.";
            public static final String NPC_SHOPKEEPER_SELL = "Select an item to sell";
        }

        public static class Wandmaker {
            // Wandmaker
            public static final String NPC_WANDMAKER_NAME = "old wandmaker";
            public static final String NPC_WANDMAKER_DESC = "This old but hale gentleman wears a slightly confused expression. He is protected by a magic shield.";
            public static final String NPC_WANDMAKER_BERRY_1 = "Oh, what a pleasant surprise to meet a decent person in such place! I came here for a rare ingredient - a _Rotberry seed_. Being a magic user, I'm quite able to defend myself against local monsters, but I'm getting lost in no time, it's very embarrassing. Probably you could help me? I would be happy to pay for your service with one of my best wands.";
            public static final String NPC_WANDMAKER_BERRY_2 = "Any luck with a _Rotberry seed_, %s? No? Don't worry, I'm not in a hurry.";
            public static final String NPC_WANDMAKER_DUST_1 = "Oh, what a pleasant surprise to meet a decent person in such place! I came here for a rare ingredient - _corpse dust_. It can be gathered from skeletal remains and there is an ample number of them in the dungeon. Being a magic user, I'm quite able to defend myself against local monsters, but I'm getting lost in no time, it's very embarrassing. Probably you could help me? I would be happy to pay for your service with one of my best wands.";
            public static final String NPC_WANDMAKER_DUST_2 = "Any luck with _corpse dust_, %s? Bone piles are the most obvious places to look.";
            public static final String NPC_WANDMAKER_FISH_1 = "Oh, what a pleasant surprise to meet a decent person in such place! I came here for a rare ingredient: a _phantom fish_. You can catch it with your bare hands, but it's very hard to notice in the water. Being a magic user, I'm quite able to defend myself against local monsters, but I'm getting lost in no time, it's very embarrassing. Probably you could help me? I would be happy to pay for your service with one of my best wands.";
            public static final String NPC_WANDMAKER_FISH_2 = "Any luck with a _phantom fish_, %s? You may want to try searching for it in one of the local pools.";
        }
    }

}
