import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class multiplicationTable {
	public static void main(String[] args) throws IOException  {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int[] array = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int n  = array[0];
		int x =  array[1];
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if(x % i == 0) {
				if(i<=n && (x/i)<=n )
					count++ ;
				}
		}
		System.out.println(count);
	}
}
