package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class first {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = N ;i>0;i--) {
			for(int j = 0;j<N;j++) {
				recursive(i);
			}
			for(int j = N;j>0;j--) {
				recursive(i);
			}
		}
	}
	public static void recursive(int n) {
		if(n==1) {
			System.out.println(n+ " ");
		}
		else {
			System.out.print(n + " ");
			recursive(n-1);
		}
	}
}
