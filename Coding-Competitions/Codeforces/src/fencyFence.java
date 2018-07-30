import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fencyFence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test =  Integer.parseInt(br.readLine());
		int arr [] = new int[test];
		for(int i= 0 ; i<test ;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < arr.length; i++) {
			float n = 0 ;
			float exterior = 180 - arr[i]    ;
			n = 360 / exterior ; 
			if(n > 2 && n % 1 == 0) 
			{
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
