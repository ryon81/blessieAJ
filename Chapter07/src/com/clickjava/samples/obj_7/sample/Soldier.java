package com.clickjava.samples.obj_7.sample;
public abstract class Soldier {
  // 클래스 변수를 선언한다. 이 변수는 클래스와 모든 인스턴스에서 공유됨
  public static int totalNum;

  protected String name; // 이름
  protected String rank; // 계급
  protected int healthPower; // 건강도

  // 생성자 체이닝이 일어난다.
  public Soldier() {
    this.healthPower = 100;
    totalNum++;
  }

  public Soldier(String name, String rank) {
    this();
    this.name = name;
    this.rank = rank;
  }

  public String getName() {
    return rank;
  }

  public String getRank() {
    return rank;
  }

  public int getHP() {
    return healthPower;
  }

  public abstract void eat(); // 하위 클래스에서 반드시 처리해야 한다.

  // 클래스 메서드 선언
  public static String getTotalNum() {
    return "전체 병사의 수는 " + totalNum;
  }
}