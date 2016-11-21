package com.clickjava.samples.obj_7.sample;

public class Unit {
  // 클래스 상수 선언
  public static final String RANK_COMMANDER = "지휘관";
  public static final String RANK_PRIVATE = "소총수";
  public static final String RANK_COOK = "취사병";
  public static final String RANK_SCOUT = "척후병";

  public static void main(String[] args) {

    // 각 객체를 생성한다.
    Scout watchMan = new Scout();
    Private attacker = new Private("존", Unit.RANK_PRIVATE, 20);
    Private attacker2 = new Private("그리샴", Unit.RANK_PRIVATE, 10);
    Commander boss = new Commander(); // 생성자에서 처리됨
    Cook cook = new Cook();

    boss.addAttacker(attacker);
    boss.addAttacker(attacker2);
    boss.setCook(cook);
    watchMan.setCommander(boss);
    attacker.setCommander(boss);
    attacker2.setCommander(boss);

    // 취사병에게 등록한다.
    cook.registerSoldier(watchMan);
    cook.registerSoldier(attacker);
    cook.registerSoldier(attacker2);
    cook.registerSoldier(boss);
    cook.registerSoldier(cook);

    // Soldier 클래스의 클래스 변수를 이용한다.
    System.out.println("전체 병사의 수는 " + Soldier.totalNum);
    System.out.println("쿡에서 바라본 전체 병사의 수는 " + cook.totalNum);

    // 클래스 메서드의 이용
    System.out.println(Soldier.getTotalNum());

    watchMan.watch();
  }
}
