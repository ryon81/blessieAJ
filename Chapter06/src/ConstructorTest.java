class Data3 
{
	int value; 
}

class Data2 
{
	int value;
	
	Data2(int x) 
	{
		value = x;
	}
}

class ConstructorTest 
{
	public static void main (String[] args)
	{
		Data3 d1 = new Data3();
		Data2 d2 = new Data2(3);
		
		System.out.println("Data1= "+d1.value);
		System.out.println("Data2= "+d2.value);
	}
}
