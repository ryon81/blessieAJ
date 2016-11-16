
class FuncTest 
{
	public static void main(String[] args) 
	{		
		//-----내부 클래스의 매서드 이용-------
		FuncTest ft = new FuncTest();
		ft.test();
		System.out.println();
		
		//-----외부 클래스의 매서드 이용-------
		Cals c = new Cals();
		c.test();
		System.out.println();

		//-----외부 클래스의 매개변수를 이용한 매서드 이용-------
		c.test1(10,20);
		System.out.println();
		
		//-----매서드에서 값을 return 받는 방법 1 -------
		System.out.println(c.test2(10,20));   // return이 포함된 함수만 가능하다.
		System.out.println();
		
		//-----매서드에서 값을 return 받는 방법 2 -------
		int num = c.test2(100,200);
		System.out.println(num);
		System.out.println();
		
		//-----매서드에서도 형변환이 이루어짐 -------
		int num2 = (int)(c.test3(100,200));
		System.out.printf("형변환 값: %d%n",num2);
		System.out.println();
		
		//-----void에서 조건return문 -------
		c.test4(10,20);
		c.test4(100,200);		
		System.out.println();
		
		//-----리턴 매서드에서 조건return문 -------
		int num3 = c.test5(10,20);
		int num4 = c.test5(100,200);
		System.out.printf("매서드 내 조건문 - 거짓:%d, 참:%d %n",num3,num4);
		System.out.println();
		
	}
	void test()
	{
		System.out.println("함수호출");
	}

}

class Cals
{
	void test()
	{
		System.out.println("다른 class의 함수호출");
	}
	
	void test1(int x, int y)
	{		
		System.out.printf("매개변수 이용예재: %d%n",x+y);
	}
	
	int test2(int x, int y)
	{		
		int c;       // 지역변수를 선언한다. 
		c = x + y;   // 지역변수에 대하여 수식을 이용하여 초기화 한다. 
		return c;   // 값을 보낼 변수, 상수, 수식등을 입력한다. 
	}
	
	double test3(double x, double y)
	{		
		int c;       // 지역변수를 선언한다. 
		c = (int)(x + y);   // 지역변수에 대하여 수식을 이용하여 초기화 한다. 
		return c;   // 값을 보낼 변수, 상수, 수식등을 입력한다. 
	}
	
	void test4(double x, double y)
	{		
		int c;       // 지역변수를 선언한다. 
		c = (int)(x + y);   // 지역변수에 대하여 수식을 이용하여 초기화 한다. 
		if (c < 100)
		return;
		System.out.printf("매서드 조건문: %d%n",c);// 값을 보낼 변수, 상수, 수식등을 입력한다. 
	}
	
	int test5(double x, double y)
	{		
		int c;       // 지역변수를 선언한다. 
		c = (int)(x + y);   // 지역변수에 대하여 수식을 이용하여 초기화 한다. 
		if (c > 100)   // 조건을 기입할 때 else일 때의 값을 꼭 처리해야 한다. 	
		return c;
		else
		return 0; 		 
	}
}
