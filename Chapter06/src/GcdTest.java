import java.util.Scanner;

class GcdTest 
{
	static int execNum=1;
	
	public static void main(String[] args) 
	{
		int num[] = new int [2];
				
		Scanner s = new Scanner (System.in);
				
		for (int i = 0; i < 2; i++)
		{
			System.out.print("������ �Է��ϼ���.>");			
			num[i] = Integer.parseInt(s.nextLine());			
		}				
			
		System.out.printf("%d�� %d�� �ִ������� %d", num[0], num[1], gcd(num[0],num[1]));
		
		s.close();
	}
	
	static int gcd(int a, int b)
	{		
		System.out.printf("%dȸ �����Ѵ�%n", execNum++);
		
		if (b != 0)
		{
			System.out.printf("a: %d, b: %d%n", a,b);
			return gcd(b, a%b); 
		} 
		else 			
			return a;			
	}

}
