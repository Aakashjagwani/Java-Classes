import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AandBcompilation {

	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(bi.readLine());
		int[] array = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int[] array1 = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int[] array2 = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		
		int a = 0, b = 0 , c =0 ;
		for(int i = 0 ;i<array.length ; i ++) {
			a += array[i];
		}
		for (int i = 0; i < array1.length; i++) {
			b += array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			c += array2[i];
		}
		System.err.println(a-b);
		System.err.println(b-c);
		

	}

}
