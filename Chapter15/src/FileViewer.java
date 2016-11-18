import java.io.*;
import java.util.*;

class FileViewer 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		FileInputStream fis = new FileInputStream(s);
		int data = 0; 
		
		while ((data=fis.read())!=-1)
		{
			char c= (char)data;
			System.out.print(c);
		}

		fis.close();
		sc.close();
	}

}
