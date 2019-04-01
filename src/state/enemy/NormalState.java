package state.enemy;

import beans.Enemy;
import state.EnemyState;
//ÆÕÍ¨µĞÈË×´Ì¬Àà
public class NormalState implements EnemyState{

	@Override
	public Enemy doAction(Enemy enemy) {
		enemy.normal();
		return enemy;
	}

}
