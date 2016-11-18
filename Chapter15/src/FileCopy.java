import java.io.*;
import java.util.*;

class FileCopy 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���ϸ�: ");
		String inS = sc.nextLine();
		System.out.println("��� ���ϸ�: ");
		String outS = sc.nextLine();
		
		try
		{
			FileInputStream fis = new FileInputStream(inS);
			FileOutputStream fos = new FileOutputStream(outS);

			int data = 0; 

			while ((data=fis.read())!=-1)
			{
				fos.write(data);
			}

			fis.close();
			fos.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		sc.close();
	}

}
