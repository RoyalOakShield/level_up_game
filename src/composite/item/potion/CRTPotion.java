package composite.item.potion;

import composite.item.Potion;
import beans.Player;

public class CRTPotion extends Potion{

	private int level;
	
	public CRTPotion(int level) {
		// TODO Auto-generated constructor stub
		super.setCRT(0.1 + level * 0.02);	
		super.setName("CRTPotion");
	}

	public void use(Player player){
		player.setCRT(player.getCRT() + this.getCRT());
		System.out.println(player.getName()+ " use "+getName()+", CRT increased by " + this.getCRT());
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
