
class FuncTest 
{
	public static void main(String[] args) 
	{		
		//-----���� Ŭ������ �ż��� �̿�-------
		FuncTest ft = new FuncTest();
		ft.test();
		System.out.println();
		
		//-----�ܺ� Ŭ������ �ż��� �̿�-------
		Cals c = new Cals();
		c.test();
		System.out.println();

		//-----�ܺ� Ŭ������ �Ű������� �̿��� �ż��� �̿�-------
		c.test1(10,20);
		System.out.println();
		
		//-----�ż��忡�� ���� return �޴� ��� 1 -------
		System.out.println(c.test2(10,20));   // return�� ���Ե� �Լ��� �����ϴ�.
		System.out.println();
		
		//-----�ż��忡�� ���� return �޴� ��� 2 -------
		int num = c.test2(100,200);
		System.out.println(num);
		System.out.println();
		
		//-----�ż��忡���� ����ȯ�� �̷���� -------
		int num2 = (int)(c.test3(100,200));
		System.out.printf("����ȯ ��: %d%n",num2);
		System.out.println();
		
		//-----void���� ����return�� -------
		c.test4(10,20);
		c.test4(100,200);		
		System.out.println();
		
		//-----���� �ż��忡�� ����return�� -------
		int num3 = c.test5(10,20);
		int num4 = c.test5(100,200);
		System.out.printf("�ż��� �� ���ǹ� - ����:%d, ��:%d %n",num3,num4);
		System.out.println();
		
	}
	void test()
	{
		System.out.println("�Լ�ȣ��");
	}

}

class Cals
{
	void test()
	{
		System.out.println("�ٸ� class�� �Լ�ȣ��");
	}
	
	void test1(int x, int y)
	{		
		System.out.printf("�Ű����� �̿뿹��: %d%n",x+y);
	}
	
	int test2(int x, int y)
	{		
		int c;       // ���������� �����Ѵ�. 
		c = x + y;   // ���������� ���Ͽ� ������ �̿��Ͽ� �ʱ�ȭ �Ѵ�. 
		return c;   // ���� ���� ����, ���, ���ĵ��� �Է��Ѵ�. 
	}
	
	double test3(double x, double y)
	{		
		int c;       // ���������� �����Ѵ�. 
		c = (int)(x + y);   // ���������� ���Ͽ� ������ �̿��Ͽ� �ʱ�ȭ �Ѵ�. 
		return c;   // ���� ���� ����, ���, ���ĵ��� �Է��Ѵ�. 
	}
	
	void test4(double x, double y)
	{		
		int c;       // ���������� �����Ѵ�. 
		c = (int)(x + y);   // ���������� ���Ͽ� ������ �̿��Ͽ� �ʱ�ȭ �Ѵ�. 
		if (c < 100)
		return;
		System.out.printf("�ż��� ���ǹ�: %d%n",c);// ���� ���� ����, ���, ���ĵ��� �Է��Ѵ�. 
	}
	
	int test5(double x, double y)
	{		
		int c;       // ���������� �����Ѵ�. 
		c = (int)(x + y);   // ���������� ���Ͽ� ������ �̿��Ͽ� �ʱ�ȭ �Ѵ�. 
		if (c > 100)   // ������ ������ �� else�� ���� ���� �� ó���ؾ� �Ѵ�. 	
		return c;
		else
		return 0; 		 
	}
}
