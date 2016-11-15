package summonerswar_test;

public class EnemyBoss extends Monsters
{		
	
	public EnemyBoss() 
	{
		this("판고르", Battle.TYPE_ENEMYBOSS, 100);
	}	
	
	public EnemyBoss(String name, String type, int level)
	{
		this.name = name;
		this.type = type;		
		this.healthPower = level * 1000;
		this.attack = 20;
	}	

	public String getName()
	{
		return name;
	}
	
	public void beaten(int attack)
	{
		this.healthPower -= attack;
		System.out.println(getName() + "가 공격을 받아서 체력이" + this.healthPower + "가 되었습니다.");
		
		ActionPoint myAp = new ActionPoint();
		myAp.checkAP();
	}
	
	public void hit(int attack){}
	public void checkBossAp(){}
	
	public void checkDefenderAp(){}
		
	public void checkPhysicalAp(){}
	
	public void checkSupporterAp(){}



}