package GUI;

import java.awt.*;
import java.awt.event.*;

class PlayTest implements Runnable
{
	String[] yut = { "○○○○", "●●●●" };
	String[] yutName = { "도", "개", "걸", "윷", "모" };
		
	String[] rolling = new String[4];
	String result;
		
	public PlayTest()
	{
		rolling[0] = yut[0];
		rolling[1] = yut[0];
		rolling[2] = yut[0];
		rolling[3] = yut[0];
		
		/*switch ()
		{
		case (yut[0] == "○○○○"): 
			result = yutName[0];
		case (yut[0] == "○○○○"): 
			result = yutName[1];
		case (yut[0] == "○○○○"): 
			result = yutName[2];
		case (yut[0] == "○○○○"): 
			result = yutName[3];
		case (yut[0] == "●●●●"): 
			result = yutName[4];
		break;
		}*/
	
		result = yutName[4];
		start();
	}
	
	void start()
	{
		System.out.println(rolling[0]);
		System.out.println(rolling[1]);
		System.out.println(rolling[2]);
		System.out.println(rolling[3]);
		System.out.println(result);
	}
	
	
	
	public static void main(String[] args) 
	{
		new	PlayTest();
	}
	
	public void run() {
		try
		{
			Thread.sleep(50);  //0.05초
		} catch (InterruptedException ex){}
			start(); 		
	}

}
