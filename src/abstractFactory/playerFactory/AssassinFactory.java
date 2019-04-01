package abstractFactory.playerFactory;

import abstractFactory.PlayerAbstarctFactory;
import beans.Player;
import beans.player.Assassin;
//�̿͹�����
public class AssassinFactory implements PlayerAbstarctFactory {
	
	private String name;
	
	public AssassinFactory(String name) {
		this.name = name;
	}
	
	public Player createPlayer(){
		return new Assassin(name);
	}
}
