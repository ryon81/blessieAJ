package com.clickjava.samples.obj_7;

class Rifleman extends Soldier
{				
	protected int bulletNum;
	
	private Commander myBoss;
	
	public Rifleman()
	{
		
	}
	
	public Rifleman(String name, String rank, int num)
	{
		this(name, rank);
		this.bulletNum = num;
	}
	
	public Rifleman(String name, String rank)
	{
		super(name, rank);
		this.bulletNum = 20;
	}
	
	
	public void setCommander(Commander man)
	{
		myBoss = man;
	}		
	
	public void attack(int num)
	{
		for (int idx = 0; idx < num; idx++)
		{
			bulletNum --;
			healthPower --;
			if (bulletNum <=0)
			{
				myBoss.listenRifleman(this);
			}
		}
		System.out.println("<공격>" + rank + " : 건강도(" + healthPower + "), 총알수(" + bulletNum + ")");		
	}
	
	public void attack()
	{
		for (int idx = 0; idx < 5; idx++)
		{
			bulletNum --;
			healthPower --;
			if (bulletNum <=0)
			{
				myBoss.listenRifleman(this);
			}			
		}
		System.out.println("<공격>" + rank + " : 건강도(" + healthPower + "), 총알수(" + bulletNum + ")");		
	}
	
	public void defence()
	{
		bulletNum -= 1;
		healthPower -=10;
		if (bulletNum <=0)
		{
			myBoss.listenRifleman(this);
		}
		System.out.println("<방어>" + rank + " : 건강도(" + healthPower + "), 총알수(" + bulletNum + ")");
	}
	
	public void reload(int num)
	{
		bulletNum += num;
	}
	
	public void eat()
	{
		this.healthPower += 10;
		System.out.println(rank + " 밥 먹었어요.");
	}

}
