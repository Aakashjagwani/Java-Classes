package dataone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Get {
	public static void main(String args[]) throws FileNotFoundException
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the File path then products");
		String s=scanner.nextLine();
		String[] parts=s.split(" ");
		
		String file=parts[0];
		
		System.out.println(file);
		 		
		File f=new File(file);
		Scanner scanner1 = new Scanner(f);
		scanner1.useDelimiter(",");
		while (scanner1.hasNext()) 
        {
			String s2 = scanner1.next();
			System.out.print(s2);
        }
		 scanner.close();
		 scanner1.close();
	}
}
