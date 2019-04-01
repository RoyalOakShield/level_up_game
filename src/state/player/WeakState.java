package state.player;

import beans.Player;
import state.PlayerState;

public class WeakState implements PlayerState{
	
	public Player doAction(Player player) {
		player.weak();
		return player;
	}

}
