package abstractFactory;

import beans.Enemy;

public interface EnemyAbstarctFactory extends AbstractFactory{
	public Enemy createEnemy();
}
