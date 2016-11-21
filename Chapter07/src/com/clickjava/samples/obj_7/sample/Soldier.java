package com.clickjava.samples.obj_7.sample;
public abstract class Soldier {
  // Ŭ���� ������ �����Ѵ�. �� ������ Ŭ������ ��� �ν��Ͻ����� ������
  public static int totalNum;

  protected String name; // �̸�
  protected String rank; // ���
  protected int healthPower; // �ǰ���

  // ������ ü�̴��� �Ͼ��.
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

  public abstract void eat(); // ���� Ŭ�������� �ݵ�� ó���ؾ� �Ѵ�.

  // Ŭ���� �޼��� ����
  public static String getTotalNum() {
    return "��ü ������ ���� " + totalNum;
  }
}