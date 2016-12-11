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
 
 private JToolBar jtb = new JToolBar();  //툴바 생성
 private JButton jbt1 = new JButton("1번");   //버튼
 private JButton jbt2 = new JButton(new ImageIcon("b.gif"));  //이미지 버튼
 private JButton jbt3 = new JButton("3번");  //버튼
 private JButton jbt4 = new JButton("4번");  //버튼
 
 private JToolBar jtb2 = new JToolBar();   //툴바 생성
 private JButton jtb2_1 = new JButton("아번");  //버튼
 private JButton jtb2_2 = new JButton("오번");  //버튼
 
 
 private JTabbedPane jtp = new JTabbedPane();  //탭 패널
 private JPanel jp1 = new JPanel();  //패널 1
 private JPanel jp2 = new JPanel();  //패널 2
 private JPanel jp3 = new JPanel();  //패널 3
 private JPanel jp4 = new JPanel();  //패널 4
 
 
 public Exec_07_Sub(String title) {
  super(title);  //프레임 상속
  
  this.init();  //메소드화   this는 프레임
  this.start(); //메소드화
  
  this.setSize(500, 400); //프레임 크기
  Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
  Dimension frm = this.getSize(); //화면 사이즈 가져옴
  int xpos = (int)(screen.getWidth() / 2 - frm.getWidth() / 2);  //중앙
  int ypos = (int)(screen.getHeight() / 2 - frm.getHeight() / 2);  //중앙
  this.setLocation(xpos, ypos); //중앙에 위치시킴
  this.setResizable(false);  //사이즈 조정 불가
  this.setVisible(true);  // 보이게함
 }
 public void init() {
  Container con = this.getContentPane(); //큰 패널(?)
  con.setLayout(bl);    //레이아웃 BorderLayout()
  jtb.add(jbt1);
  jtb.addSeparator();  //수평 간격
  jtb.add(jbt2);
  jtb.addSeparator();
  jtb.add(jbt3);
  jtb.addSeparator();  //수평 간격
  jtb.add(jbt4);  
  con.add("North", jtb);   //버튼 툴바 위치 북
  
  jtb2.add(jtb2_1);
  jtb2.addSeparator();  //수평 간격
  jtb2.add(jtb2_2);
  con.add("South", jtb2);    //버튼 툴바2 위치 남
  
  jp1.setBackground(Color.black);
  jp2.setBackground(Color.red);
  jp3.setBackground(Color.green);
  jp4.setBackground(Color.blue);
  jtp.addTab("1번 패널", jp1);
  jtp.addTab("2번 패널", jp2);
  jtp.addTab("3번 패널", jp3);
  jtp.addTab("4번 패널", jp4);
  con.add("Center", jtp);    //탭 패널 위치 가운데
 }
 public void start() {
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //종료시 프로그램 종료
 }
}
public class TET {
 public static void main(String[] ar) {
  Exec_07_Sub ex = new Exec_07_Sub("제목");
 }
}


