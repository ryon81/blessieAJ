import java.util.Scanner;

public class Quest04_02 
{

	public static void main(String[] args) 
	{
		
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0, z1 = 0, z2 = 0; 
		int w1 = 0, w2 = 0; 
				
		System.out.print("ù��° �� 1 ��ǥ�� �Է��ϼ���.>");
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		x1 = Integer.parseInt (tmp);
				
		System.out.print("ù��° �� 2 ��ǥ�� �Է��ϼ���.>");
		String tmp1 = scanner.nextLine();
		x2 = Integer.parseInt (tmp1);
						
		System.out.print("�ι�° �� 1 ��ǥ�� �Է��ϼ���.>");
		String tmp2 = scanner.nextLine();
		y1 = Integer.parseInt (tmp2);
		
		System.out.print("�ι�° �� 2 ��ǥ�� �Է��ϼ���.>");
		String tmp3 = scanner.nextLine();
		y2 = Integer.parseInt (tmp3);
				
		System.out.print("����° �� 1 ��ǥ�� �Է��ϼ���.>");
		String tmp4 = scanner.nextLine();
		z1 = Integer.parseInt (tmp4);
				
		System.out.print("����° �� 2 ��ǥ�� �Է��ϼ���.>");
		String tmp5 = scanner.nextLine();
		z2 = Integer.parseInt (tmp5);

		System.out.printf("[%d,%d]%n",x1,x2);
		System.out.printf("[%d,%d]%n",y1,y2);
		System.out.printf("[%d,%d]%n",z1,z2);
		
		scanner.close();		
		
		w1 = x1^y1^z1;
		w2 = x2^y2^z2;
		
		System.out.printf("[%d,%d]%n",w1,w2);
				
	}	
}
