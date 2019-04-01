package composite.item.potion;

import composite.item.Potion;
import beans.Player;

public class EXPPotion extends Potion{

	private int level;
	
	public EXPPotion(int level) {
		// TODO Auto-generated constructor stub
		super.setEXP(5 + level * 2);	
		super.setName("EXPPotion");
	}

	public void use(Player player){
		player.setCurrentEXP(player.getCurrentEXP() + this.getEXP());
		System.out.println(player.getName()+ " use "+getName()+", EXP increased by " + this.getEXP());
		while(player.getCurrentEXP() > player.getMaxEXP()){
			player.levelUp();
		}
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
