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
			System.out.print("연산이 불가능합니다.");		
		} else 
		{
			System.out.printf("결과: %d", a);
		}	
	}
}

class Calstest_1 
{
	public static void main(String[] args) 
	{	
		

		Calculate_1 c = new Calculate_1();
		
		int[] num = new int [2];
		
		//---입력---- 입력방식을 통일하면 한번에 처리할 수 있다. --- 
		Scanner s = new Scanner (System.in);
		
		for (int i = 0; i < 2; i++)
		{
			System.out.print("연산할 정수를 입력하세요.>");			
			num[i] = Integer.parseInt(s.nextLine());			
		}
				
		System.out.print("수행할 사칙연산 기호를 입력하세요.>");
		char op = s.nextLine().charAt(0);
		
						
		//---------------연산 및 출력하기------------------
				
		c.printout(c.calc(num[0], num[1], op));
				
		s.close();		
	}

}
