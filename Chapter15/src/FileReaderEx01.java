import java.io.*;

class FileReaderEx01 
{
	public static void main(String[] args) 
	{
		try 
		{
			String fileName = "test.txt";
			
			int data = 0;
			
			//------ ����Ʈ����� ��Ʈ�� -------
			FileInputStream fis = new FileInputStream(fileName);

			while((data = fis.read())!=-1)
			{
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();
			
			//------ ���ڱ���� ��Ʈ�� ---------
			FileReader fr = new FileReader(fileName);
			
			while((data = fr.read())!=-1)
			{
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
