package summonerswar_test;

import java.util.*;

public class ActionPoint extends Monsters implements Apable
{		
	private Attacker myAt; 
	private Defender myDf;
	private Supporter mySp;
	private Physical myPy;
	
	//------------AP입력하기------------//	
	public void checkAP()
	{
		try
		{	
		while(true)
		{			
			System.out.print("AP는? ");
			Scanner s = new Scanner(System.in);
			int tmp = s.nextInt();
			System.out.println("전체 행동력이 " + tmp + "증가 되었습니다.");
			super.actionPoint += tmp;						
			apFill(super.actionPoint);
			s.close();
		}
									
		} catch (Exception ex)
		{
			System.out.print("프로그램 비정상 종료");
			System.exit(-1);
		}		
	}		
	
	//------------각 몬스터에 AP 반영하기------------//
	public void apFill(int actionPoint)
	{	
		myAt.actionPoint = actionPoint;
		myDf.actionPoint = actionPoint;
		mySp.actionPoint = actionPoint;
		myPy.actionPoint = actionPoint;
	} 
}
	
	
	
