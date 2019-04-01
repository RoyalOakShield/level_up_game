package state.player;

import state.PlayerState;
import beans.Player;

public class PlayerContext {
	private PlayerState playerState = null;
	
	public Player doAction(Player player) {
		return playerState.doAction(player);
	}
	
	public PlayerState getPlayerState() {
		return playerState;
	}
	public void setPlayerState(PlayerState playerState) {
		this.playerState = playerState;
	}
}
