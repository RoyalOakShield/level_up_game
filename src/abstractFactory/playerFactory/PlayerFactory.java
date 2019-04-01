package abstractFactory.playerFactory;

import abstractFactory.PlayerAbstarctFactory;
import beans.Player;
//��ҹ����࣬ʵ�ֵ���
public class PlayerFactory {
	
	private static PlayerFactory instance;
	//Lazy Instantiation for Creating Players	
	public static synchronized PlayerFactory getInstance(){
		if(instance == null){
			instance = new PlayerFactory();
		}
		return instance;
	}
	
	public static Player getPlayer(PlayerAbstarctFactory player){
		return player.createPlayer();
	}
}
