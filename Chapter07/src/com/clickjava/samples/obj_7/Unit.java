package com.clickjava.samples.obj_7;

public class Unit 
{
	public static final String RANK_COMMANDER = "���ְ�";
	public static final String RANK_WATCHER = "ô�ĺ�";
	public static final String RANK_RIFLEMAN = "���Ѽ�";
	public static final String RANK_COOKER = "�丮��";
	public static final String RANK_SNIPER = "���ݺ�";
	
	public static void main(String[] args) 
	{	
		Watcher wm = new Watcher();
		Rifleman rm = new Rifleman("��",Unit.RANK_RIFLEMAN,20);
		Rifleman rm2 = new Rifleman("�׸���",Unit.RANK_RIFLEMAN,10);
		Commander boss = new Commander();
		Cooker cook = new Cooker();
		Sniper sniper = new Sniper("��Ʈ", RANK_SNIPER, 10);
		
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
		
		System.out.println("��ü ������ ���� " + Soldier.totalNum);
		System.out.println("�丮�翡�� �ٶ� ��ü ������ ���� " + cook.totalNum);
		System.out.println(Soldier.getTotalNum());
		
		
		wm.watch();

	}

}
