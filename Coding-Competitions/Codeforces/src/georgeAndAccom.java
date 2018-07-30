import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class georgeAndAccom {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(bi.readLine());
		int p[] = new int[test];
		int q[] = new int[test];
		int count = 0 ;
		for(int i = 0;i<test;i++) {
			int[] array = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
			p[i] = array[0];
			q[i] = array[1];
			}
		for (int i = 0; i < p.length; i++) {
			if(p[i]+2 <= q[i]) {
				count++ ;
			}
		}
		System.out.println(count);	
	}

}
