package composite.item.potion;

import composite.item.Potion;
import beans.Player;

public class ATKPotion extends Potion{

	private int level;
	
	public ATKPotion(int level) {
		// TODO Auto-generated constructor stub
		super.setATK(10 + level * 4);	
		super.setName("ATKPotion");
	}

	public void use(Player player){
		player.setATK(player.getATK() + this.getATK());
		System.out.println(player.getName()+ " use "+getName()+", ATK increased by " + this.getATK());
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
