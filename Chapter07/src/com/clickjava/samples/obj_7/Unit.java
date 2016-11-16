package com.clickjava.samples.obj_7;

public class Unit 
{
	public static final String RANK_COMMANDER = "지휘관";
	public static final String RANK_WATCHER = "척후병";
	public static final String RANK_RIFLEMAN = "소총수";
	public static final String RANK_COOKER = "요리사";
	public static final String RANK_SNIPER = "저격병";
	
	public static void main(String[] args) 
	{	
		Watcher wm = new Watcher();
		Rifleman rm = new Rifleman("존",Unit.RANK_RIFLEMAN,20);
		Rifleman rm2 = new Rifleman("그리삼",Unit.RANK_RIFLEMAN,10);
		Commander boss = new Commander();
		Cooker cook = new Cooker();
		Sniper sniper = new Sniper("매트", RANK_SNIPER, 10);
		
		boss.addAttacker(rm);
		boss.addAttacker(rm2);
		boss.setCook(cook);
		boss.registerSniper(sniper);
		boss.registerSniper(wm);
		wm.setCommander(boss);
		
		rm.setCommander(boss);
		rm2.setCommander(boss);
		
		cook.registerSoldier(wm);
		cook.registerSoldier(rm);
		cook.registerSoldier(rm2);
		cook.registerSoldier(boss);
		cook.registerSoldier(cook);
		
		System.out.println("전체 병사의 수는 " + Soldier.totalNum);
		System.out.println("요리사에서 바라본 전체 병사의 수는 " + cook.totalNum);
		System.out.println(Soldier.getTotalNum());
		
		
		wm.watch();

	}

}
