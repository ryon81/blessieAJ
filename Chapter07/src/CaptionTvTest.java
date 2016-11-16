class Tv1
{
	boolean power;
	int channel;
	
	void power() {power = !power;};
	void channelUp(){++channel;};
	void channelDown(){--channel;};	
}

class CaptionTv extends Tv1
{
	boolean caption;
	void displayCaption (String text)
	{
		if(caption) {System.out.println(text);}
	}
	
	//-------caption on off 매서드----------
	void isCaption()
	{
		caption = !caption;
	}
	//-------------------------------------
}

class CaptionTvTest 
{
	public static void main(String[] args) 
	{
		CaptionTv ctv = new CaptionTv();
		ctv.channel =10; 
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hellow, World");
		
		//--------매서드로 사용하기-------
		//ctv.caption = true;
		ctv.isCaption();
		
		ctv.displayCaption("Hellow, World");		
	}

}
