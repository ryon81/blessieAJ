package com.clickjava.samples.obj_7.sample;

import java.util.*;

public class Commander extends Soldier{
  private int bulletNum; // 총알의 수
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
    System.out.println("보고받은 적군의 숫자는 :" + enemyNum);
    if(enemyNum > 10) {
      for(int idx=0; idx < attackerList.size(); idx++) {
        Private attacker = (Private)attackerList.get(idx);
        attacker.defence();
      }
    } else if(enemyNum > 5){
      for(int idx=0; idx < attackerList.size(); idx++) {
        Private attacker = (Private)attackerList.get(idx);
        attacker.attack(10); // 적군의 수가 많으면, 총알을 10개 소비
      }
    } else {
      for(int idx=0; idx < attackerList.size(); idx++) {
        Private attacker = (Private)attackerList.get(idx);
        attacker.attack(); // 적군의 수가 적으면, 그냥 총알 쏘기
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

    // 전투병의 체력이 70보다 작으므로 밥을 준다.
    if(man.getHP() < 70) {
      unitCook.cooking();
    }
  }

  public void eat() {
    this.healthPower += 1;
    System.out.println(this.rank + ":" + this.getHP());
  }
}
