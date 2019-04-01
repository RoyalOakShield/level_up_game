package composite.item.potion;

import composite.item.Potion;
import beans.Player;

public class HPPotion extends Potion{

	private int level;
	
	public HPPotion(int level) {
		// TODO Auto-generated constructor stub
		super.setHP(30 + level * 10);	
		super.setName("HPPotion");
	}

	public void use(Player player){
		if(player.getCurrentHP() + this.getHP() >= player.getMaxHP()){
			player.setCurrentHP(player.getMaxHP());
		}else{
			player.setCurrentHP(player.getCurrentHP() + this.getHP());
		}
		
		System.out.println(player.getName()+ " use "+getName()+", HP increased by " + this.getHP());
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
