package test;

import state.player.*;
import beans.Player;
import abstractFactory.playerFactory.*;
//ÕÊº“≤‚ ‘¿‡
public class TestPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testPlayer();
	}
	
	private static void testPlayer(){
		Player fighter = PlayerFactory.getPlayer(new FighterFactory("Fighter"));
		Player mage = PlayerFactory.getPlayer(new MageFactory("Mage"));
		Player marksman = PlayerFactory.getPlayer(new MarksmanFactory("Marksman"));
		Player assassin = PlayerFactory.getPlayer(new AssassinFactory("Assassin"));
		Player assassin1 = PlayerFactory.getPlayer(new AssassinFactory("123"));
		
		System.out.println("This is a "+fighter);
		System.out.println("This is a "+mage);
		System.out.println("This is a "+marksman);
		System.out.println("This is a "+assassin);
		System.out.println("This is a "+assassin1);
		PlayerContext pc = new PlayerContext();
		pc.setPlayerState(new CrazyState());
		pc.doAction(assassin);
		System.out.println("This is a "+assassin);
	}

}
