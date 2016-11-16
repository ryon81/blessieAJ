import java.util.Scanner;
import java.util.Calendar;

class CalendarEx6_1 
{

	public static void main(String[] args)
	{				
		Scanner s = new Scanner(System.in);
		System.out.println("년도를 입력하세요.>");
		int year = s.nextInt();
		System.out.println("월을 입력하세요.>");
		int month = s.nextInt();
		
		s.close();
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
				
		eDay.add(Calendar.DATE, -1);
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);		
		
		System.out.println("      " + year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for (int i = (START_DAY_OF_WEEK-1) ; i > 0 ; i--)
		{
			sDay.set(year, month-1, 1);
			sDay.add(Calendar.DATE, -i);
			int tmp = sDay.get(Calendar.DATE);
			System.out.print(" " + tmp);
		}
		
		for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++)
		{
			System.out.print((i < 10)? "  "+i : " "+i);
			if (n%7 == 0) System.out.println();
		}		
		
		for (int i = 0 ; i <= 7 ; i++)
		{
			Calendar nDay = Calendar.getInstance();
			nDay.set(year, month, 1);
			nDay.add(Calendar.DATE, +i);
			int num = nDay.get(Calendar.DATE);
			int sa = nDay.get(Calendar.DAY_OF_WEEK);
			System.out.print("  " + num);
			if (sa == 7) break;
		}
	}
}
