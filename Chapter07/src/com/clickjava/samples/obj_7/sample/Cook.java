package com.clickjava.samples.obj_7.sample;

import java.util.*;

public class Cook extends Soldier {
  private Vector soldierList;

  public Cook() {
    this.rank = Unit.RANK_COOK;
    soldierList = new Vector();
  }

  // 식사 준비하기
  public void cooking() {
    for(int idx=0; idx < soldierList.size(); idx++) {
      Soldier man = (Soldier)soldierList.get(idx);
      man.eat();
    }
  }

  public void registerSoldier(Soldier s) {
    soldierList.add(s);
  }

  public void eat() {
    this.healthPower += 1;
    System.out.println(this.rank + ":" + this.getHP());
  }
}