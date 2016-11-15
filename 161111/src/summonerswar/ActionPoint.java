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
			System.out.print("AP는? ");
			Scanner s = new Scanner(System.in);
			int tmp = s.nextInt();
			System.out.println("전체 행동력이 " + tmp + "증가 되었습니다.");
			super.actionPoint += tmp;						
			apFill(super.actionPoint);
			s.close();
		}
									
		/*} catch (Exception ex)
		{
			System.out.print("프로그램 비정상 종료");
			System.exit(-1);
		}*/		
	}	
	
	
	public void apFill(int actionPoint)
	{					
		System.out.println("전체 행동력: " + actionPoint);
						
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
