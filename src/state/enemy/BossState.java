package state.enemy;

import beans.Enemy;
import state.EnemyState;
//Boss����״̬��
public class BossState implements EnemyState{
	
	public Enemy doAction(Enemy enemy) {
		enemy.boss();
		return enemy;
	}

}
