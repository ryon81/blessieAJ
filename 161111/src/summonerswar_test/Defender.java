package summonerswar_test;

public class Defender extends Monsters implements Apable, Attackable
{
	private ActionPoint myAp;
	private AttackableImpl myAi;
	
	public Defender() 
	{
		this("����", Battle.TYPE_DEFENDER, 35);
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
		System.out.println(getName() + "�� �ൿ��: " + ap);
		if (getActionPoint() > 100)
		{
			this.actionPoint -= 100;
			System.out.println(getName()+ "�� �ൿ���� " + getActionPoint() +"�� �Ǿ����ϴ�.");
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


