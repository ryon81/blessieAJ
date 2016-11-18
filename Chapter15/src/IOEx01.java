import java.io.*;
import java.util.*;

public class IOEx01 
{
	public static void main(String[] args) 
	{
		byte[] inSrc ={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while((data = input.read()) != -1)
		{
			output.write(data);
		}
		
		outSrc = output.toByteArray();
		
		System.out.println("Input Source :" + Arrays.toString(inSrc));
		System.out.println("Output Source :" + Arrays.toString(outSrc));

	}

}
