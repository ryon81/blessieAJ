package threadex01;

class ThreadEx01 
{
	public static void main(String[] args) 
	{
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		// Thread t2 = new Thread(ThreadEx1_2()); 한줄로 표시할 수 있음.
		
		t1.start();
		t2.start();		
	}
}

class ThreadEx1_1 extends Thread
{
	public void run()
	{
		for (int i=0; i<5000; i++)
		{
			System.out.println(getName());
		}
	}
}

class ThreadEx1_2 implements Runnable
{
	public void run()
	{
		for (int i=0; i<5000; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
