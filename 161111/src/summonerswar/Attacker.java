package summonerswar;

public class Attacker extends Monsters
{	
	public Attacker() 
	{
		this("셀레나", Battle.TYPE_ATTAKER, 40);
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
		System.out.println(getName() + "의 행동력: " + ap);
		if (ap > 100)
		{
			this.actionPoint -= 100;
			System.out.println(getName() + "의 행동력이 " + this.actionPoint +"이 되었습니다.");
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


