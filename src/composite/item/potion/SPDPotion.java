package composite.item.potion;

import composite.item.Potion;
import beans.Player;

public class SPDPotion extends Potion{

	private int level;
	
	public SPDPotion(int level) {
		// TODO Auto-generated constructor stub
		super.setSPD(10 + level * 3);	
		super.setName("SPDPotion");
	}

	public void use(Player player){
		player.setSPD(player.getSPD() + this.getSPD());
		
		System.out.println(player.getName()+ " use "+getName()+", SPD increased by " + this.getSPD());
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
