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
		
		/*  -----------switch문------------
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
			System.out.print("연산이 불가능합니다.");		
		} else 
		{
			System.out.printf("결과: %d", a);
		}	
	}
}

class Calstest 
{
	public static void main(String[] args) 
	{	
		
		//---------------숫자 입력---------------
		Calculate c = new Calculate();
		
		int[] num = new int [2];
		Scanner scanner = new Scanner (System.in);
		
		for (int i = 0; i < 2; i++)
		{
			System.out.print("연산할 정수를 입력하세요.>");			
			num[i] = scanner.nextInt();			
		}
		//---------------연산자 입력---------------		
		System.out.print("수행할 사칙연산 기호를 입력하세요.>");
		Scanner scanner1 = new Scanner (System.in);
		String op = scanner1.nextLine();
						
		//---------------연산 및 출력하기------------------
				
		c.printout(c.calc(num[0], num[1], op));
		
		
		scanner.close();
		scanner1.close();
	}

}
