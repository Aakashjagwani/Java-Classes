import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tooLong {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		a = Integer.parseInt(bi.readLine());
		String tokens[] = new String[a];
		for(int i = 0 ; i<a ; i ++) {
			tokens[i]=bi.readLine();
		}
		int i = 0;
		while( i < tokens.length) {
			int l = tokens[i].length();
			if(l > 10){
		    		int m = l-2;
				    System.out.print(tokens[i].charAt(0) );
				    System.out.print(m );
				    System.out.println(tokens[i].charAt(l-1));
				    i++;
			}
			else {
				 System.out.println(tokens[i]);
				 i++;
			 }
		}
	}
}
