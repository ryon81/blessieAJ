import java.util.Scanner;

public class FlowEx25_1 
{

	public static void main(String[] args) 
	{
		int num = 0;
		int sec = 0;
		String sec2 = "";
		
		System.out.print("���ڸ� �Է��ϼ���. (��:123)>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		scanner.close();
		
		while (num != 0)
		{
			sec = num%2;
			sec2 = sec+sec2;
			System.out.printf("2����=%11s num=%d%n", sec2, num);
			
			num /=2;
			
		}
		System.out.println("�Է��Ͻ� ���� 2���� ǥ���: " + sec2);
	}
}
