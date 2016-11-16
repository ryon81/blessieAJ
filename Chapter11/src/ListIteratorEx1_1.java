import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorEx1_1 
{

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		for (int i = 1; i < 11; i++)
		{
			list.add(i);
		}
				
		ListIterator it = list.listIterator();
		
		int num = 0 ;		
		int even = 0;
		int odd = 0;
		
		while (it.hasNext())
		{
			num = (Integer)it.next();
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
