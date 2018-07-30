import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SoldierandBananas {

	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int[] array = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int k = array[0];
		int n = array[1];
		int w = array[2];
		int baki = 0,total = 0 ;
		for (int i = 1; i <=w ; i++) {
			total += i * k;
			
			baki = total - n; 
			
		}
		if(baki<1) baki = 0;
		System.out.println(baki);
		
	}

}
