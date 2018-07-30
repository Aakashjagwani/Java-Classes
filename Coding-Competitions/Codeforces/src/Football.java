import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Football {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s =bi.readLine();
		System.out.println(s.matches("(.*1111111.*)|(.*0000000.*)" ) ? "YES" : "NO" ); 
		
//		char team[]=s.toCharArray();
//		int count = 0,c = 0,i=0;
//		while(i<team.length) {
//			if(team[i] == '0'  ) {
//				count++;
//				i++;
//				if(count>6)break; 001001
		

//			}
//			else{
//				count = 0;
//				i++;
//			}
//		}
//		i=0;
//		while(i<team.length) {
//			if(team[i] == '1'  ) {
//				c++;
//				i++;
//				if(c>6)break;
//			}
//			else{
//				c = 0;
//				i++;
//			}
//		}
//		
//		if(count>6 || c>6) {
//			System.out.println("YES");	
//		}
//		else {
//			System.out.println("NO");
//		}
//		
	}

}
