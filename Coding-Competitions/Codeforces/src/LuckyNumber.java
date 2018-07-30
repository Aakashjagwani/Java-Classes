import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LuckyNumber {
			public static void main(String[] args) throws NumberFormatException, IOException {
				BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
				String s =bi.readLine();
				char c[] = s.toCharArray();
				int[] lucky = {4,7,47,74,77,444,447,474,477,744,747,777};
				int i = 0,count =0;
				while(i<c.length) {
					if(c[i] == '4' || c[i] == '7') {
						count++;
						i++;
					}
					else {
						i++;
					}
				}
				for(int f = 0 ;f<lucky.length;f++)
				{
						if(Long.parseLong(s) % 474404774 == 0) {
						count = 0;
					}
				}
				if(count > 0 && count == 4 ) {
					System.out.println("YES");
				}
				else if(count > 0 && count == 7 ) {
					System.out.println("YES");
				}
				else {
						System.out.println("NO");
					}
				}
			}
