package summonerswar;

import java.util.*;

public class ActionPoint extends Monsters
{				
	Attacker at = new Attacker();
	Defender df = new Defender();
	Physical ps = new Physical();
	Supporter sr = new Supporter();
	
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
						
		at.checkAttacker(actionPoint);
		df.checkAttacker(actionPoint);
		ps.checkAttacker(actionPoint);
		sr.checkAttacker(actionPoint);
	} 	
	
	void checkBossAp(){};
	
	void checkDefenderAp(){};
		
	void checkPhysicalAp(){};
	
	void checkSupporterAp(){};
}
