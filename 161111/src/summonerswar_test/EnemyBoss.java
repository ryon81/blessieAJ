package summonerswar_test;

public class EnemyBoss extends Monsters
{		
	
	public EnemyBoss() 
	{
		this("�ǰ�", Battle.TYPE_ENEMYBOSS, 100);
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
		System.out.println(getName() + "�� ������ �޾Ƽ� ü����" + this.healthPower + "�� �Ǿ����ϴ�.");
		
		ActionPoint myAp = new ActionPoint();
		myAp.checkAP();
	}
	
	public void hit(int attack){}
	public void checkBossAp(){}
	
	public void checkDefenderAp(){}
		
	public void checkPhysicalAp(){}
	
	public void checkSupporterAp(){}



}