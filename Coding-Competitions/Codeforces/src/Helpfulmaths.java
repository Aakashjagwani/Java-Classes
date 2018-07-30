import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Helpfulmaths {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int array[]=Arrays.stream(br.readLine().split("\\+")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if(i<array.length-1) {
				System.out.print("+");
			}
		}
		
	}

}
