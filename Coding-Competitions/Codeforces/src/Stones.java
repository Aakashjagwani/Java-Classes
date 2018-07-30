import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stones {

	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
//		int[] array = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int n = Integer.parseInt(bi.readLine());
		String stones= bi.readLine();
		int c = 0,i=0 ;
			while(i<n-1) {
				if(stones.charAt(i) == stones.charAt(i+1)) {
					c++;
					i++;
			}	
				else {
					i++;
				}
	}
		System.out.println(c);
}
}