package summonerswar_test;

import java.util.*;

public class ActionPoint extends Monsters implements Apable
{		
	private Attacker myAt; 
	private Defender myDf;
	private Supporter mySp;
	private Physical myPy;
	
	//------------AP�Է��ϱ�------------//	
	public void checkAP()
	{
		try
		{	
		while(true)
		{			
			System.out.print("AP��? ");
			Scanner s = new Scanner(System.in);
			int tmp = s.nextInt();
			System.out.println("��ü �ൿ���� " + tmp + "���� �Ǿ����ϴ�.");
			super.actionPoint += tmp;						
			apFill(super.actionPoint);
			s.close();
		}
									
		} catch (Exception ex)
		{
			System.out.print("���α׷� ������ ����");
			System.exit(-1);
		}		
	}		
	
	//------------�� ���Ϳ� AP �ݿ��ϱ�------------//
	public void apFill(int actionPoint)
	{	
		myAt.actionPoint = actionPoint;
		myDf.actionPoint = actionPoint;
		mySp.actionPoint = actionPoint;
		myPy.actionPoint = actionPoint;
	} 
}
	
	
	
