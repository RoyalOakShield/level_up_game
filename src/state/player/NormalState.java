package state.player;

import beans.Player;
import state.PlayerState;

public class NormalState implements PlayerState{
	
	public Player doAction(Player player) {
		player.normal();
		return player;
	}

}
