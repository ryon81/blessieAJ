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
		new Attacker().checkAttacker(actionPoint);
		new Defender().checkAttacker(actionPoint);
		new Supporter().checkAttacker(actionPoint);
		new Physical().checkAttacker(actionPoint);
	} 

	// --------------- 추가 코딩은 여기 부터 -------------//

}
	
	
	
