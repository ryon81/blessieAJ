import java.util.Scanner;

class Calculate
{	
	int calc(int a, int b, String c)
	{
		int rlt = 0;
		
		if (c.equals("+"))
		{
			rlt = a + b;
			
		}else if (c.equals("-"))
		{
			rlt = a - b;
		}else if (c.equals("*"))
		{
			rlt = a * b;
		}else if (c.equals("/"))
		{
			rlt = a / b;
		}else 
		{
			rlt = 0;
		}			
		
		/*  -----------switch��------------
		 switch(op)
		 {
		 	case "+" : rlt = x+y; break;
		 	case "-" : rlt = x-y; break;
		 	case "*" : rlt = x*y; break;
		 	case "/" : rlt = x/y; break;
		 }
		 */
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

class Calstest 
{
	public static void main(String[] args) 
	{	
		
		//---------------���� �Է�---------------
		Calculate c = new Calculate();
		
		int[] num = new int [2];
		Scanner scanner = new Scanner (System.in);
		
		for (int i = 0; i < 2; i++)
		{
			System.out.print("������ ������ �Է��ϼ���.>");			
			num[i] = scanner.nextInt();			
		}
		//---------------������ �Է�---------------		
		System.out.print("������ ��Ģ���� ��ȣ�� �Է��ϼ���.>");
		Scanner scanner1 = new Scanner (System.in);
		String op = scanner1.nextLine();
						
		//---------------���� �� ����ϱ�------------------
				
		c.printout(c.calc(num[0], num[1], op));
		
		
		scanner.close();
		scanner1.close();
	}

}
