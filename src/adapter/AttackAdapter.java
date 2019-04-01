package adapter;

import adapter.attack.*;
//π•ª˜  ≈‰∆˜¿‡
public class AttackAdapter implements Attack{
	
	private AttackMode attackMode;

	public AttackAdapter(String attackType) {
		// TODO Auto-generated constructor stub
		if(attackType.equals("basicAttack")){
			attackMode = new BasicAttack();
		}else if(attackType.equals("specialAttack")){
			attackMode = new SpecialAttack();
		}
	}
	public void attack(String attackType){
		if(attackType.equals("basicAttack")){
			attackMode.basicAttack();
		}else if(attackType.equals("specialAttack")){
			attackMode.specialAttack();
		}
	}
}
