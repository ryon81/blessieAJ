class currencyConverter
{	
	private static double rate;
	
	static void setRate(double r)
	{		
		rate = r;
		return;
	}
	
	static double toKWR(double d)
	{
		double rlt = d * rate; 
		return rlt;
	}
	static double toDollar(double w)
	{
		double rlt = w / rate;
		return rlt;
	}
}

public class StaticMember 
{
	public static void main(String[] args) 
	{
		currencyConverter.setRate(1121);
		System.out.println("�鸸���� "+currencyConverter.toDollar(10000000)+"�޷��Դϴ�.");
		System.out.println("��޷��� "+currencyConverter.toKWR(100)+"���Դϴ�.");
	}
}
