import java.util.Scanner;

public class RepQt02_a 
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("ù ��° ������ �Է��ϼ���.>");
		Scanner scanner1 = new Scanner (System.in);
		String tmp1 = scanner1.nextLine();
		num1 = Integer.parseInt (tmp1);
						
		System.out.print("�� ��° ������ �Է��ϼ���.>");
		Scanner scanner2 = new Scanner (System.in);
		String tmp2 = scanner2.nextLine();
		num2 = Integer.parseInt (tmp2);
		
		scanner1.close();
		scanner2.close();
		
		int mx = 0;
		int mn = 0;
		int rms = 0;
		
		if (num1 > num2)
		{
			mn = num1;
			mx = num2;
		} else if (num1 < num2)
		{
			mn = num2;
			mx = num1;
		} else if (num1 == num2)
		{
			mn = num1;
			mx = num2; 
		}
		
		rms = mn % mx;
		
		while (rms !=0)
		{
			mn = mx;
			mx = rms;
			rms = mn % mx;
		}
		System.out.printf("�ִ�����: %d ", mx);
		System.out.printf("�ּҰ����: %d", (num1*num2)/mx);
				
	}
}