import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bit {

	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		
		int i = Integer.parseInt(bi.readLine());
		int X =0;
		String temp[] = new String[i];
		for (int j = 0; j < i; j++) {
				temp[j] = bi.readLine();
				if(temp[j].contains("++")) {
					X++;
				}
				else
				{
					X--;
				}
		}
		System.out.println(X);
	}

}
