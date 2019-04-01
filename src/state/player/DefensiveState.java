package state.player;

import beans.Player;
import state.PlayerState;

public class DefensiveState implements PlayerState{
	
	public Player doAction(Player player) {
		player.defensive();
		return player;
	}

}
