package com.clickjava.samples.obj_7.sample;

import java.util.*;

public class Commander extends Soldier{
  private int bulletNum; // �Ѿ��� ��
  private Vector attackerList;
  private Cook unitCook;

  public Commander() {
    super("", Unit.RANK_COMMANDER);
    attackerList = new Vector();
    this.bulletNum = 300;
  }

  public Commander(Private man) {
    this();
    attackerList.add(man);
  }

  public void addAttacker(Private man) {
    attackerList.add(man);
  }

  public void setCook(Cook cook){
    unitCook = cook;
  }

  public void listenScout(int enemyNum) {
    System.out.println("������� ������ ���ڴ� :" + enemyNum);
    if(enemyNum > 10) {
      for(int idx=0; idx < attackerList.size(); idx++) {
        Private attacker = (Private)attackerList.get(idx);
        attacker.defence();
      }
    } else if(enemyNum > 5){
      for(int idx=0; idx < attackerList.size(); idx++) {
        Private attacker = (Private)attackerList.get(idx);
        attacker.attack(10); // ������ ���� ������, �Ѿ��� 10�� �Һ�
      }
    } else {
      for(int idx=0; idx < attackerList.size(); idx++) {
        Private attacker = (Private)attackerList.get(idx);
        attacker.attack(); // ������ ���� ������, �׳� �Ѿ� ���
      }
    }
  }

  public void listenPrivate(Private man) {
    if(bulletNum >= 30) {
      man.reload(30);
      bulletNum -= 30;
    } else {
      man.reload(bulletNum);
      bulletNum = 0;
    }

    // �������� ü���� 70���� �����Ƿ� ���� �ش�.
    if(man.getHP() < 70) {
      unitCook.cooking();
    }
  }

  public void eat() {
    this.healthPower += 1;
    System.out.println(this.rank + ":" + this.getHP());
  }
}
