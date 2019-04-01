package abstractFactory.enemyFactory;

import abstractFactory.EnemyAbstarctFactory;
import beans.Enemy;
import beans.enemy.Zombie;
//Ω© ¨π§≥ß¿‡
public class ZombieFactory implements EnemyAbstarctFactory {
	
	private int level;
	
	public ZombieFactory(int level) {
		this.level = level;
	}
	
	public Enemy createEnemy(){
		return new Zombie(level);
	}
}
