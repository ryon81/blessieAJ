import java.util.Scanner;

class Calculate_1
{	
	int calc(int x, int y, char c)
	{
		int rlt = 0;
		
		switch(c)
		 {
		 	case '+' : rlt = x+y; break;
		 	case '-' : rlt = x-y; break;
		 	case '*' : rlt = x*y; break;
		 	case '/' : rlt = x/y; break;
		 }
		
		return rlt; 
	}
	
	void printout(int a)
	{
		if (a == 0)
		{
			System.out.print("������ �Ұ����մϴ�.");		
		} else 
		{
			System.out.printf("���: %d", a);
		}	
	}
}

class Calstest_1 
{
	public static void main(String[] args) 
	{	
		

		Calculate_1 c = new Calculate_1();
		
		int[] num = new int [2];
		
		//---�Է�---- �Է¹���� �����ϸ� �ѹ��� ó���� �� �ִ�. --- 
		Scanner s = new Scanner (System.in);
		
		for (int i = 0; i < 2; i++)
		{
			System.out.print("������ ������ �Է��ϼ���.>");			
			num[i] = Integer.parseInt(s.nextLine());			
		}
				
		System.out.print("������ ��Ģ���� ��ȣ�� �Է��ϼ���.>");
		char op = s.nextLine().charAt(0);
		
						
		//---------------���� �� ����ϱ�------------------
				
		c.printout(c.calc(num[0], num[1], op));
				
		s.close();		
	}

}
