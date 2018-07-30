import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class capitalization {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer word= new StringBuffer(bi.readLine());
		int ascii =(int) word.charAt(0);
		if( ascii >= 97  ) {
			ascii = ascii - 32;
		}
		char ch = (char) ascii;
		word.setCharAt(0, ch);
		System.out.println(word);
	}
}
//public static void main(String[] args){
//	String a = (new Scanner(System.in)).next();
//	System.out.println((a.charAt(0)+"").toUpperCase() + a.substring(1));
//}