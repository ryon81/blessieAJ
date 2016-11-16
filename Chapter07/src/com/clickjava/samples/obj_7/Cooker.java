package com.clickjava.samples.obj_7;

import java.util.*;
public class Cooker extends Soldier
{
	private Vector soldierList;
	
	public Cooker()
	{
		this.rank=Unit.RANK_COOKER;
		soldierList = new Vector();
	}
	
	public void cooking()
	{
		for (int idx = 0; idx < soldierList.size(); idx++)
		{
			Soldier man = (Soldier)soldierList.get(idx);
			man.eat();
		}
	}
	
	public void registerSoldier(Soldier s)
	{
		soldierList.add(s);
	}
	
	public void eat()
	{
		this.healthPower += 1;
		System.out.println(this.rank + ":" + this.getHP());
	}
	
}
