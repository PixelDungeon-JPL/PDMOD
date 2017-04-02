/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.watabou.pixeldungeon;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

import com.lumi.pdmod.RLoader;
import com.watabou.noosa.Game;
import com.watabou.pixeldungeon.actors.mobs.Acidic;
import com.watabou.pixeldungeon.actors.mobs.Albino;
import com.watabou.pixeldungeon.actors.mobs.Bandit;
import com.watabou.pixeldungeon.actors.mobs.Mob;
import com.watabou.pixeldungeon.actors.mobs.Senior;
import com.watabou.pixeldungeon.actors.mobs.Shielded;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.items.bags.ScrollHolder;
import com.watabou.pixeldungeon.items.bags.SeedPouch;
import com.watabou.pixeldungeon.items.bags.WandHolster;
import com.watabou.pixeldungeon.items.potions.Potion;
import com.watabou.pixeldungeon.items.rings.Ring;
import com.watabou.pixeldungeon.items.rings.RingOfHaggler;
import com.watabou.pixeldungeon.items.rings.RingOfThorns;
import com.watabou.pixeldungeon.items.scrolls.Scroll;
import com.watabou.pixeldungeon.items.wands.Wand;
import com.watabou.pixeldungeon.scenes.PixelScene;
import com.watabou.pixeldungeon.utils.GLog;
import com.watabou.utils.Bundle;
import com.watabou.utils.Callback;

/**
 * Enthält alle Erfolge im Spiel
 */
public class Badges {

	public static enum Badge {
		MONSTERS_SLAIN_1(RLoader.get("badge.slain.10"), 0 ),
		MONSTERS_SLAIN_2(RLoader.get("badge.slain.50"), 1 ),
		MONSTERS_SLAIN_3(RLoader.get("badge.slain.150"), 2 ),
		MONSTERS_SLAIN_4(RLoader.get("badge.slain.250"), 3 ),
		MONSTERS_SLAIN_5(RLoader.get("badge.slain.500"), 3 ),
		MONSTERS_SLAIN_6(RLoader.get("badge.slain.1000"), 3 ),
		GOLD_COLLECTED_1(RLoader.get("badge.goldcollect.100"), 4 ),
		GOLD_COLLECTED_2(RLoader.get("badge.goldcollect.500"), 5 ),
		GOLD_COLLECTED_3(RLoader.get("badge.goldcollect.2500"), 6 ),
		GOLD_COLLECTED_4(RLoader.get("badge.goldcollect.7500"), 7 ),
		GOLD_COLLECTED_5(RLoader.get("badge.goldcollect.10000"), 7 ),
		LEVEL_REACHED_1(RLoader.get("badge.reachlvl.6"), 8 ),
		LEVEL_REACHED_2(RLoader.get("badge.reachlvl.12"), 9 ),
		LEVEL_REACHED_3(RLoader.get("badge.reachlvl.18"), 10 ),
		LEVEL_REACHED_4(RLoader.get("badge.reachlvl.24"), 11 ),
		ALL_POTIONS_IDENTIFIED(RLoader.get("badge.allpotions.identified"), 16 ),
		ALL_SCROLLS_IDENTIFIED(RLoader.get("badge.allscrolls.identified"), 17 ),
		ALL_RINGS_IDENTIFIED(RLoader.get("badge.allrings.identified"), 18 ),
		ALL_WANDS_IDENTIFIED(RLoader.get("badge.allwands.identified"), 19 ),
		ALL_ITEMS_IDENTIFIED( "badge.all.identified", 35, true ),
		BAG_BOUGHT_SEED_POUCH,
		BAG_BOUGHT_SCROLL_HOLDER,
		BAG_BOUGHT_WAND_HOLSTER,
		ALL_BAGS_BOUGHT( "badge.allbags.bought", 23 ),
		DEATH_FROM_FIRE( "badge.deathby.fire", 24 ),
		DEATH_FROM_POISON( "badge.deathby.poison", 25 ),
		DEATH_FROM_GAS( "badge.deathby.toxicgas", 26 ),
		DEATH_FROM_HUNGER( "badge.deathby.hunger", 27 ),
		DEATH_FROM_GLYPH( "badge.deathby.ench", 57 ),
		DEATH_FROM_FALLING( "badge.deathby.falling", 59 ),
		YASD( "badge.deathby.all", 34, true ),
		BOSS_SLAIN_1_WARRIOR,
		BOSS_SLAIN_1_MAGE,
		BOSS_SLAIN_1_ROGUE,
		BOSS_SLAIN_1_HUNTRESS,
		BOSS_SLAIN_1( "badge.slainboss.1", 12 ),
		BOSS_SLAIN_2( "badge.slainboss.2", 13 ),
		BOSS_SLAIN_3( "badge.slainboss.3", 14 ),
		BOSS_SLAIN_4( "badge.slainboss.4", 15 ),
		BOSS_SLAIN_1_ALL_CLASSES( "badge.slainboss_allchar.1", 32, true ),
		BOSS_SLAIN_3_GLADIATOR,
		BOSS_SLAIN_3_BERSERKER,
		BOSS_SLAIN_3_WARLOCK,
		BOSS_SLAIN_3_BATTLEMAGE,
		BOSS_SLAIN_3_FREERUNNER,
		BOSS_SLAIN_3_ASSASSIN,
		BOSS_SLAIN_3_SNIPER,
		BOSS_SLAIN_3_WARDEN,
		BOSS_SLAIN_3_ALL_SUBCLASSES("badge.slainboss_allsubclasses.3", 33, true ),
		RING_OF_HAGGLER( "badge.findItem_ring.haggler", 20 ),
		RING_OF_THORNS( "badge.findItem_ring.thorns", 21 ),
		STRENGTH_ATTAINED_1( "badge.str.13", 40 ),
		STRENGTH_ATTAINED_2( "badge.str.15", 41 ),
		STRENGTH_ATTAINED_3( "badge.str.17", 42 ),
		STRENGTH_ATTAINED_4( "badge.str.19", 43 ),
		FOOD_EATEN_1( "badge.foodEaten.10", 44 ),
		FOOD_EATEN_2( "badge.foodEaten.20", 45 ),
		FOOD_EATEN_3( "badge.foodEaten.30", 46 ),
		FOOD_EATEN_4( "badge.foodEaten.40", 47 ),
		MASTERY_WARRIOR,
		MASTERY_MAGE,
		MASTERY_ROGUE,
		MASTERY_HUNTRESS,
		ITEM_LEVEL_1( "badge.itemLvl.3", 48 ),
		ITEM_LEVEL_2( "badge.itemLvl.6", 49 ),
		ITEM_LEVEL_3( "badge.itemLvl.9", 50 ),
		ITEM_LEVEL_4( "badge.itemLvl.12", 51 ),
		RARE_ALBINO,
		RARE_BANDIT,
		RARE_SHIELDED,
		RARE_SENIOR,
		RARE_ACIDIC,
		RARE( "badge.slainRareMonster.all", 37, true ),
		VICTORY_WARRIOR,
		VICTORY_MAGE,
		VICTORY_ROGUE,
		VICTORY_HUNTRESS,
		VICTORY( "badge.findItem.AmuletYendor", 22 ),
		VICTORY_ALL_CLASSES( "badge.findItem_allclasses.AmuletYendor", 36, true ),
		MASTERY_COMBO( "badge.combo.7", 56 ),
		POTIONS_COOKED_1( "badge.potions_cooking.3", 52 ),
		POTIONS_COOKED_2( "badge.potions_cooking.6", 53 ),
		POTIONS_COOKED_3( "badge.potions_cooking.9", 54 ),
		POTIONS_COOKED_4( "badge.potions_cooking.12", 55 ),
		POTIONS_COOKED_5( "badge.potions_cooking.15", 55 ),
		NO_MONSTERS_SLAIN( "badge.no-monster-slain", 28 ),
		GRIM_WEAPON( "badge.killEnemy.withGrim", 29 ),
		PIRANHAS_1( "badge.killPiranhas.6", 30 ),
		PIRANHAS_2( "badge.killPiranhas.12", 30 ),
		PIRANHAS_3( "badge.killPiranhas.18", 30 ),
		NIGHT_HUNTER( "badge.nighthunter", 58 ),
		GAMES_PLAYED_1( "badge.playgames.10", 60, true ),
		GAMES_PLAYED_2( "badge.playgames.100", 61, true ),
		GAMES_PLAYED_3( "badge.playgames.500", 62, true ),
		GAMES_PLAYED_4( "badge.playgames.2000", 63, true ),
		HAPPY_END( "badge.happyend", 38 ),
		CHAMPION( "badge.challenge_won", 39, true ),
		SUPPORTER( "badge.thanks-for-supp", 31, true );
		
		public boolean meta;
		
		public String description;
		public int image;
		
		private Badge( String description, int image ) {
			this( description, image, false );
		}
		
		private Badge( String description, int image, boolean meta ) {
			this.description = description;
			this.image = image;
			this.meta = meta;
		}
		
		private Badge() {
			this( "", -1 );
		}
	}
	
	private static HashSet<Badge> global;
	private static HashSet<Badge> local = new HashSet<Badges.Badge>();
	private static boolean saveNeeded = false;
	public static Callback loadingListener = null;
    private static final String BADGES_FILE	= "badges.dat";
    private static final String BADGES		= "badges";

    /**
     * Setzt alle Erfolge zurück
     */
	public static void reset() {
		local.clear();
		loadGlobal();
	}

	private static HashSet<Badge> restore( Bundle bundle ) {
		HashSet<Badge> badges = new HashSet<Badge>();
		
		String[] names = bundle.getStringArray( BADGES );
		for (int i=0; i < names.length; i++) {
			try {
				badges.add( Badge.valueOf( names[i] ) );
			} catch (Exception e) {
			}
		}
	
		return badges;
	}
 	private static void store( Bundle bundle, HashSet<Badge> badges ) {
		int count = 0;
		String names[] = new String[badges.size()];
		
		for (Badge badge:badges) {
			names[count++] = badge.toString();
		}
		bundle.put( BADGES, names );
	}
	public static void loadLocal( Bundle bundle ) {
		local = restore( bundle );
	}
	public static void saveLocal( Bundle bundle ) {
		store( bundle, local );
	}
	public static void loadGlobal() {
		if (global == null) {
			try {
				InputStream input = Game.instance.openFileInput( BADGES_FILE );
				Bundle bundle = Bundle.read( input );
				input.close();
				
				global = restore( bundle );
				
			} catch (IOException e) {
				global = new HashSet<Badge>();
			}
		}
	}
	public static void saveGlobal() {
		
		Bundle bundle = null;
		
		if (saveNeeded) {
			
			bundle = new Bundle();
			store( bundle, global );
			
			try {
				OutputStream output = Game.instance.openFileOutput( BADGES_FILE, Game.MODE_PRIVATE );
				Bundle.write( bundle, output );
				output.close();
				saveNeeded = false;
			} catch (IOException e) {
				
			}
		}
	}

	/**
	 * Updated den "X Monster Getötet" Erfolg
	 */
	public static void validateMonstersSlain() {
		Badge badge = null;
		
		if (!local.contains( Badge.MONSTERS_SLAIN_1 ) && Statistics.enemiesSlain >= 10) {
			badge = Badge.MONSTERS_SLAIN_1;
			local.add( badge );
		}
		if (!local.contains( Badge.MONSTERS_SLAIN_2 ) && Statistics.enemiesSlain >= 50) {
			badge = Badge.MONSTERS_SLAIN_2;
			local.add( badge );
		}
		if (!local.contains( Badge.MONSTERS_SLAIN_3 ) && Statistics.enemiesSlain >= 150) {
			badge = Badge.MONSTERS_SLAIN_3;
			local.add( badge );
		}
		if (!local.contains( Badge.MONSTERS_SLAIN_4 ) && Statistics.enemiesSlain >= 250) {
			badge = Badge.MONSTERS_SLAIN_4;
			local.add( badge );
		}
		
		displayBadge( badge );
	}

	/**
	 * Updated den "X Gold Gesammelt" Erfolg
	 */
	public static void validateGoldCollected() {
		Badge badge = null;
		
		if (!local.contains( Badge.GOLD_COLLECTED_1 ) && Statistics.goldCollected >= 100) {
			badge = Badge.GOLD_COLLECTED_1;
			local.add( badge );
		}
		if (!local.contains( Badge.GOLD_COLLECTED_2 ) && Statistics.goldCollected >= 500) {
			badge = Badge.GOLD_COLLECTED_2;
			local.add( badge );
		}
		if (!local.contains( Badge.GOLD_COLLECTED_3 ) && Statistics.goldCollected >= 2500) {
			badge = Badge.GOLD_COLLECTED_3;
			local.add( badge );
		}
		if (!local.contains( Badge.GOLD_COLLECTED_4 ) && Statistics.goldCollected >= 7500) {
			badge = Badge.GOLD_COLLECTED_4;
			local.add( badge );
		}
		
		displayBadge( badge );
	}

	/**
	 * Updated den "Level X Erreicht" Erfolg
	 */
	public static void validateLevelReached() {
		Badge badge = null;
		
		if (!local.contains( Badge.LEVEL_REACHED_1 ) && Dungeon.hero.lvl >= 6) {
			badge = Badge.LEVEL_REACHED_1;
			local.add( badge );
		}
		if (!local.contains( Badge.LEVEL_REACHED_2 ) && Dungeon.hero.lvl >= 12) {
			badge = Badge.LEVEL_REACHED_2;
			local.add( badge );
		}
		if (!local.contains( Badge.LEVEL_REACHED_3 ) && Dungeon.hero.lvl >= 18) {
			badge = Badge.LEVEL_REACHED_3;
			local.add( badge );
		}
		if (!local.contains( Badge.LEVEL_REACHED_4 ) && Dungeon.hero.lvl >= 24) {
			badge = Badge.LEVEL_REACHED_4;
			local.add( badge );
		}
		
		displayBadge( badge );
	}

	/**
	 * Updated den "X Stärke Erhalten" Erfolg
	 */
	public static void validateStrengthAttained() {
		Badge badge = null;
		
		if (!local.contains( Badge.STRENGTH_ATTAINED_1 ) && Dungeon.hero.STR >= 13) {
			badge = Badge.STRENGTH_ATTAINED_1;
			local.add( badge );
		}
		if (!local.contains( Badge.STRENGTH_ATTAINED_2 ) && Dungeon.hero.STR >= 15) {
			badge = Badge.STRENGTH_ATTAINED_2;
			local.add( badge );
		}
		if (!local.contains( Badge.STRENGTH_ATTAINED_3 ) && Dungeon.hero.STR >= 17) {
			badge = Badge.STRENGTH_ATTAINED_3;
			local.add( badge );
		}
		if (!local.contains( Badge.STRENGTH_ATTAINED_4 ) && Dungeon.hero.STR >= 19) {
			badge = Badge.STRENGTH_ATTAINED_4;
			local.add( badge );
		}
		
		displayBadge( badge );
	}

	/**
	 * Updated den "X Nahrung Gegessen" Erfolg
	 */
	public static void validateFoodEaten() {
		Badge badge = null;
		
		if (!local.contains( Badge.FOOD_EATEN_1 ) && Statistics.foodEaten >= 10) {
			badge = Badge.FOOD_EATEN_1;
			local.add( badge );
		}
		if (!local.contains( Badge.FOOD_EATEN_2 ) && Statistics.foodEaten >= 20) {
			badge = Badge.FOOD_EATEN_2;
			local.add( badge );
		}
		if (!local.contains( Badge.FOOD_EATEN_3 ) && Statistics.foodEaten >= 30) {
			badge = Badge.FOOD_EATEN_3;
			local.add( badge );
		}
		if (!local.contains( Badge.FOOD_EATEN_4 ) && Statistics.foodEaten >= 40) {
			badge = Badge.FOOD_EATEN_4;
			local.add( badge );
		}
		
		displayBadge( badge );
	}

	/**
	 * Updated den "X Tränke Gebraut" Erfolg
	 */
	public static void validatePotionsCooked() {
		Badge badge = null;
		
		if (!local.contains( Badge.POTIONS_COOKED_1 ) && Statistics.potionsCooked >= 3) {
			badge = Badge.POTIONS_COOKED_1;
			local.add( badge );
		}
		if (!local.contains( Badge.POTIONS_COOKED_2 ) && Statistics.potionsCooked >= 6) {
			badge = Badge.POTIONS_COOKED_2;
			local.add( badge );
		}
		if (!local.contains( Badge.POTIONS_COOKED_3 ) && Statistics.potionsCooked >= 9) {
			badge = Badge.POTIONS_COOKED_3;
			local.add( badge );
		}
		if (!local.contains( Badge.POTIONS_COOKED_4 ) && Statistics.potionsCooked >= 12) {
			badge = Badge.POTIONS_COOKED_4;
			local.add( badge );
		}
		
		displayBadge( badge );
	}

	/**
	 * Updated den "X Piranhas Getötet" Erfolg
	 */
	public static void validatePiranhasKilled() {
		Badge badge = null;
		
		if (!local.contains( Badge.PIRANHAS_1 ) && Statistics.piranhasKilled >= 6) {
			badge = Badge.PIRANHAS_1;
			local.add( badge );
		}
		if (!local.contains( Badge.PIRANHAS_2 ) && Statistics.piranhasKilled >= 12) {
			badge = Badge.PIRANHAS_2;
			local.add( badge );
		}
		if (!local.contains( Badge.PIRANHAS_3 ) && Statistics.piranhasKilled >= 18) {
			badge = Badge.PIRANHAS_3;
			local.add( badge );
		}
		
		displayBadge( badge );
	}

	/**
	 * Updated den "Item auf Level X Erhalten" Erfolg.
	 *
	 * Wird aufgerufen
	 * 			(1) wenn ein Item aufgehoben wird
	 * 			(2) wenn ein Item Upgegraded wird
	 * 			(3) wenn ein Item identifiziert wird
	 * @param item The jeweilige Item
	 */
	public static void validateItemLevelAquired( Item item ) {
		
		// This method should be called:
		// 1) When an item gets obtained (Item.collect)
		// 2) When an item gets upgraded (ScrollOfUpgrade, ScrollOfWeaponUpgrade, ShortSword, WandOfMagicMissile)
		// 3) When an item gets identified
		if (!item.levelKnown) {
			return;
		}
		
		Badge badge = null;
		
		if (!local.contains( Badge.ITEM_LEVEL_1 ) && item.level() >= 3) {
			badge = Badge.ITEM_LEVEL_1;
			local.add( badge );
		}
		if (!local.contains( Badge.ITEM_LEVEL_2 ) && item.level() >= 6) {
			badge = Badge.ITEM_LEVEL_2;
			local.add( badge );
		}
		if (!local.contains( Badge.ITEM_LEVEL_3 ) && item.level() >= 9) {
			badge = Badge.ITEM_LEVEL_3;
			local.add( badge );
		}
		if (!local.contains( Badge.ITEM_LEVEL_4 ) && item.level() >= 12) {
			badge = Badge.ITEM_LEVEL_4;
			local.add( badge );
		}
		
		displayBadge( badge );
	}

	/**
	 * Updated den "Alle Tränke Identifiziert" Erfolg
	 */
	public static void validateAllPotionsIdentified() {
		if (Dungeon.hero != null && Dungeon.hero.isAlive() && 
			!local.contains( Badge.ALL_POTIONS_IDENTIFIED ) && Potion.allKnown()) {
			
			Badge badge = Badge.ALL_POTIONS_IDENTIFIED;
			local.add( badge );
			displayBadge( badge );
			
			validateAllItemsIdentified();
		}
	}

	/**
	 * Updated den "Alle Spruchrollen Identifiziert" Erfolg
	 */
	public static void validateAllScrollsIdentified() {
		if (Dungeon.hero != null && Dungeon.hero.isAlive() && 
			!local.contains( Badge.ALL_SCROLLS_IDENTIFIED ) && Scroll.allKnown()) {
			
			Badge badge = Badge.ALL_SCROLLS_IDENTIFIED;
			local.add( badge );
			displayBadge( badge );
			
			validateAllItemsIdentified();
		}
	}

	/**
	 * Updated den "Alle Ringe Identifiziert" Erfolg
	 */
	public static void validateAllRingsIdentified() {
		if (Dungeon.hero != null && Dungeon.hero.isAlive() && 
			!local.contains( Badge.ALL_RINGS_IDENTIFIED ) && Ring.allKnown()) {
			
			Badge badge = Badge.ALL_RINGS_IDENTIFIED;
			local.add( badge );
			displayBadge( badge );
			
			validateAllItemsIdentified();
		}
	}

	/**
	 * Updated den "Alle Zauberstäbe Indentifiziert" Erfolg
	 */
	public static void validateAllWandsIdentified() {
		if (Dungeon.hero != null && Dungeon.hero.isAlive() && 
			!local.contains( Badge.ALL_WANDS_IDENTIFIED ) && Wand.allKnown()) {
			
			Badge badge = Badge.ALL_WANDS_IDENTIFIED;
			local.add( badge );
			displayBadge( badge );
			
			validateAllItemsIdentified();
		}
	}

	/**
	 * Updated den "Alle Tachen Gekauft" Erfolg
	 * @param bag Die gerade gekaufte Tasche
	 */
	public static void validateAllBagsBought( Item bag ) {
		
		Badge badge = null;
		if (bag instanceof SeedPouch) {
			badge = Badge.BAG_BOUGHT_SEED_POUCH;
		} else if (bag instanceof ScrollHolder) {
			badge = Badge.BAG_BOUGHT_SCROLL_HOLDER;
		} else if (bag instanceof WandHolster) {
			badge = Badge.BAG_BOUGHT_WAND_HOLSTER;
		}
		
		if (badge != null) {
			
			local.add( badge );
			
			if (!local.contains( Badge.ALL_BAGS_BOUGHT ) &&
				local.contains( Badge.BAG_BOUGHT_SCROLL_HOLDER ) &&
				local.contains( Badge.BAG_BOUGHT_SEED_POUCH ) &&
				local.contains( Badge.BAG_BOUGHT_WAND_HOLSTER )) {
						
					badge = Badge.ALL_BAGS_BOUGHT;
					local.add( badge );
					displayBadge( badge );
			}
		}
	}

	/**
	 * Updated den "Alle Item Identifiziert" Erfolg
	 */
	public static void validateAllItemsIdentified() {
		if (!global.contains( Badge.ALL_ITEMS_IDENTIFIED ) &&
			global.contains( Badge.ALL_POTIONS_IDENTIFIED ) &&
			global.contains( Badge.ALL_SCROLLS_IDENTIFIED ) &&
			global.contains( Badge.ALL_RINGS_IDENTIFIED ) &&
			global.contains( Badge.ALL_WANDS_IDENTIFIED )) {
			
			Badge badge = Badge.ALL_ITEMS_IDENTIFIED;
			displayBadge( badge );
		}
	}

	/**
	 * Updated den "Tod durch Feuer" Erfolg
	 */
	public static void validateDeathFromFire() {
		Badge badge = Badge.DEATH_FROM_FIRE;
		local.add( badge );
		displayBadge( badge );
		
		validateYASD();
	}

	/**
	 * Updated den "Tod durch Gift" Erfolg
	 */
	public static void validateDeathFromPoison() {
		Badge badge = Badge.DEATH_FROM_POISON;
		local.add( badge );
		displayBadge( badge );
		
		validateYASD();
	}

	/**
	 * Updated den "Tod durch Gas" Erfolg
	 */
	public static void validateDeathFromGas() {
		Badge badge = Badge.DEATH_FROM_GAS;
		local.add( badge );
		displayBadge( badge );
		
		validateYASD();
	}

	/**
	 * Updated den "Tod durch Hunger" Erfolg
	 */
	public static void validateDeathFromHunger() {
		Badge badge = Badge.DEATH_FROM_HUNGER;
		local.add( badge );
		displayBadge( badge );
		
		validateYASD();
	}

	/**
	 * Updated den "Tod durch Glyph(?)" Erfolg
	 */
	public static void validateDeathFromGlyph() {
		Badge badge = Badge.DEATH_FROM_GLYPH;
		local.add( badge );
		displayBadge( badge );
	}

	/**
	 * Updated den "Tod durch Fallen" Erfolg
	 */
	public static void validateDeathFromFalling() {
		Badge badge = Badge.DEATH_FROM_FALLING;
		local.add( badge );
		displayBadge( badge );
	}

	/**
	 * Updated den "YASD" Erfolg
	 */
	private static void validateYASD() {
		if (global.contains( Badge.DEATH_FROM_FIRE ) &&
			global.contains( Badge.DEATH_FROM_POISON ) &&
			global.contains( Badge.DEATH_FROM_GAS ) &&
			global.contains( Badge.DEATH_FROM_HUNGER)) {
			
			Badge badge = Badge.YASD;
			local.add( badge );
			displayBadge( badge );
		}
	}

	/**
	 * Updated den "Boss Getötet" Erfolg
	 */
	public static void validateBossSlain() {
		Badge badge = null;
		switch (Dungeon.depth) {
		case 5:
			badge = Badge.BOSS_SLAIN_1;
			break;
		case 10:
			badge = Badge.BOSS_SLAIN_2;
			break;
		case 15:
			badge = Badge.BOSS_SLAIN_3;
			break;
		case 20:
			badge = Badge.BOSS_SLAIN_4;
			break;
		}
		
		if (badge != null) {
			local.add( badge );
			displayBadge( badge );
			
			if (badge == Badge.BOSS_SLAIN_1) {
				switch (Dungeon.hero.heroClass) {
				case WARRIOR:
					badge = Badge.BOSS_SLAIN_1_WARRIOR;
					break;
				case MAGE:
					badge = Badge.BOSS_SLAIN_1_MAGE;
					break;
				case ROGUE:
					badge = Badge.BOSS_SLAIN_1_ROGUE;
					break;
				case HUNTRESS:
					badge = Badge.BOSS_SLAIN_1_HUNTRESS;
					break;
				}
				local.add( badge );
				if (!global.contains( badge )) {
					global.add( badge );
					saveNeeded = true;
				}
				
				if (global.contains( Badge.BOSS_SLAIN_1_WARRIOR ) &&
					global.contains( Badge.BOSS_SLAIN_1_MAGE ) &&
					global.contains( Badge.BOSS_SLAIN_1_ROGUE ) &&
					global.contains( Badge.BOSS_SLAIN_1_HUNTRESS)) {
					
					badge = Badge.BOSS_SLAIN_1_ALL_CLASSES;
					if (!global.contains( badge )) {
						displayBadge( badge );
						global.add( badge );
						saveNeeded = true;
					}
				}
			} else
			if (badge == Badge.BOSS_SLAIN_3) {
				switch (Dungeon.hero.subClass) {
				case GLADIATOR:
					badge = Badge.BOSS_SLAIN_3_GLADIATOR;
					break;
				case BERSERKER:
					badge = Badge.BOSS_SLAIN_3_BERSERKER;
					break;
				case WARLOCK:
					badge = Badge.BOSS_SLAIN_3_WARLOCK;
					break;
				case BATTLEMAGE:
					badge = Badge.BOSS_SLAIN_3_BATTLEMAGE;
					break;
				case FREERUNNER:
					badge = Badge.BOSS_SLAIN_3_FREERUNNER;
					break;
				case ASSASSIN:
					badge = Badge.BOSS_SLAIN_3_ASSASSIN;
					break;
				case SNIPER:
					badge = Badge.BOSS_SLAIN_3_SNIPER;
					break;
				case WARDEN:
					badge = Badge.BOSS_SLAIN_3_WARDEN;
					break;
				default:
					return;
				}
				local.add( badge );
				if (!global.contains( badge )) {
					global.add( badge );
					saveNeeded = true;
				}
				
				if (global.contains( Badge.BOSS_SLAIN_3_GLADIATOR ) &&
					global.contains( Badge.BOSS_SLAIN_3_BERSERKER ) &&
					global.contains( Badge.BOSS_SLAIN_3_WARLOCK ) &&
					global.contains( Badge.BOSS_SLAIN_3_BATTLEMAGE ) &&
					global.contains( Badge.BOSS_SLAIN_3_FREERUNNER ) &&
					global.contains( Badge.BOSS_SLAIN_3_ASSASSIN ) &&
					global.contains( Badge.BOSS_SLAIN_3_SNIPER ) &&
					global.contains( Badge.BOSS_SLAIN_3_WARDEN )) {
					
					badge = Badge.BOSS_SLAIN_3_ALL_SUBCLASSES;
					if (!global.contains( badge )) {
						displayBadge( badge );
						global.add( badge );
						saveNeeded = true;
					}
				}
			}
		}
	}

	/**
	 * Updated den "Mastery" Erfolg
	 */
	public static void validateMastery() {
		
		Badge badge = null;
		switch (Dungeon.hero.heroClass) {
		case WARRIOR:
			badge = Badge.MASTERY_WARRIOR;
			break;
		case MAGE:
			badge = Badge.MASTERY_MAGE;
			break;
		case ROGUE:
			badge = Badge.MASTERY_ROGUE;
			break;
		case HUNTRESS:
			badge = Badge.MASTERY_HUNTRESS;
			break;
		}
		
		if (!global.contains( badge )) {
			global.add( badge );
			saveNeeded = true;
		}
	}

	/**
	 * Updated den "Mastery Combo" Erfolg
	 */
	public static void validateMasteryCombo( int n ) {
		if (!local.contains( Badge.MASTERY_COMBO ) && n == 7) {
			Badge badge = Badge.MASTERY_COMBO;
			local.add( badge );
			displayBadge( badge );
		}
	}

	/**
	 * Updated den "Ring des Hagglers Erhalten" Erfolg
	 */
	public static void validateRingOfHaggler() {
		if (!local.contains( Badge.RING_OF_HAGGLER ) && new RingOfHaggler().isKnown()) {
			Badge badge = Badge.RING_OF_HAGGLER;
			local.add( badge );
			displayBadge( badge );
		}
	}

	/**
	 * Updated den "Ring der Dornen Erhalten" Erfolg
	 */
	public static void validateRingOfThorns() {
		if (!local.contains( Badge.RING_OF_THORNS ) && new RingOfThorns().isKnown()) {
			Badge badge = Badge.RING_OF_THORNS;
			local.add( badge );
			displayBadge( badge );
		}
	}

	/**
	 * Updated den "Seltenes Monster Getötet" Erfolg
	 */
	public static void validateRare( Mob mob ) {
		
		Badge badge = null;
		if (mob instanceof Albino) {
			badge = Badge.RARE_ALBINO;
		} else if (mob instanceof Bandit) {
			badge = Badge.RARE_BANDIT;
		} else if (mob instanceof Shielded) {
			badge = Badge.RARE_SHIELDED;
		} else if (mob instanceof Senior) {
			badge = Badge.RARE_SENIOR;
		} else if (mob instanceof Acidic) {
			badge = Badge.RARE_ACIDIC;
		}
		if (!global.contains( badge )) {
			global.add( badge );
			saveNeeded = true;
		}
		
		if (global.contains( Badge.RARE_ALBINO ) &&
			global.contains( Badge.RARE_BANDIT ) &&
			global.contains( Badge.RARE_SHIELDED ) &&
			global.contains( Badge.RARE_SENIOR ) &&
			global.contains( Badge.RARE_ACIDIC )) {
			
			badge = Badge.RARE;
			displayBadge( badge );
		}
	}

	/**
	 * Updated den "Gewinn" Erfolg
	 */
	public static void validateVictory() {

		Badge badge = Badge.VICTORY;
		displayBadge( badge );

		switch (Dungeon.hero.heroClass) {
		case WARRIOR:
			badge = Badge.VICTORY_WARRIOR;
			break;
		case MAGE:
			badge = Badge.VICTORY_MAGE;
			break;
		case ROGUE:
			badge = Badge.VICTORY_ROGUE;
			break;
		case HUNTRESS:
			badge = Badge.VICTORY_HUNTRESS;
			break;
		}
		local.add( badge );
		if (!global.contains( badge )) {
			global.add( badge );
			saveNeeded = true;
		}
		
		if (global.contains( Badge.VICTORY_WARRIOR ) &&
			global.contains( Badge.VICTORY_MAGE ) &&
			global.contains( Badge.VICTORY_ROGUE ) &&
			global.contains( Badge.VICTORY_HUNTRESS )) {
			
			badge = Badge.VICTORY_ALL_CLASSES;
			displayBadge( badge );
		}
	}

	/**
	 * Updated den "Ebene ohne ein Monster zu töten abgeschlossen" Erfolg
	 */
	public static void validateNoKilling() {
		if (!local.contains( Badge.NO_MONSTERS_SLAIN ) && Statistics.completedWithNoKilling) {
			Badge badge = Badge.NO_MONSTERS_SLAIN;
			local.add( badge );
			displayBadge( badge );
		}
	}

	/**
	 * Updated den "Gegner mit verfluchter Waffe getötet" Erfolg
	 */
	public static void validateGrimWeapon() {
		if (!local.contains( Badge.GRIM_WEAPON )) {
			Badge badge = Badge.GRIM_WEAPON;
			local.add( badge );
			displayBadge( badge );
		}
	}

	/**
	 * Updated den "X Monser bei Nacht Getötet" Erfolg
	 */
	public static void validateNightHunter() {
		if (!local.contains( Badge.NIGHT_HUNTER ) && Statistics.nightHunt >= 15) {
			Badge badge = Badge.NIGHT_HUNTER;
			local.add( badge );
			displayBadge( badge );
		}
	}

	public static void validateSupporter() {

		global.add( Badge.SUPPORTER );
		saveNeeded = true;
		
		PixelScene.showBadge( Badge.SUPPORTER );
	}

	/**
	 * Updated den "X Spiele Gespielt" Erfolg
	 */
	public static void validateGamesPlayed() {
		Badge badge = null;
		if (Rankings.INSTANCE.totalNumber >= 10) {
			badge = Badge.GAMES_PLAYED_1;
		}
		if (Rankings.INSTANCE.totalNumber >= 100) {
			badge = Badge.GAMES_PLAYED_2;
		}
		if (Rankings.INSTANCE.totalNumber >= 500) {
			badge = Badge.GAMES_PLAYED_3;
		}
		if (Rankings.INSTANCE.totalNumber >= 2000) {
			badge = Badge.GAMES_PLAYED_4;
		}
		
		displayBadge( badge );
	}

	/**
	 * Updated den "Happy End" Erfolg
	 */
	public static void validateHappyEnd() {
		displayBadge( Badge.HAPPY_END );
	}

	/**
	 * Updated den "Challenger" Erfolg
	 */
	public static void validateChampion() {
		displayBadge( Badge.CHAMPION );
	}

	/**
	 * Zeigt einen Erfolg auf dem Bildschirm
	 */
	private static void displayBadge( Badge badge ) {
		
		if (badge == null) {
			return;
		}
		
		if (global.contains( badge )) {
			
			if (!badge.meta) {
				GLog.h( "Badge endorsed: %s", badge.description );
			}
			
		} else {
			
			global.add( badge );
			saveNeeded = true;
			
			if (badge.meta) {
				GLog.h( "New super badge: %s", badge.description );
			} else {
				GLog.h( "New badge: %s", badge.description );
			}	
			PixelScene.showBadge( badge );
		}
	}

	/**
	 * Testet, ob ein Erfolg schon abgeschlossen wurde.
	 * @param badge Ther Erfolg
	 * @return True, falls der Erfolg abgeschlossen wurde
	 */
	public static boolean isUnlocked( Badge badge ) {
		return global.contains( badge );
	}

	/**
	 * Entfernt einen Erfolg, der schon erreicht wurde
	 * @param badge Der Erfolg
	 */
	public static void disown( Badge badge ) {
		loadGlobal();
		global.remove( badge );
		saveNeeded = true;
	}

	/**
	 * Filtert die Erfolge
	 * @param global True, wenn globale Erfolge einbezogen werden sollen
	 * @return Eine nach besten Erfongen gefilterte Liste
	 */
	public static List<Badge> filtered( boolean global ) {
		
		HashSet<Badge> filtered = new HashSet<Badge>( global ? Badges.global : Badges.local );
		
		{
			Iterator<Badge> iterator = filtered.iterator();
			while (iterator.hasNext()) {
				Badge badge = iterator.next();
				if ((!global && badge.meta) || badge.image == -1) {
					iterator.remove();
				}
			}
		}
		
		leaveBest( filtered, Badge.MONSTERS_SLAIN_1, Badge.MONSTERS_SLAIN_2, Badge.MONSTERS_SLAIN_3, Badge.MONSTERS_SLAIN_4 );
		leaveBest( filtered, Badge.GOLD_COLLECTED_1, Badge.GOLD_COLLECTED_2, Badge.GOLD_COLLECTED_3, Badge.GOLD_COLLECTED_4 );
		leaveBest( filtered, Badge.BOSS_SLAIN_1, Badge.BOSS_SLAIN_2, Badge.BOSS_SLAIN_3, Badge.BOSS_SLAIN_4 );
		leaveBest( filtered, Badge.LEVEL_REACHED_1, Badge.LEVEL_REACHED_2, Badge.LEVEL_REACHED_3, Badge.LEVEL_REACHED_4 );
		leaveBest( filtered, Badge.STRENGTH_ATTAINED_1, Badge.STRENGTH_ATTAINED_2, Badge.STRENGTH_ATTAINED_3, Badge.STRENGTH_ATTAINED_4 );
		leaveBest( filtered, Badge.FOOD_EATEN_1, Badge.FOOD_EATEN_2, Badge.FOOD_EATEN_3, Badge.FOOD_EATEN_4 );
		leaveBest( filtered, Badge.ITEM_LEVEL_1, Badge.ITEM_LEVEL_2, Badge.ITEM_LEVEL_3, Badge.ITEM_LEVEL_4 );
		leaveBest( filtered, Badge.POTIONS_COOKED_1, Badge.POTIONS_COOKED_2, Badge.POTIONS_COOKED_3, Badge.POTIONS_COOKED_4 );
		leaveBest( filtered, Badge.BOSS_SLAIN_1_ALL_CLASSES, Badge.BOSS_SLAIN_3_ALL_SUBCLASSES );
		leaveBest( filtered, Badge.DEATH_FROM_FIRE, Badge.YASD );
		leaveBest( filtered, Badge.DEATH_FROM_GAS, Badge.YASD );
		leaveBest( filtered, Badge.DEATH_FROM_HUNGER, Badge.YASD );
		leaveBest( filtered, Badge.DEATH_FROM_POISON, Badge.YASD );
		leaveBest( filtered, Badge.ALL_POTIONS_IDENTIFIED, Badge.ALL_ITEMS_IDENTIFIED );
		leaveBest( filtered, Badge.ALL_SCROLLS_IDENTIFIED, Badge.ALL_ITEMS_IDENTIFIED );
		leaveBest( filtered, Badge.ALL_RINGS_IDENTIFIED, Badge.ALL_ITEMS_IDENTIFIED );
		leaveBest( filtered, Badge.ALL_WANDS_IDENTIFIED, Badge.ALL_ITEMS_IDENTIFIED );
		leaveBest( filtered, Badge.VICTORY, Badge.VICTORY_ALL_CLASSES );
		leaveBest( filtered, Badge.VICTORY, Badge.HAPPY_END );
 		leaveBest( filtered, Badge.VICTORY, Badge.CHAMPION );
		leaveBest( filtered, Badge.GAMES_PLAYED_1, Badge.GAMES_PLAYED_2, Badge.GAMES_PLAYED_3, Badge.GAMES_PLAYED_4 );
		
		ArrayList<Badge> list = new ArrayList<Badge>( filtered );
		Collections.sort( list );
		
		return list;
	}

	/**
	 * Hilfemethode für 'Badge.filtered(boolean)'
	 */
	private static void leaveBest( HashSet<Badge> list, Badge...badges ) {
		for (int i=badges.length-1; i > 0; i--) {
			if (list.contains( badges[i])) {
				for (int j=0; j < i; j++) {
					list.remove( badges[j] );
				}
				break;
			}
		}
	}
}
