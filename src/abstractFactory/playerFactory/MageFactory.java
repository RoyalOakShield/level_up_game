package abstractFactory.playerFactory;

import abstractFactory.PlayerAbstarctFactory;
import beans.Player;
import beans.player.Mage;
//��ʦ������
public class MageFactory implements PlayerAbstarctFactory {
	
	private String name;
	
	public MageFactory(String name) {
		this.name = name;
	}
	
	public Player createPlayer(){
		return new Mage(name);
	}
}