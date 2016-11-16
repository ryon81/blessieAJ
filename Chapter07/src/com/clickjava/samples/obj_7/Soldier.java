package com.clickjava.samples.obj_7;

public abstract class Soldier 
{	
	public static int totalNum;
	
	protected String name; 
	protected String rank;
	protected int healthPower;
	
	public Soldier()
	{
		this.healthPower = 100;
		totalNum++;			
	}
	
	public Soldier(String name, String rank)
	{
		this();
		this.name = name; 
		this.rank = rank;
	}
	
	
	public String getName() 
	{
		return name;
	}
	public String getRank()
	{
		return rank;
	}	
	
	public int getHP()
	{
		return healthPower;
	}
	
	public abstract void eat();	
	
	public static String getTotalNum()
	{
		return "전체 병사의 수는 " + totalNum;
	}
}
