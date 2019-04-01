package beans;

import builder.Equipment;
import builder.equipment.Accessories;
import builder.equipment.Armor;
import builder.equipment.Arms;
import builder.equipment.Shoes;

//抽象玩家类
public abstract class Player {
		
	private Equipment equipment;
	
	public abstract String getName();
	public abstract void setName(String name);
    public abstract int getLevel();
    public abstract void setLevel(int level);
    public abstract int getMaxHP();
    public abstract void setMaxHP(int maxHP);
    public abstract int getCurrentHP();
    public abstract void setCurrentHP(int currentHP);
    public abstract int getMaxEXP();
    public abstract void setMaxEXP(int maxEXP);
    public abstract int getCurrentEXP();
    public abstract void setCurrentEXP(int currentEXP);
    public abstract int getATK();//攻击力
    public abstract void setATK(int ATK);
    public abstract int getDEF();//防御力
    public abstract void setDEF(int DEF);
    public abstract int getSPD();//速度
    public abstract void setSPD(int SPD);
    public abstract double getHIT();//命中率
    public abstract void setHIT(double HIT);
    public abstract double getEVD();//闪避率
    public abstract void setEVD(double EVD);
    public abstract double getCRT();//暴击率
    public abstract void setCRT(double CRT);
    
    public Player(){
    	Armor armor = new Armor(1);
		Arms arms = new Arms(1);
		Shoes shoes = new Shoes(1);
		Accessories accessories = new Accessories(1);
		this.equipment = new Equipment.EquipmentBuilder().setArms(arms).
				setArmor(armor).setShoes(shoes).setAccessories(accessories).build();
    }
    //equipment
    public void setEquipment(Equipment equipment){
    	this.equipment = equipment;
    }
    public Equipment getEquipment(){
    	return equipment;
    }
    public void wear(Armor armor){
    	this.equipment.setArmor(armor);
    }
    public void wear(Arms arms){
    	this.equipment.setArms(arms);
    }
    public void wear(Shoes shoes){
    	this.equipment.setShoes(shoes);
    }
    public void wear(Accessories accessories){
    	this.equipment.setAccessories(accessories);
    }
        
    public abstract void levelUp();
    
    //state
    public abstract boolean isNormal();
    public abstract void setNormal(boolean isNormal);
    public abstract boolean isDefisive();
    public abstract void setDefisive(boolean isDefisive);
    public abstract boolean isCrazy();
    public abstract void setCrazy(boolean isCrazy);
    public abstract boolean isWeak();
    public abstract void setWeak(boolean isWeak);
    public abstract void normal();
    public abstract void defensive();
    public abstract void crazy();
    public abstract void weak();
    public abstract void dead();
   	
	public String toString() {
		return getClass().getSimpleName()+ "[Name=" + getName() + ", Level=" + getLevel()
				+ ", MaxHP=" + getMaxHP() + ", CurrentHP="
				+ getCurrentHP() + ", MaxEXP=" + getMaxEXP()
				+ ", CurrentEXP=" + getCurrentEXP() + ", ATK="
				+ getATK() + ", DEF=" + getDEF() + ", SPD="
				+ getSPD() + ", HIT=" + getHIT()*100 + "%, EVD="
				+ getEVD()*100 + "%, CRT=" + getCRT()*100 + "%]";
	}
}
