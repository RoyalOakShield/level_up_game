package test;

import abstractFactory.playerFactory.MageFactory;
import abstractFactory.playerFactory.PlayerFactory;
import beans.Player;
import builder.Equipment;
import builder.equipment.*;

public class TestEquipment {
//װ��������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testEquipment();
	}
	private static void testEquipment(){
		Armor armor = new Armor(5);
		Arms arms = new Arms(5);
		Shoes shoes = new Shoes(5);
		Accessories accessories = new Accessories(5);
		Equipment equipment = new Equipment.EquipmentBuilder().setArms(arms).
				setArmor(armor).setShoes(shoes).setAccessories(accessories).build();
		
		Player mage = PlayerFactory.getPlayer(new MageFactory("Mage"));
		System.out.println(mage.getEquipment());
		mage.setEquipment(equipment);
		
		System.out.println(mage.getEquipment());
		Armor ar = new Armor(10);
		mage.wear(ar);
		System.out.println(mage.getEquipment());
	}
}
