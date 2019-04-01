package beans.enemy;

import beans.Enemy;
//Å®Î×Àà
public class Witch extends Enemy{

	private int level;
	private String name;
	private boolean isBoss;
	private int maxHP;
	private int currentHP;
	private int ATK;
	private int DEF;
	private int SPD;
	private double HIT;
	private double EVD;
	private double CRT;
	
	public Witch(int level) {
		this.level = level;
		this.maxHP = 350 + (level - 1) * 100;
		this.currentHP = 350 + (level - 1) * 100;
		this.ATK = 52 + (level - 1) * 18;
		this.DEF = 10 + (level - 1) * 4;
		this.SPD = 99 + (level - 1) * 1;
		this.HIT = 0.6;
		this.EVD = 0;
		this.CRT = 0.1;
	}
	
	public void normal(){
		if(isBoss){
			setMaxHP((getMaxHP() - getLevel() * 6) / 2);
			setCurrentHP((getCurrentHP() - getLevel() * 6) / 2);
			setATK(getATK() - getLevel() * 6);
			setDEF(getDEF() - getLevel() * 2);
			setHIT(getHIT() - 0.15);
			setCRT(getCRT() - 0.1);
			setBoss(false);
		}
	}
	
	public void boss(){
		if(!isBoss){
			setMaxHP(getMaxHP() * 2 + getLevel() * 6);
			setCurrentHP(getCurrentHP() * 2 + getLevel() * 6);
			setATK(getATK() + getLevel() * 6);
			setDEF(getDEF() + getLevel() * 2);
			setHIT(getHIT() + 0.15);
			setCRT(getCRT() + 0.1);
			setBoss(true);
		}
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean getIsBoss() {
		return isBoss;
	}

	public void setBoss(boolean isBoss) {
		this.isBoss = isBoss;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

	public int getATK() {
		return ATK;
	}

	public void setATK(int aTK) {
		ATK = aTK;
	}

	public int getDEF() {
		return DEF;
	}

	public void setDEF(int dEF) {
		DEF = dEF;
	}

	public int getSPD() {
		return SPD;
	}

	public void setSPD(int sPD) {
		SPD = sPD;
	}

	public double getHIT() {
		return HIT;
	}

	public void setHIT(double hIT) {
		HIT = hIT;
	}

	public double getEVD() {
		return EVD;
	}

	public void setEVD(double eVD) {
		EVD = eVD;
	}

	public double getCRT() {
		return CRT;
	}

	public void setCRT(double cRT) {
		CRT = cRT;
	}		

}

