package state.player;

import beans.Player;
import state.PlayerState;

public class DeadState implements PlayerState{
	
	public Player doAction(Player player) {
		player.dead();
		return player;
	}

}
