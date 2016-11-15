package summonerswar;

public class Defender extends Monsters
{
	public Defender() 
	{
		this("웅비", Battle.TYPE_DEFENDER, 35);
	}	

	public Defender(String name, String type, int level)
	{
		this.name = name;
		this.type = type; 
		this.level = level;
		this.healthPower = level * 100;
		this.attack = 50;
	}
	
	String getName()
	{				
		return name;
	}
		
	int getActionPoint()
	{
		return actionPoint; 
	}
	
	
	public void checkAttacker(int ap)
	{		
		System.out.println(getName() + "의 행동력: " + ap);
		if (ap > 100)
		{
			actionPoint -= 100;
			System.out.println(getName() + "의 행동력이 " + actionPoint +"이 되었습니다.");
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

}


