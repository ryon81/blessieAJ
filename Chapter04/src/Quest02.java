import java.util.Scanner;


public class Quest02 
{

	public static void main(String[] args) 
	{

		int def = 0;
		
		System.out.print("������ �Է��ϼ���.>");
		
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		def = Integer.parseInt(tmp);
		scanner.close();
		
		if (def % 2 == 0 && def % 3 != 0) System.out.printf("�Է��� %d�� 2�� ����Դϴ�.%n", def);
		
		if (def % 2 == 0 && def % 3 == 0) System.out.printf("�Է��� %d�� 2�� ����̸鼭 3�� ����Դϴ�.%n", def);
		
		if (def % 2 != 0 && def % 3 == 0) System.out.printf("�Է��� %d�� 3�� ����Դϴ�.%n", def);
		
		if (def % 2 != 0 && def % 3 != 0) System.out.printf("�Է��� %d�� 2�� 3�� ����� �ƴմϴ�.%n",def);
		
		if (def == 0) System.out.printf ("%d�� ��� �� �� �����ϴ�.%n", def);
	}
}
