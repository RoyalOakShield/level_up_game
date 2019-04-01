package state.enemy;

import beans.Enemy;
import state.EnemyState;

public class EnemyContext {
	
	private EnemyState enemyState = null;
	
	public Enemy doAction(Enemy enemy) {
		return enemyState.doAction(enemy);
	}
	
	public EnemyState getEnemyState() {
		return enemyState;
	}
	public void setEnemyState(EnemyState enemyState) {
		this.enemyState = enemyState;
	}

}
