package composite.item.potion;

import composite.item.Potion;
import beans.Player;

public class DEFPotion extends Potion{

	private int level;
	
	public DEFPotion(int level) {
		// TODO Auto-generated constructor stub
		super.setDEF(5 + level * 2);	
		super.setName("DEFPotion");
	}

	public void use(Player player){
		player.setDEF(player.getDEF() + this.getDEF());
		System.out.println(player.getName()+ " use "+getName()+", DEF increased by " + this.getDEF());
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
