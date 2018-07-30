import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class dreamoonAndStaris {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] array = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int m = array[0];
		int n = array[1];
		if(m<n) {
			System.out.println(-1);
			return ;
		}
		int d = m/2 ;
		int r = m%2  ; 
		if(d%n == 0 && r==0) {
			System.out.println(d);
		}
		else {
			d++;
			while(! (d % n == 0)) {
				d++; 
			}
			System.out.println(d);
		}
	}
}