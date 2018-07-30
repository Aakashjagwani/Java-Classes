import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Team {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int c =Integer.parseInt(bi.readLine());
		int count=0;
		for(int i = 0;i<c;i++) {
		int[] array = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		int p = array[0];
		int v = array[1];
		int t = array[2];
		if(p==1 && v==1 || p==1 && t==1 || v==1 && t==1)
		{
			count++;
		}
		}
		System.out.println(count);
	}
}
