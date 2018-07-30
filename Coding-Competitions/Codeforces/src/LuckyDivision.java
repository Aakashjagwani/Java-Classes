import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyDivision {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int s =Integer.parseInt(bi.readLine());
		int[] lucky = {4,7,47,74,77,444,447,474,477,744,747,777};
		if(s % 4 == 0) {
			System.out.println("YES");
		}
		else if(s % 7 == 0) {
			System.out.println("YES");
		}
		else {
			boolean flag= false;
			for(int i =0 ; i<lucky.length ; i++ ) {
			if(s % lucky[i] == 0 ) {
				flag = true;
				break ;
				}
			}
			if(flag == true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}	
		}
	}
}