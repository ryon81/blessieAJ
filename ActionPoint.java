package summonerswar_test;

import java.util.*;

public class ActionPoint extends Monsters implements Apable
{				
	
	public void checkAP()
	{
		/*try
		{*/	
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
									
		/*} catch (Exception ex)
		{
			System.out.print("���α׷� ������ ����");
			System.exit(-1);
		}*/		
	}		
	
	public void apFill(int actionPoint)
	{					
		System.out.println("��ü �ൿ��: " + actionPoint);
		new Attacker().checkAttacker(actionPoint);
		new Defender().checkAttacker(actionPoint);
		new Supporter().checkAttacker(actionPoint);
		new Physical().checkAttacker(actionPoint);
	} 
	
	
	
	void checkBossAp(){};
	
	void checkDefenderAp(){};
		
	void checkPhysicalAp(){};
	
	void checkSupporterAp(){};
}
