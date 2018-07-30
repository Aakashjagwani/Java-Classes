import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxi {

	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int s=Integer.parseInt(bi.readLine()) ;
		int array[] = new int[s];
	//	int[] array = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		String s1[] = bi.readLine().split("\\s");
		for (int i = 0; i < s; i++) {
			array[i]=Integer.parseInt(s1[i]);
		}
		int sum = 0;
		int ans = 0,i=0;
		while(i<array.length) {
			 
			if(array[i]>=3) {
				ans++;
				i++;
			}
			else {
			sum += array[i];
			i++;
			}		
		}
		if(sum > 4) {
			int y = sum / 4;
			ans = y + ans;
		}
		else {
			if(sum >0 && sum <=4){
				ans++;
			}
		}
		System.out.println(ans);

	}

}
