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
			System.out.print("적군의 수는: ");
			while ((line=stdin.readLine()) !=null)
			{
				if(line.equals("quit"))
				{
					System.out.print("프로그램 종료 ");
					System.exit(0);
				} else 
				{
					enemy = Integer.parseInt(line);
					Report(enemy);
				}
				System.out.print("적군의 수는: ");
			}
		} catch (Exception ex)
		{
			System.out.print("프로그램 비정상 종료");
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
		System.out.println("척후병은 저격을 할 수 없어요. 총알을 주세요.");
	}
}