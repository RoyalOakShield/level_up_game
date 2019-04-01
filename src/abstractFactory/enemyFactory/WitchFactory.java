package abstractFactory.enemyFactory;

import abstractFactory.EnemyAbstarctFactory;
import beans.Enemy;
import beans.enemy.Witch;
//女巫工厂类
public class WitchFactory implements EnemyAbstarctFactory {
	
	private int level;
	
	public WitchFactory(int level) {
		this.level = level;
	}
	
	public Enemy createEnemy(){
		return new Witch(level);
	}
}
