package abstractFactory.enemyFactory;

import abstractFactory.EnemyAbstarctFactory;
import beans.Enemy;
import beans.enemy.Ghost;
//���鹤����
public class GhostFactory implements EnemyAbstarctFactory {
	
	private int level;
	
	public GhostFactory(int level) {
		this.level = level;
	}
	
	public Enemy createEnemy(){
		return new Ghost(level);
	}
}
