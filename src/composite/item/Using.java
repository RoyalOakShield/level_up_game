package composite.item;

import java.util.*;

import beans.Player;
import composite.Item;

public class Using implements Item{

	private List<Item> items = new ArrayList<Item>();
	
	public void use(Player player) {		
		for(Item item : items)
		{
			item.use(player);
		}
		System.out.println("All items are using by " + player.getName());
	}
	public void add(Item item){
		this.items.add(item);
	}
	
	public void remove(Item item){
		items.remove(item);
	}
	
	public void clear(){
		this.items.clear();
	}
}
