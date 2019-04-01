package abstractFactory.enemyFactory;

import abstractFactory.EnemyAbstarctFactory;
import beans.Enemy;
//���˹�����
public class EnemyFactory {

	public static Enemy getEnemy(EnemyAbstarctFactory enemy){
		return enemy.createEnemy();
	}
}
