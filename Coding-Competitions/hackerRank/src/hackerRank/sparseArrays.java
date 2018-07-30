package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sparseArrays {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String string[] =  new String[n];
		for (int i = 0; i < n; i++) {
			string[i] = br.readLine() ;
		}
		int q = Integer.parseInt(br.readLine());
		String query[] =  new String[q];
		for (int i = 0; i < q; i++) {
			query[i] = br.readLine() ;
		}
		int c[] =new int[q];
		
		for(int i = 0;i<q;i++) {
			c[i] = 0;
			for(int j = 0;j<n;j++){
				if(query[i].contentEquals(string[j])) {
					c[i]++;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
