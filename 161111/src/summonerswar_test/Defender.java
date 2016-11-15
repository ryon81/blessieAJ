package summonerswar_test;

public class Defender extends Monsters implements Apable, Attackable
{
	private ActionPoint myAp;
	private AttackableImpl myAi;
	
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
			
	public String getName()
	{				
		return name;
	}	
	
	public int getActionPoint()
	{
		return actionPoint;
	}
	
	public void checkAP()
	{
		myAp.checkAP(); 
	}
	
	public void apFill(int actionPoint)
	{					
		myAp.apFill(actionPoint);		
	} 
		
	public void checkAttacker(int ap)
	{				
		System.out.println(getName() + "의 행동력: " + ap);
		if (getActionPoint() > 100)
		{
			this.actionPoint -= 100;
			System.out.println(getName()+ "의 행동력이 " + getActionPoint() +"이 되었습니다.");
			hit(attack);			
		} else 
		{			
			myAp.checkAP();
		}			
	}
	
	public void hit(int attack) 
	{		
		myAi.hit(attack);
	}

}


