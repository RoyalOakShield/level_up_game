package composite.item;

import beans.Player;
import composite.Item;
//“©∆∑¿‡
public abstract class Potion implements Item{

	private String name;
	private int HP;
	private int EXP;
	private int ATK;
	private int DEF;
	private int SPD;
	private double HIT;
	private double EVD;
	private double CRT;


	
	public Potion() {
		name = "Potion";
		ATK = 0;
		DEF = 0;
		SPD = 0;
		HIT = 0;
		EVD = 0;
		CRT = 0;
		HP = 0;
		EXP = 0;
	}

	public abstract void use(Player player); 
	
	public int getDEF() {
		return DEF;
	}

	public void setDEF(int DEF) {
		this.DEF = DEF;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getATK() {
		return ATK;
	}

	public void setATK(int ATK) {
		this.ATK = ATK;
	}

	public int getSPD() {
		return SPD;
	}

	public void setSPD(int SPD) {
		this.SPD = SPD;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public int getEXP() {
		return EXP;
	}

	public void setEXP(int EXP) {
		this.EXP = EXP;
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
