public class TvTest_1 
{

	public static void main(String[] args) 
	{
		int t1 = 0;
		int t2 = 0; 
		
		int channel1 = 7;
		int channel2 = channel1;		
				
		t1 = --channel1; 		
		t2 = --channel2; 
		
		System.out.println("���� ä���� "+ t1 + " �Դϴ�.");
		System.out.println("���� ä���� "+ t2 + " �Դϴ�.");
	}
}