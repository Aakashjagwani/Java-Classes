import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Arrays;

public class nextRound {

	public static void main(String[] args) throws Exception {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int[] array = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int n = array[0];
		int k = array[1];
		int[] array1 = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int c = 0;
		int p = array1[k-1];
		for(int i = 0;i<n ;i++) {
			if(array1[i]>0) {
			if(array1[i]>=p)
				c++;
		}
		}
		System.out.println(c);	
}
}
