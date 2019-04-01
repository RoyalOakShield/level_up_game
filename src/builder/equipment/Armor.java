package builder.equipment;

import util.myRandom;

public class Armor {
	
	private int level;
	private int DEF;
	
	public Armor(int level){
		this.level = level;
		this.DEF = 5 + (level - 1) * 3 * myRandom.randomInt(80,120)/100;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getDEF() {
		return DEF;
	}
	public void setDEF(int DEF) {
		this.DEF = DEF;
	}
	
	public String toString() {
		return "Armor [level=" + level + ", DEF=" + DEF + "]";
	}
	
}
