package abstractFactory.playerFactory;

import abstractFactory.PlayerAbstarctFactory;
import beans.Player;
import beans.player.Fighter;
//սʿ������
public class FighterFactory implements PlayerAbstarctFactory {
	
	private String name;
	
	public FighterFactory(String name) {
		this.name = name;
	}
	
	public Player createPlayer(){
		return new Fighter(name);
	}
}
