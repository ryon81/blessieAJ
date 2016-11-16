import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorEx1_2 
{

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
				
		ListIterator it = list.listIterator();
		
		String s = "";
		int num = 0;		
		int even = 0;
		int odd = 0;
		
		while (it.hasNext())
		{
			s = (String)it.next();
			num = Integer.parseInt(s);
			if(num %2 == 0)
			{
				even += num;				
			} else
			{
				odd += num;				
			}			
		}
		System.out.println("Â¦¼öÀÇ ÇÕÀº: " + even);
		System.out.println("È¦¼öÀÇ ÇÕÀº: " + odd);
	}

}
