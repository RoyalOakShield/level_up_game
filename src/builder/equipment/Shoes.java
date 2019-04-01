package builder.equipment;

import util.myRandom;

public class Shoes {
	
	private int level;
	private int SPD;
	
	public Shoes(int level){
		this.level = level;
		this.SPD = 10 + (level - 1) * 5 * myRandom.randomInt(80,120)/100;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getSPD() {
		return SPD;
	}
	public void setSPD(int SPD) {
		this.SPD = SPD;
	}

	public String toString() {
		return "Shoes [level=" + level + ", SPD=" + SPD + "]";
	}
	
}
