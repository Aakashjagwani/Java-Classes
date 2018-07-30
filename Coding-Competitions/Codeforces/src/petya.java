import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class petya {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bi.readLine().toLowerCase();
		String s1 = bi.readLine().toLowerCase();
		int n = s.compareTo(s1);
		if(n > 0) {
			System.out.println("1");
		}
		else if(n == 0) {
			System.out.println("0");
		}
		else
			System.out.println("-1");
		
	}

}
