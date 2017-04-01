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
package com.watabou.pixeldungeon.actors.hero;

import com.lumi.pdmod.data.HeroData;
import com.watabou.utils.Bundle;

public enum HeroSubClass {

	NONE( null, null ),
	
	GLADIATOR(HeroData.Subclasses.HERO_SUB_GLADIATOR_NAME, HeroData.Subclasses.HERO_SUB_GLADIATOR_DESC),
	BERSERKER(HeroData.Subclasses.HERO_SUB_BERSERKER_NAME, HeroData.Subclasses.HERO_SUB_BERSERKER_DESC),
	
	WARLOCK(HeroData.Subclasses.HERO_SUB_WARLOCK_NAME, HeroData.Subclasses.HERO_SUB_WARLOCK_DESC),
	BATTLEMAGE(HeroData.Subclasses.HERO_SUB_BATTLEMAGE_NAME, HeroData.Subclasses.HERO_SUB_BATTLEMAGE_DESC),
	
	ASSASSIN(HeroData.Subclasses.HERO_SUB_ASSASSIN_NAME, HeroData.Subclasses.HERO_SUB_ASSASSIN_DESC),
	FREERUNNER(HeroData.Subclasses.HERO_SUB_FREERUNNER_NAME, HeroData.Subclasses.HERO_SUB_FREERUNNER_DESC),
		
	SNIPER(HeroData.Subclasses.HERO_SUB_SNIPER_NAME, HeroData.Subclasses.HERO_SUB_SNIPER_DESC),
	WARDEN(HeroData.Subclasses.HERO_SUB_WARDEN_NAME, HeroData.Subclasses.HERO_SUB_WARDEN_DESC);

	private String title;
	private String desc;
	
	private HeroSubClass( String title, String desc ) {
		this.title = title;
		this.desc = desc;
	}
	
	public String title() {
		return title;
	}
	
	public String desc() {
		return desc;
	}
	
	private static final String SUBCLASS	= "subClass";
	
	public void storeInBundle( Bundle bundle ) {
		bundle.put( SUBCLASS, toString() );
	}
	
	public static HeroSubClass restoreInBundle( Bundle bundle ) {
		String value = bundle.getString( SUBCLASS );
		try {
			return valueOf( value );
		} catch (Exception e) {
			return NONE;
		}
	}
}
