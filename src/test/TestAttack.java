package test;

import strategy.specialAttack.*;
import beans.Player;
import abstractFactory.playerFactory.*;
import adapter.AttackSelection;

public class TestAttack {

	public static void main(String[] args){
		// TODO Auto-generated constructor stub
		testAttack();
	}
	
	private static void testAttack(){
		AttackSelection attackSelection = new AttackSelection();
		attackSelection.attack("basicAttack");
		attackSelection.attack("specialAttack");
		
		Player mage = PlayerFactory.getPlayer(new MageFactory("Mage"));
		new FluctuatingAttack(mage).specialAttack();
		new FatalAttack(mage).specialAttack();
	}

}
