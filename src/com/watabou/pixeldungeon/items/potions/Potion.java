
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
 */package com.watabou.pixeldungeon.items.potions;

import java.util.ArrayList;
import java.util.HashSet;

import com.jpl.pdmod.data.ItemData;
import com.jpl.pdmod.potions.PotionOfSatisfy;
import com.watabou.noosa.audio.Sample;
import com.watabou.pixeldungeon.Assets;
import com.watabou.pixeldungeon.Badges;
import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.actors.hero.Hero;
import com.watabou.pixeldungeon.effects.Splash;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.items.ItemStatusHandler;
import com.watabou.pixeldungeon.levels.Level;
import com.watabou.pixeldungeon.levels.Terrain;
import com.watabou.pixeldungeon.scenes.GameScene;
import com.watabou.pixeldungeon.sprites.ItemSprite;
import com.watabou.pixeldungeon.sprites.ItemSpriteSheet;
import com.watabou.pixeldungeon.utils.GLog;
import com.watabou.pixeldungeon.windows.WndOptions;
import com.watabou.utils.Bundle;

public class Potion extends Item {
	
	public static final String AC_DRINK	= "DRINK";

	private static final float TIME_TO_DRINK = 1f;
	
	private static final Class<?>[] potions = {
		PotionOfHealing.class, 
		PotionOfExperience.class, 
		PotionOfToxicGas.class, 
		PotionOfLiquidFlame.class,
		PotionOfStrength.class,
		PotionOfParalyticGas.class,
		PotionOfLevitation.class,
		PotionOfMindVision.class, 
		PotionOfPurity.class,
		PotionOfInvisibility.class,
		PotionOfMight.class,
		PotionOfFrost.class,

			PotionOfSatisfy.class
	};
	private static final String[] colors = {
		"turquoise", "crimson", "azure", "jade", "golden", "magenta", 
		"charcoal", "ivory", "amber", "bistre", "indigo", "silver", "green"};
	private static final Integer[] images = {
		ItemSpriteSheet.POTION_TURQUOISE, 
		ItemSpriteSheet.POTION_CRIMSON, 
		ItemSpriteSheet.POTION_AZURE, 
		ItemSpriteSheet.POTION_JADE, 
		ItemSpriteSheet.POTION_GOLDEN, 
		ItemSpriteSheet.POTION_MAGENTA, 
		ItemSpriteSheet.POTION_CHARCOAL, 
		ItemSpriteSheet.POTION_IVORY, 
		ItemSpriteSheet.POTION_AMBER, 
		ItemSpriteSheet.POTION_BISTRE, 
		ItemSpriteSheet.POTION_INDIGO, 
		ItemSpriteSheet.POTION_SILVER,
	ItemSpriteSheet.POTION_GREEN};
	
	private static ItemStatusHandler<Potion> handler;
	
	private String color;
	
	{	
		stackable = true;		
		defaultAction = AC_DRINK;
	}
	
	@SuppressWarnings("unchecked")
	public static void initColors() {
		handler = new ItemStatusHandler<Potion>( (Class<? extends Potion>[])potions, colors, images );
	}
	
	public static void save( Bundle bundle ) {
		handler.save( bundle );
	}
	
	@SuppressWarnings("unchecked")
	public static void restore( Bundle bundle ) {
		handler = new ItemStatusHandler<Potion>( (Class<? extends Potion>[])potions, colors, images, bundle );
	}
	
	public Potion() {
		super();
		image = handler.image( this );
		color = handler.label( this );
	}
	
	@Override
	public ArrayList<String> actions( Hero hero ) {
		ArrayList<String> actions = super.actions( hero );
		actions.add( AC_DRINK );
		return actions;
	}
	
	@Override
	public void execute( final Hero hero, String action ) {
		if (action.equals( AC_DRINK )) {
			
			if (isKnown() && (
					this instanceof PotionOfLiquidFlame || 
					this instanceof PotionOfToxicGas || 
					this instanceof PotionOfParalyticGas)) {
				
					GameScene.show( 
						new WndOptions(ItemData.Potion.POTION_TXT_HARMFUL, ItemData.Potion.POTION_TXT_SURE_DRINK, ItemData.Potion.POTION_TXT_YES, ItemData.Potion.POTION_TXT_NO) {
							@Override
							protected void onSelect(int index) {
								if (index == 0) {
									drink( hero );
								}
							};
						}
					);
					
				} else {
					drink( hero );
				}
			
		} else {
			
			super.execute( hero, action );
			
		}
	}
	
	@Override
	public void doThrow( final Hero hero ) {

		if (isKnown() && (
			this instanceof PotionOfExperience || 
			this instanceof PotionOfHealing || 
			this instanceof PotionOfLevitation ||
			this instanceof PotionOfMindVision ||
			this instanceof PotionOfStrength ||
			this instanceof PotionOfInvisibility || 
			this instanceof PotionOfMight)) {
		
			GameScene.show( 
				new WndOptions(ItemData.Potion.POTION_TXT_BENEFICIAL, ItemData.Potion.POTION_TXT_SURE_THROW, ItemData.Potion.POTION_TXT_YES, ItemData.Potion.POTION_TXT_NO) {
					@Override
					protected void onSelect(int index) {
						if (index == 0) {
							Potion.super.doThrow( hero );
						}
					};
				}
			);
			
		} else {
			super.doThrow( hero );
		}
	}
	
	protected void drink( Hero hero ) {
		
		detach( hero.belongings.backpack );
		
		hero.spend( TIME_TO_DRINK );
		hero.busy();
		onThrow( hero.pos );
		
		Sample.INSTANCE.play( Assets.SND_DRINK );
		
		hero.sprite.operate( hero.pos );
	}
	
	@Override
	protected void onThrow( int cell ) {
		if (Dungeon.hero.pos == cell) {
			
			apply( Dungeon.hero );
			
		} else if (Dungeon.level.map[cell] == Terrain.WELL || Level.pit[cell]) {
			
			super.onThrow( cell );
			
		} else  {
			
			shatter( cell );
			
		}
	}
	
	protected void apply( Hero hero ) {
		shatter( hero.pos );
	}
	
	public void shatter( int cell ) {
		if (Dungeon.visible[cell]) {
			GLog.i(String.format(ItemData.Potion.POTION_TXT_SPLASH_HARMLESS, color()));
			Sample.INSTANCE.play( Assets.SND_SHATTER );
			splash( cell );
		}
	}
	
	public boolean isKnown() {
		return handler.isKnown( this );
	}
	
	public void setKnown() {
		if (!isKnown()) {
			handler.know( this );
		}
		
		Badges.validateAllPotionsIdentified();
	}
	
	@Override
	public Item identify() {
		setKnown();
		return this;
	}
	
	protected String color() {
		return color;
	}
	
	@Override
	public String name() {
		return isKnown() ? name : color + ItemData.Potion.POTION_NAME;
	}
	
	@Override
	public String info() {
		return isKnown() ?
			desc() : String.format(ItemData.Potion.POTION_DEFAULT_INFO, color);
	}
	
	@Override
	public boolean isIdentified() {
		return isKnown();
	}
	
	@Override
	public boolean isUpgradable() {
		return false;
	}
	
	public static HashSet<Class<? extends Potion>> getKnown() {
		return handler.known();
	}
	
	public static HashSet<Class<? extends Potion>> getUnknown() {
		return handler.unknown();
	}
	
	public static boolean allKnown() {
		return handler.known().size() == potions.length;
	}
	
	protected void splash( int cell ) {		
		final int color = ItemSprite.pick( image, 8, 10 );
		Splash.at( cell, color, 5 );
	}
	
	@Override
	public int price() {
		return 20 * quantity;
	}
}
