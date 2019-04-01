package abstractFactory.playerFactory;

import abstractFactory.PlayerAbstarctFactory;
import beans.Player;
import beans.player.Marksman;
//���ֹ�����
public class MarksmanFactory implements PlayerAbstarctFactory {
	
	private String name;
	
	public MarksmanFactory(String name) {
		this.name = name;
	}
	
	public Player createPlayer(){
		return new Marksman(name);
	}
}