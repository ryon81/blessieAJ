class Tv 
{
	String color; 
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}

class TvTest 
{
	public static void main(String[] args) 
	{
		/*
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� "+ t.channel + " �Դϴ�.");*/
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channel = 7;
		
		t2.channel = t1.channel;
		
		t1.channelDown();		
		t2.channelDown();
		
		System.out.println("���� ä���� "+ t1.channel + " �Դϴ�.");
		System.out.println("���� ä���� "+ t2.channel + " �Դϴ�.");
	}
}
	