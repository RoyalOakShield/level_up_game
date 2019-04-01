package abstractFactory.enemyFactory;

import abstractFactory.EnemyAbstarctFactory;
import beans.Enemy;
//敌人工厂类
public class EnemyFactory {

	public static Enemy getEnemy(EnemyAbstarctFactory enemy){
		return enemy.createEnemy();
	}
}
