package com.clickjava.samples.obj_7;

public class Sniper extends Rifleman implements Sniping
{
	public Sniper()
	{
		
	}
	
	public Sniper(String name, String rank, int num)
	{
		super(name, rank, num);
	}
	
	public void shoot()
	{
		this.bulletNum--;
		System.out.println("���ݺ��� ��� ������ �߽��ϴ�.");
	}

}
