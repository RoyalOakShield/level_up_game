package composite.item.potion;

import composite.item.Potion;
import beans.Player;

public class HITPotion extends Potion{

	private int level;
	
	public HITPotion(int level) {
		// TODO Auto-generated constructor stub
		super.setHIT(0.1 + level * 0.02);	
		super.setName("HITPotion");
	}

	public void use(Player player){
		player.setHIT(player.getHIT() + this.getHIT());
		System.out.println(player.getName()+ " use "+getName()+", HIT increased by " + this.getHIT());
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
