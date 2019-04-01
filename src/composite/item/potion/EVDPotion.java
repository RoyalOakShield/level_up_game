package composite.item.potion;

import composite.item.Potion;
import beans.Player;

public class EVDPotion extends Potion{

	private int level;
	
	public EVDPotion(int level) {
		// TODO Auto-generated constructor stub
		super.setEVD(0.1 + level * 0.02);	
		super.setName("EVDPotion");
	}

	public void use(Player player){
		player.setEVD(player.getEVD() + this.getEVD());
		System.out.println(player.getName()+ " use "+getName()+", EVD increased by " + this.getEVD());
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
