package abstractFactory.enemyFactory;

import abstractFactory.EnemyAbstarctFactory;
import beans.Enemy;
import beans.enemy.Ghost;
//”ƒ¡Èπ§≥ß¿‡
public class GhostFactory implements EnemyAbstarctFactory {
	
	private int level;
	
	public GhostFactory(int level) {
		this.level = level;
	}
	
	public Enemy createEnemy(){
		return new Ghost(level);
	}
}
