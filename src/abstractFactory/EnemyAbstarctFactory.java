package abstractFactory;

import beans.Enemy;
//抽象敌人工厂接口
public interface EnemyAbstarctFactory {
	public Enemy createEnemy();
}
