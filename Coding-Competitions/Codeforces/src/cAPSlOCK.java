import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cAPSlOCK {

	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String word=bi.readLine();
		char dst[] =word.toCharArray();		
		String s1 =word.toUpperCase();
		int c1 =(int) dst[0];
		String s2 = word.substring(1, word.length()).toUpperCase();
		String s3 = word.substring(1);
		
		if(s1.equals(word)) {
			for(int i=0;i<dst.length;i++) {
				if((int) dst[i] >= 65 && (int) dst[i] < 97 ) {
					dst[i] = (char) ((int) dst[i] + 32);
				}
			}
		}
		else if( c1 >= 97 && s2.equals(s3)){
			 dst[0] = (char) ((int) dst[0] -32);
		 	 for(int i=1;i<dst.length;i++) {
			 if((int) dst[i] >= 65 && (int) dst[i] < 97 ) {
				dst[i] = (char) ((int) dst[i] + 32);
			 	}
			 }
		}
		else
		{
			for(int i=0;i<dst.length;i++) {
				dst[i] = word.charAt(i) ;
			}
		}
		for (int i = 0; i < dst.length; i++) {
			System.out.print(dst[i]);
		}
	}
}