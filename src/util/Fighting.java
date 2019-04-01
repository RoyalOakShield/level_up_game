package util;

import beans.Enemy;
import beans.Player;

public class Fighting {
	
	private Player player;
	private Enemy enemy;
	
	public Fighting(Player player, Enemy enemy) {
		this.player = player;
		this.enemy = enemy;
	}
	
	public void attack(Player player, Enemy enemy){
		
		int damage = player.getATK() + player.getEquipment().getATK() - enemy.getDEF();
		if(damage < 0){
			damage = 0;
		}
		if(isCRT(player.getCRT())){
			damage *= 1.5;
		}
		if(!isHIT(player.getHIT(),enemy.getEVD())){
			damage *= 0;
		}
		if(enemy.getCurrentHP() - damage > 0){
			enemy.setCurrentHP(enemy.getCurrentHP() - damage);
		}else{
			enemy.setCurrentHP(0);
		}
		System.out.println(player.getName() +" causes " + damage + " damage, "+ enemy.getName()
				+" remains "+ enemy.getCurrentHP() + " HP");
	}
	
	public void attack(Enemy enemy, Player player){
		int damage = enemy.getATK() - player.getEquipment().getDEF() - player.getDEF();
		if(damage < 0){
			damage = 0;
		}
		if(isCRT(enemy.getCRT())){
			damage *= 1.5;
		}
		if(!isHIT(enemy.getHIT(),player.getEVD())){
			damage *= 0;
		}
		if(player.getCurrentHP() - damage > 0){
			player.setCurrentHP(player.getCurrentHP() - damage);
		}else{
			player.setCurrentHP(0);
		}
		System.out.println(enemy.getName() +" causes " + damage + " damage, "+ player.getName()
				+" remains "+ player.getCurrentHP() + " HP");
	}
	
	public boolean fight(){
		System.out.println("fight begin:");
		while(player.getCurrentHP() > 0 || enemy.getCurrentHP() > 0){
			if(isPlayerAttack(player, enemy)){
				attack(player, enemy);
			}else{
				attack(enemy, player);
			}
			if(enemy.getCurrentHP()<= 0){
				System.out.println("***"+player.getName() +" win***");
				System.out.println("fight finish\n");
				return true;
			}
			if(player.getCurrentHP()<= 0){
				System.out.println("***"+enemy.getName() +" win***");
				System.out.println("fight finish\n");
				return false;
			}
		}	
		return true;
	}
	
	private boolean isCRT(double CRT){
		return CRT > myRandom.randomDouble(0, 1);
	}
	
	private boolean isHIT(double HIT,double EVD){
		return (1- EVD)/HIT > myRandom.randomDouble(0, 1);
	}
	private boolean isPlayerAttack(Player player, Enemy enemy){
		int playSPD = player.getSPD() + player.getEquipment().getSPD();
		return playSPD > myRandom.randomInt(0, playSPD + enemy.getSPD());
	}
}
