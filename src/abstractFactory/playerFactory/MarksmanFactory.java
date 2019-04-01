package abstractFactory.playerFactory;

import abstractFactory.PlayerAbstarctFactory;
import beans.Player;
import beans.player.Marksman;
//射手工厂类
public class MarksmanFactory implements PlayerAbstarctFactory {
	
	private String name;
	
	public MarksmanFactory(String name) {
		this.name = name;
	}
	
	public Player createPlayer(){
		return new Marksman(name);
	}
}