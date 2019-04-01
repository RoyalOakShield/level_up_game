package abstractFactory.enemyFactory;

import abstractFactory.EnemyAbstarctFactory;
import beans.Enemy;
import beans.enemy.Beast;
//“∞ ﬁπ§≥ß¿‡
public class BeastFactory implements EnemyAbstarctFactory {
	
	private int level;
	
	public BeastFactory(int level) {
		this.level = level;
	}
	
	public Enemy createEnemy(){
		return new Beast(level);
	}
}
