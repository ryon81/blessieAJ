import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedOutputStreanEx02 
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("abc.txt");
			
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			for(int i=65; i<=90; i++)
			{
				bos.write(i);
			}
			bos.close();			
		} catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
