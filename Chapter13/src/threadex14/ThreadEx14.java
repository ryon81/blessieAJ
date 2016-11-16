package threadex14;

import javax.swing.JOptionPane;

class ThreadEx14 
{
	public static void main(String[] args) throws Exception 
	{
		ThreadEx14_1 th1 = new ThreadEx14_1();
		th1.start();

		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		
		th1.interrupt();
		System.out.println("isInterruptted():" + th1.isInterrupted());
	}
}

class ThreadEx14_1 extends Thread
{
	public void run()
	{
		int i = 10; 

		while(i!=0 && !isInterrupted())
		{
			System.out.println(i--);
			try
			{
				Thread.sleep(1000);
			} catch(InterruptedException e){}
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}