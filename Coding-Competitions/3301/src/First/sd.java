package First;
import java.util.Scanner;

public class sd {
	public static void main(String h[])
	{
		Scanner s=new Scanner(System.in);
		
		int test=s.nextInt();
		
		for(int i=0;i<test;i++)
		{
			int lines=s.nextInt();
			int[][] triangle=new int[lines][];
			for(int k=0;k<lines;k++)
			{
				triangle[k]=new int[k+1];
				for(int j=0;j<=k;j++)
				{
					triangle[j][k]=s.nextInt();	
				}
			}		
		}
		s.close();	
	}
}
