package sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

class Exec_07_Sub extends JFrame {

 private BorderLayout bl = new BorderLayout();
 
 private JToolBar jtb = new JToolBar();  //���� ����
 private JButton jbt1 = new JButton("1��");   //��ư
 private JButton jbt2 = new JButton(new ImageIcon("b.gif"));  //�̹��� ��ư
 private JButton jbt3 = new JButton("3��");  //��ư
 private JButton jbt4 = new JButton("4��");  //��ư
 
 private JToolBar jtb2 = new JToolBar();   //���� ����
 private JButton jtb2_1 = new JButton("�ƹ�");  //��ư
 private JButton jtb2_2 = new JButton("����");  //��ư
 
 
 private JTabbedPane jtp = new JTabbedPane();  //�� �г�
 private JPanel jp1 = new JPanel();  //�г� 1
 private JPanel jp2 = new JPanel();  //�г� 2
 private JPanel jp3 = new JPanel();  //�г� 3
 private JPanel jp4 = new JPanel();  //�г� 4
 
 
 public Exec_07_Sub(String title) {
  super(title);  //������ ���
  
  this.init();  //�޼ҵ�ȭ   this�� ������
  this.start(); //�޼ҵ�ȭ
  
  this.setSize(500, 400); //������ ũ��
  Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
  Dimension frm = this.getSize(); //ȭ�� ������ ������
  int xpos = (int)(screen.getWidth() / 2 - frm.getWidth() / 2);  //�߾�
  int ypos = (int)(screen.getHeight() / 2 - frm.getHeight() / 2);  //�߾�
  this.setLocation(xpos, ypos); //�߾ӿ� ��ġ��Ŵ
  this.setResizable(false);  //������ ���� �Ұ�
  this.setVisible(true);  // ���̰���
 }
 public void init() {
  Container con = this.getContentPane(); //ū �г�(?)
  con.setLayout(bl);    //���̾ƿ� BorderLayout()
  jtb.add(jbt1);
  jtb.addSeparator();  //���� ����
  jtb.add(jbt2);
  jtb.addSeparator();
  jtb.add(jbt3);
  jtb.addSeparator();  //���� ����
  jtb.add(jbt4);  
  con.add("North", jtb);   //��ư ���� ��ġ ��
  
  jtb2.add(jtb2_1);
  jtb2.addSeparator();  //���� ����
  jtb2.add(jtb2_2);
  con.add("South", jtb2);    //��ư ����2 ��ġ ��
  
  jp1.setBackground(Color.black);
  jp2.setBackground(Color.red);
  jp3.setBackground(Color.green);
  jp4.setBackground(Color.blue);
  jtp.addTab("1�� �г�", jp1);
  jtp.addTab("2�� �г�", jp2);
  jtp.addTab("3�� �г�", jp3);
  jtp.addTab("4�� �г�", jp4);
  con.add("Center", jtp);    //�� �г� ��ġ ���
 }
 public void start() {
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //����� ���α׷� ����
 }
}
public class TET {
 public static void main(String[] ar) {
  Exec_07_Sub ex = new Exec_07_Sub("����");
 }
}


