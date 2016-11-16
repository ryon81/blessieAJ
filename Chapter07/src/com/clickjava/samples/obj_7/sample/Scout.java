package com.clickjava.samples.obj_7.sample;

public class Scout extends Soldier{
  private Commander myBoss;

  public Scout() {
    super("", Unit.RANK_SCOUT);
  }

  public void setCommander(Commander man) {
    myBoss = man;
  }

  private void report(int num) {
    myBoss.listenScout(num);
  }

  public void watch() {
    java.io.BufferedReader stdin;
    stdin = new  java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    String line;
    int enemy;

    try{
      System.out.print("������ ���� :");
      while ( (line = stdin.readLine()) != null) {
        if (line.equals("quit")) {
          System.out.print("���α׷� ����");
          System.exit(0);
        }
        else {
          enemy = Integer.parseInt(line);
          report(enemy);
        }
        System.out.print("������ ���� :");
      }
    } catch (Exception ex) {
      System.out.print("���α׷� ������ ����");
      System.exit(-1);
    }
  }

  public void eat() {
    this.healthPower += 1;
    System.out.println(this.rank + ":" + this.getHP());
  }
}
