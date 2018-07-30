import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HQ9 {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s =bi.readLine();
		
		if(s.contains("H")) {
			System.out.println("YES"); 
		}
		else if(s.contains("Q")) {
			System.out.println("YES");
		}
		else if(s.contains("9"))
		{
			System.out.println("YES");
		}
		
		else {
			System.out.println("NO");
		}
	}
}
