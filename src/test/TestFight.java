package test;

import util.Fighting;
import abstractFactory.enemyFactory.*;
import abstractFactory.playerFactory.*;
import beans.Enemy;
import beans.Player;

public class TestFight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testFight();
	}
	private static void testFight(){
		Enemy beast = EnemyFactory.getEnemy(new BeastFactory(1));
		Player marksman = PlayerFactory.getPlayer(new MarksmanFactory("Marksman"));
		Fighting fighting = new Fighting(marksman,beast);
		fighting.fight();
		marksman.levelUp();
		Enemy ghost = EnemyFactory.getEnemy(new GhostFactory(2));
		fighting = new Fighting(marksman,ghost);
		fighting.fight();
	}
}
