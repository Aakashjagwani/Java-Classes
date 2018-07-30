import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTask {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s = bi.readLine().toLowerCase();
		StringBuilder s1 = new StringBuilder(s);
		StringBuilder temp = new StringBuilder();
		int i=0;
		while(i<s1.length())
		{
		if(s1.charAt(i) == 'a' ) {
			s1.deleteCharAt(i);
		}
		else if(s1.charAt(i) == 'e' ) {
			s1.deleteCharAt(i);
		}
		else if(s1.charAt(i) == 'i' ) {
			s1.deleteCharAt(i);
		}
		else if(s1.charAt(i) == 'o' ) {

			s1.deleteCharAt(i);
		}
		else if(s1.charAt(i) == 'u' ) {
			s1.deleteCharAt(i);
		}
		else if(s1.charAt(i) == 'y' ) {
			s1.deleteCharAt(i);
		}
		else {
			temp.append("."); 
			temp.append(s1.charAt(i)); 
			i++;
		}
	}
		System.out.println(temp);
}
}