import java.util.Scanner;

public class Quest04_01 
{

	public static void main(String[] args) 
	{
		
		int x1 = 0, x2 = 0, y1 = 0, y2 = 0, z1 = 0, z2 = 0; 
		int w1 = 0, w2 = 0; 
				
		System.out.print("첫번째 중 1 좌표를 입력하세요.>");
		Scanner scanner = new Scanner (System.in);
		String tmp = scanner.nextLine();
		x1 = Integer.parseInt (tmp);
				
		System.out.print("첫번째 중 2 좌표를 입력하세요.>");
		String tmp1 = scanner.nextLine();
		x2 = Integer.parseInt (tmp1);
						
		System.out.print("두번째 중 1 좌표를 입력하세요.>");
		String tmp2 = scanner.nextLine();
		y1 = Integer.parseInt (tmp2);
		
		System.out.print("두번째 중 2 좌표를 입력하세요.>");
		String tmp3 = scanner.nextLine();
		y2 = Integer.parseInt (tmp3);
				
		System.out.print("세번째 중 1 좌표를 입력하세요.>");
		String tmp4 = scanner.nextLine();
		z1 = Integer.parseInt (tmp4);
				
		System.out.print("세번째 중 2 좌표를 입력하세요.>");
		String tmp5 = scanner.nextLine();
		z2 = Integer.parseInt (tmp5);

		System.out.printf("[%d,%d]%n",x1,x2);
		System.out.printf("[%d,%d]%n",y1,y2);
		System.out.printf("[%d,%d]%n",z1,z2);
		
		scanner.close();		
		
		if (y1 == z1)
		{
			if (y2 == x2)
			{
				w1 = x1;
				w2 = z2;
				System.out.printf("[%d,%d]%n",w1,w2);
			} else if (z2 == x2)
			{
				w1 = x1;
				w2 = y2;
				System.out.printf("[%d,%d]%n",w1,w2);
			}			
		} else if (x1 == y1)
		{
			if (x2 == z2)
			{
				w1 = z1;
				w2 = y2;
				System.out.printf("[%d,%d]%n",w1,w2);
			} else if (y2 == z2)
			{
				w1 = z1;
				w2 = x2;
				System.out.printf("[%d,%d]%n",w1,w2);
			}			
		} else if (x1 == z1) 
		{
			if (x2 == y2)
			{
				w1 = y1;
				w2 = z2;
				System.out.printf("[%d,%d]%n",w1,w2);
			} else if (z2 == y2)
			{
				w1 = y1;
				w2 = x2;
				System.out.printf("[%d,%d]%n",w1,w2);
			}
		} else 
		{
			System.out.println("잘못된 코드를 입력하셨습니다.");
		}
	}	
}
