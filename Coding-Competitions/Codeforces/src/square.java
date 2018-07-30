import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class square {
	public static void main(String[] args) throws Exception {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		long[] array = Arrays.stream(bi.readLine().split("\\s")).mapToLong(Long::parseLong).toArray();
		long m = array[0];
		long n = array[1] ;
		long a = array[2];
		System.out.println( java.lang.Math.ceil(m/a) * java.lang.Math.ceil(n/a));
		
	}
}
