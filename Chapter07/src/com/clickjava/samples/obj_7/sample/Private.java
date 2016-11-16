package com.clickjava.samples.obj_7.sample;

public class Private extends Soldier {
  protected int bulletNum; // �Ѿ��� ��
  private Commander myBoss;

  public Private() {
  }

  // ������ �����ε�
  public Private(String name, String rank, int num) {
    this(name, rank); // this()�� �̿�
    this.bulletNum = num;
  }

  public Private(String name, String rank) {
    super(name, rank); // super()�� �̿�
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
    System.out.println("<����>" + rank + " : �ǰ���(" + healthPower + "), �Ѿ˼�("
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
    System.out.println("<����>" + rank + " : �ǰ���(" + healthPower + "), �Ѿ˼�("
                       + bulletNum + ")");
  }

  public void defence() {
    bulletNum -= 1;
    healthPower -= 10;
    if (bulletNum <= 0) {
      myBoss.listenPrivate(this);
    }
    System.out.println("<���>" + rank + " : �ǰ���(" + healthPower + "), �Ѿ˼�("
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
