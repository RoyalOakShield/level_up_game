package state.enemy;

import beans.Enemy;
import state.EnemyState;
//BossµĞÈË×´Ì¬Àà
public class BossState implements EnemyState{
	
	public Enemy doAction(Enemy enemy) {
		enemy.boss();
		return enemy;
	}

}
