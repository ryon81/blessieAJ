import java.util.Scanner;
public class StringParse 
{

	public static void main(String[] args) 
	{
		System.out.println("�ܾ �Է��ϼ���.>");
				 
		Scanner s = new Scanner(System.in);
		String tmp = s.nextLine();
		int length = tmp.length();
		
		System.out.println("�Է��� �ܾ�� " + length + " �����Դϴ�.");
		
		for (int i = 0; i <= length; i++ )
		{
			char[] c = new char[i];
		}
		
		
		s.close();

	}

}
