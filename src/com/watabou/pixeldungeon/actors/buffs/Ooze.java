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
package com.watabou.pixeldungeon.actors.buffs;

import com.jpl.pdmod.data.BuffData;
import com.jpl.pdmod.data.HeroData;
import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.levels.Level;
import com.watabou.pixeldungeon.ui.BuffIndicator;
import com.watabou.pixeldungeon.utils.GLog;
import com.watabou.pixeldungeon.utils.Utils;

public class Ooze extends Buff {

	public int damage	= 1;
	
	@Override
	public int icon() {
		return BuffIndicator.OOZE;
	}
	
	@Override
	public String toString() {
		return BuffData.BUFF_OOZE_DESC;
	}
	
	@Override
	public boolean act() {
		if (target.isAlive()) {
			target.damage( damage, this );
			if (!target.isAlive() && target == Dungeon.hero) {
				Dungeon.fail( Utils.format( HeroData.ResultDescriptions.RESULT_OOZE, Dungeon.depth ) );
				GLog.n(HeroData.Death.DEATH_HERO, toString() );
			}
			spend( TICK );
		}
		if (Level.water[target.pos]) {
			detach();
		}
		return true;
	}
}
