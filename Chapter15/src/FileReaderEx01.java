import java.io.*;

class FileReaderEx01 
{
	public static void main(String[] args) 
	{
		try 
		{
			String fileName = "test.txt";
			
			int data = 0;
			
			//------ 바이트기반의 스트림 -------
			FileInputStream fis = new FileInputStream(fileName);

			while((data = fis.read())!=-1)
			{
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();
			
			//------ 문자기반의 스트림 ---------
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
