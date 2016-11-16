package com.clickjava.samples.obj_7;

class Watcher extends Soldier implements Sniping
{	
	public Watcher()
	{
		super("", Unit.RANK_WATCHER);
	}
	
	private Commander myBoss;
	
	public void setCommander(Commander man)
	{
		myBoss = man;
	}	
	
	private void Report(int num)
	{
		myBoss.listenWatcher(num);
	}
	
	public void watch()
	{
		java.io.BufferedReader stdin;
		stdin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		String line;
		int enemy;
		
		try
		{
			System.out.print("������ ����: ");
			while ((line=stdin.readLine()) !=null)
			{
				if(line.equals("quit"))
				{
					System.out.print("���α׷� ���� ");
					System.exit(0);
				} else 
				{
					enemy = Integer.parseInt(line);
					Report(enemy);
				}
				System.out.print("������ ����: ");
			}
		} catch (Exception ex)
		{
			System.out.print("���α׷� ������ ����");
			System.exit(-1);
		}		
	}
	
	public void eat()
	{
		this.healthPower += 1;
		System.out.println(this.rank + ":" + this.getHP());
	}
	
	public void shoot()
	{		
		System.out.println("ô�ĺ��� ������ �� �� �����. �Ѿ��� �ּ���.");
	}
}