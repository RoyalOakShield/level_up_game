package test;

import abstractFactory.playerFactory.*;
import beans.Player;
import composite.Item;
import composite.item.*;
import composite.item.potion.*;

public class TestItem {
//ŒÔ∆∑≤‚ ‘¿‡
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testItem();
	}
	private static void testItem(){
		Player fighter = PlayerFactory.getPlayer(new FighterFactory("Fighter"));
		
		Item potion1 = new DEFPotion(1);
		Item potion2 = new EXPPotion(5);
		
		Using using = new Using();
		using.add(potion1);
		using.add(potion2);
		
		System.out.println("This is a "+fighter);
		using.use(fighter);
		System.out.println("This is a "+fighter);

	}
}
