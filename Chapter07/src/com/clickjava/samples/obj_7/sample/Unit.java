package com.clickjava.samples.obj_7.sample;

public class Unit {
  // Ŭ���� ��� ����
  public static final String RANK_COMMANDER = "���ְ�";
  public static final String RANK_PRIVATE = "���Ѽ�";
  public static final String RANK_COOK = "��纴";
  public static final String RANK_SCOUT = "ô�ĺ�";

  public static void main(String[] args) {

    // �� ��ü�� �����Ѵ�.
    Scout watchMan = new Scout();
    Private attacker = new Private("��", Unit.RANK_PRIVATE, 20);
    Private attacker2 = new Private("�׸���", Unit.RANK_PRIVATE, 10);
    Commander boss = new Commander(); // �����ڿ��� ó����
    Cook cook = new Cook();

    boss.addAttacker(attacker);
    boss.addAttacker(attacker2);
    boss.setCook(cook);
    watchMan.setCommander(boss);
    attacker.setCommander(boss);
    attacker2.setCommander(boss);

    // ��纴���� ����Ѵ�.
    cook.registerSoldier(watchMan);
    cook.registerSoldier(attacker);
    cook.registerSoldier(attacker2);
    cook.registerSoldier(boss);
    cook.registerSoldier(cook);

    // Soldier Ŭ������ Ŭ���� ������ �̿��Ѵ�.
    System.out.println("��ü ������ ���� " + Soldier.totalNum);
    System.out.println("��� �ٶ� ��ü ������ ���� " + cook.totalNum);

    // Ŭ���� �޼����� �̿�
    System.out.println(Soldier.getTotalNum());

    watchMan.watch();
  }
}
