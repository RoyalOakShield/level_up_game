package beans.player;

import beans.Player;
//’Ω ø¿‡
public class Fighter extends Player {
	
	private String name;
	private int level;
	private int maxHP;
	private int currentHP;
	private int maxEXP;
	private int currentEXP;
	private int ATK;
	private int DEF;
	private int SPD;
	private double HIT;
	private double EVD;
	private double CRT;
	//state
	private boolean isNormal;
	private boolean isDefisive;
	private boolean isCrazy;
	private boolean isWeak;
	
	public Fighter(String name) {
		super();
		this.name = name;
		this.level = 1;
		this.maxHP = 350;
		this.currentHP = 350;
		this.maxEXP = 25;
		this.currentEXP = 0;
		this.ATK = 25;
		this.DEF = 10;
		this.SPD = 100;
		this.HIT = 1;
		this.EVD = 0.1;
		this.CRT = 0.05;
		this.isNormal = true;
		this.isDefisive = false;
		this.isCrazy = false;
		this.isWeak = false;
	}
	
	public void levelUp(){
		this.setCurrentEXP(getCurrentEXP() - getMaxEXP());
		this.setLevel(getLevel() + 1);
		this.setMaxEXP(25 + getLevel() * getLevel() * 15);
		this.setMaxHP(this.getMaxHP() + 60);
		this.setCurrentHP(this.getMaxHP());
		this.setATK(this.getATK() + 6);
		this.setDEF(this.getDEF() + 4);
		this.setSPD(this.getSPD() + 3);
	}
	
    public void normal(){
    	if(isDefisive){
    		this.ATK /= 0.5;
    		this.DEF /= 3;
    		this.SPD += 30;
    	}else if(isCrazy){
        	this.ATK /= 1.5;
        	this.SPD -= 25;
    	}else if(isWeak){
        	this.ATK /= 0.75;
        	this.DEF /= 0.75;
        	this.SPD += 25;
    	}
    	this.EVD = 0.1;
    	this.CRT = 0.05;
    	isNormal = true;
    }
    
    public void defensive(){
    	if(isNormal){
    	this.ATK *= 0.5;
    	this.DEF *= 3;
    	this.SPD -= 30;
    	this.EVD = 0.5;
    	this.CRT = 0;
    	this.isDefisive = true;
    	this.isNormal = false;
    	}
    }
    
    public void crazy(){
    	if(isNormal){
    	this.ATK *= 1.5;
    	this.SPD += 25;
    	this.EVD = 0.25;
    	this.CRT = 0.5;
    	this.isCrazy = true;
    	this.isNormal = false;
    	}
    }
    
    public void weak(){
    	if(isNormal){
    	this.ATK *= 0.75;
    	this.DEF *= 0.75;
    	this.SPD -= 25;
    	this.EVD = 0;
    	this.CRT = 0;
    	this.isWeak = true;
    	this.isNormal = false;
    	}
    }
    
    public void dead(){
		this.currentHP = 0;
		this.currentEXP *= 0.5;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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

	public int getMaxEXP() {
		return maxEXP;
	}

	public void setMaxEXP(int maxEXP) {
		this.maxEXP = maxEXP;
	}

	public int getCurrentEXP() {
		return currentEXP;
	}

	public void setCurrentEXP(int currentEXP) {
		this.currentEXP = currentEXP;
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

	public boolean isNormal() {
		return isNormal;
	}

	public void setNormal(boolean isNormal) {
		this.isNormal = isNormal;
	}

	public boolean isDefisive() {
		return isDefisive;
	}

	public void setDefisive(boolean isDefisive) {
		this.isDefisive = isDefisive;
	}

	public boolean isCrazy() {
		return isCrazy;
	}

	public void setCrazy(boolean isCrazy) {
		this.isCrazy = isCrazy;
	}

	public boolean isWeak() {
		return isWeak;
	}

	public void setWeak(boolean isWeak) {
		this.isWeak = isWeak;
	}
	
}
