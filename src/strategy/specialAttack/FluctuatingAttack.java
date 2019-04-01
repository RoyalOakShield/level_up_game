package strategy.specialAttack;

import beans.Player;

import strategy.SpecialAttackStrategy;

public class FluctuatingAttack implements SpecialAttackStrategy{
	
	private Player player;
	
	public FluctuatingAttack(Player player) {
		// TODO Auto-generated constructor stub
		this.player = player;
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		System.out.println(player.getName() +" use Flucatuating Attack");
	}

}
