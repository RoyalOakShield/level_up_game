package strategy.specialAttack;

import beans.Player;

import strategy.SpecialAttackStrategy;

public class FatalAttack implements SpecialAttackStrategy{
	
	private Player player;
	
	public FatalAttack(Player player) {
		// TODO Auto-generated constructor stub
		this.player = player;
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		System.out.println(player.getName() +" use Fatal Attack");
	}

}
