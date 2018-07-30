import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class patrickShopping {

	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int[] array = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int d1  = array[0];
		int d2 = array[1];
		int d3 = array[2];
		int minimum = 0 ; 
		if(d3 > d1 + d2 ) {
			minimum  = d1 + d2 + d2 + d1 ;
		}
		else {
			if(d1 > d2 + d3) {
				minimum = (d2 + d3 )* 2;
			}else if(d2 > d1 + d3){
				minimum = (d1 + d3) * 2 ;
			}
			else {
				minimum = d1 + d3 + d2 ;
			}
			
		}
		System.out.println(minimum);
	}

}
