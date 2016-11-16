package lambda01;

@FunctionalInterface
interface MyFunction
{
	void run();
}

class LambdaEx01 {

	static void execute(MyFunction f)
	{
		f.run();
	}
	
	static MyFunction getMyFunction()
	{
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	static MyFunction getMyFunction2()
	{		
		return () -> System.out.println("f4.run()");
	}
	
	public static void main(String[] args) 
	{
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction()
		{
			public void run() 
			{
				System.out.println("f2.run()");
			}
		};
		
		MyFunction f3 = getMyFunction();
		MyFunction f4 = getMyFunction2();
		
		f1.run();
		f2.run();
		f3.run();
		f4.run();
		
		execute(f1);
		execute(() -> System.out.println("run()"));

	}

}
