package builder.equipment;

import util.myRandom;

public class Arms {
	
	private int level;
	private int ATK;
	
	public Arms(int level){
		this.level = level;
		this.ATK = 8 + (level - 1) * 5 * myRandom.randomInt(80,120)/100;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getATK() {
		return ATK;
	}
	public void setATK(int ATK) {
		this.ATK = ATK;
	}

	public String toString() {
		return "Arms [level=" + level + ", ATK=" + ATK + "]";
	}
	
}
