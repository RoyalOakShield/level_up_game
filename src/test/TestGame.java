package test;

import java.util.Scanner;

import abstractFactory.enemyFactory.*;
import abstractFactory.playerFactory.*;
import beans.Enemy;
import beans.Player;
import util.Fighting;
import util.myRandom;

public class TestGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGame();
	}
	private static void testGame(){
		System.out.println("Welcome to Level up game");
		System.out.println("Please choose your branch(enter number 1 to 4)");
		System.out.println("1.Assassin  2. Fighter  3.Mage  4.Marksman");
		Scanner sc = new Scanner(System.in);
		int branch = sc.nextInt();
		System.out.println("Please enter your name");
		String name = sc.next();
		Player player;
		if(branch==1) {
			player = PlayerFactory.getPlayer(new AssassinFactory(name));
		}else if(branch==2) {
			player = PlayerFactory.getPlayer(new FighterFactory(name));
		}else if(branch==3) {
			player = PlayerFactory.getPlayer(new MageFactory(name));
		}else{
			player = PlayerFactory.getPlayer(new MarksmanFactory(name));
		}
		System.out.println("create new player successful");
		System.out.println(player);
		System.out.println();
		while(true) {
			int num = myRandom.randomInt(1, 4);
			Enemy enemy;
			if(num==1) {
				enemy = EnemyFactory.getEnemy(new BeastFactory(myRandom.randomInt(1, player.getLevel())));
			}else if(num==2) {
				enemy = EnemyFactory.getEnemy(new GhostFactory(myRandom.randomInt(1, player.getLevel())));
			}else if(num==3) {
				enemy = EnemyFactory.getEnemy(new WitchFactory(myRandom.randomInt(1, player.getLevel())));
			}else{
				enemy = EnemyFactory.getEnemy(new ZombieFactory(myRandom.randomInt(1, player.getLevel())));
			}
			System.out.println("you meet an enemy：");
			System.out.println(enemy);
			System.out.println("enter 5 to fight");
			if(sc.next().equals("5")) {
				Fighting fighting = new Fighting(player,enemy);
				boolean isWin = fighting.fight();
				if(isWin) {
					player.levelUp();
					System.out.println(player.getName()+" level up！");
					System.out.println(player);
				}
			}else {
				System.out.println("run away...");
			}
			System.out.println();
		}
	}
}
