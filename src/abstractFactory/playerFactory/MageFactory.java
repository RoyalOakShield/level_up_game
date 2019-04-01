package abstractFactory.playerFactory;

import abstractFactory.PlayerAbstarctFactory;
import beans.Player;
import beans.player.Mage;
//法师工厂类
public class MageFactory implements PlayerAbstarctFactory {
	
	private String name;
	
	public MageFactory(String name) {
		this.name = name;
	}
	
	public Player createPlayer(){
		return new Mage(name);
	}
}