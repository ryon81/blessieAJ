package summonerswar;

public class Supporter extends Monsters
{
	public Supporter() 
	{
		this("�ɸ޴�", Battle.TYPE_SUPPORTER, 37);
	}	

	public Supporter(String name, String type, int level)
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
		System.out.println(getName() + "�� �ൿ��: " + ap);
		if (ap > 100)
		{
			actionPoint -= 100;
			System.out.println(getName() + "�� �ൿ���� " + actionPoint +"�� �Ǿ����ϴ�.");
			hit(this.attack);			
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
