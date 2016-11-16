package com.clickjava.samples.obj_7.sample;

public class Private extends Soldier {
  protected int bulletNum; // 총알의 수
  private Commander myBoss;

  public Private() {
  }

  // 생성자 오버로딩
  public Private(String name, String rank, int num) {
    this(name, rank); // this()를 이용
    this.bulletNum = num;
  }

  public Private(String name, String rank) {
    super(name, rank); // super()를 이용
    this.bulletNum = 20;
  }

  public void setCommander(Commander man) {
    myBoss = man;
  }

  public void attack(int num) {
    for (int idx = 0; idx < num; idx++) {
      bulletNum--;
      healthPower--;
      if (bulletNum <= 0) {
        myBoss.listenPrivate(this);
      }
    }
    System.out.println("<공격>" + rank + " : 건강도(" + healthPower + "), 총알수("
                       + bulletNum + ")");
  }

  public void attack() {
    for (int idx = 0; idx < 5; idx++) {
      bulletNum--;
      healthPower--;
      if (bulletNum <= 0) {
        myBoss.listenPrivate(this);
      }
    }
    System.out.println("<공격>" + rank + " : 건강도(" + healthPower + "), 총알수("
                       + bulletNum + ")");
  }

  public void defence() {
    bulletNum -= 1;
    healthPower -= 10;
    if (bulletNum <= 0) {
      myBoss.listenPrivate(this);
    }
    System.out.println("<방어>" + rank + " : 건강도(" + healthPower + "), 총알수("
                       + bulletNum + ")");
  }

  public void reload(int num) {
    bulletNum += num;
  }

  public void eat() {
    this.healthPower += 10;
    System.out.println(this.rank + ":" + this.getHP());
  }
}
