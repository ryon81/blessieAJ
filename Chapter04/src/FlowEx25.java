import java.util.*;

public class FlowEx25 
{

	public static void main(String[] args) 
	{
		int num = 0;
		int sum = 0;
		
		System.out.print("���ڸ� �Է��ϼ���. (��:12345)>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		scanner.close();
		
		while (num != 0)
		{
			sum += num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /=10; 
		}
		System.out.println("�� �ڸ����� ��: " + sum);
	}
}