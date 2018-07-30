import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boyOrGirl {

	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s =bi.readLine();
		List<Object> n =new ArrayList<>();
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(!n.contains(c[i])  ) {
				n.add(c[i]);
			}
		}
		if((n.size() % 2) == 0 ) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
	}

}
