package com.clickjava.samples.obj_7;

import java.util.*;

public class Commander extends Soldier
{
	private int bulletNum;
			
	private Vector attackerList, sniperList;
	private Cooker unitCook;
		
	public Commander()
	{
		super("", Unit.RANK_COMMANDER);
		attackerList = new Vector();
		sniperList = new Vector();
		this.bulletNum = 300;
	}
	
	public Commander(Rifleman man)
	{
		this();
		attackerList.add(man);
	}
		
	public void addAttacker(Rifleman man)
	{
		attackerList.add(man);
	}
	
	public void setCook(Cooker cook)
	{
		unitCook = cook;
	}
	
	public void listenWatcher(int enemyNum)
	{
		System.out.println("보고받은 적군의 숫자는 : " + enemyNum);
		if(enemyNum > 10)
		{
			for (int idx = 0; idx < attackerList.size();idx++)
			{
				Rifleman attacker = (Rifleman)attackerList.get(idx);
				attacker.defence();
			}
			
		} else if (enemyNum > 5)
		{
			for (int idx = 0; idx < attackerList.size();idx++)
			{
				Rifleman attacker = (Rifleman)attackerList.get(idx);
				attacker.attack(10);
			}
		} else if (enemyNum == 1)
		{
			snipingHim();
		}		
		else
		{
			for (int idx = 0; idx < attackerList.size();idx++)
			{
				Rifleman attacker = (Rifleman)attackerList.get(idx);
				attacker.attack();
			}
		}
	}
	
	public void registerSniper(Sniping man)
	{
		sniperList.add(man);
	}
	
	private void snipingHim()
	{
		for(int idx = 0; idx < sniperList.size(); idx++)
		{
			Sniping man = (Sniping)sniperList.get(idx);
			man.shoot();
		}
	}
	
	public  void listenRifleman(Rifleman man)
	{
		if(bulletNum >= 30)
		{
			man.reload(30);
			bulletNum -= 30;
		} else
		{
			man.reload(bulletNum);
			bulletNum = 0;
		}
		
		if(man.getHP() < 70) 
		{
			unitCook.cooking();
		}
	}
	
	public void eat()
	{
		this.healthPower += 1;
		System.out.println(this.rank + ":" + this.getHP());
	}
	
	
	
}
