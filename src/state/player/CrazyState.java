package state.player;

import beans.Player;
import state.PlayerState;

public class CrazyState implements PlayerState{
	
	public Player doAction(Player player) {
		player.crazy();
		return player;
	}

}
