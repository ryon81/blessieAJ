package summonerswar;

public class Attacker extends Monsters
{	
	public Attacker() 
	{
		this("������", Battle.TYPE_ATTAKER, 40);
		this.actionPoint = super.actionPoint;
	}	
	
	public Attacker(String name, String type, int level)
	{			
		this.name = name;		
		this.type = type; 
		this.level = level;
		this.healthPower = level * 100;	
		this.attack = 100;
	}	
		
	String getName()
	{				
		return name;
	}
		
	public void checkAttacker(int ap)
	{		
		System.out.println(getName() + "�� �ൿ��: " + ap);
		if (ap > 100)
		{
			this.actionPoint -= 100;
			System.out.println(getName() + "�� �ൿ���� " + this.actionPoint +"�� �Ǿ����ϴ�.");
			hit(attack);			
		} else 
		{
			ActionPoint myAp = new ActionPoint();
			myAp.checkAP();
		}		
	}
	
	public void hit(int attack) 
	{		
		EnemyBoss myEb = new EnemyBoss();
		myEb.beaten(attack);
	}
		
	void critical()
	{
		
	}	
	
	public void checkBossAp(){};
	
	public void checkDefenderAp(){};
		
	public void checkPhysicalAp(){};
	
	public void checkSupporterAp(){};
}


