import java.util.Scanner;

public class translation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer s =new StringBuffer(sc.nextLine());
		StringBuffer t =new StringBuffer(sc.nextLine());
		StringBuffer r = s.reverse();
		int count = 0;
		int len = r.length();
		int len2 = t.length();
		if(len == len2) {
			for(int i = 0;i<t.length();i++) {
				if(t.charAt(i) == r.charAt(i)) {
					count++ ;
				}
			}
				
		}
		if(count == t.length()) {
			System.out.println("YES");}
		else {
			System.out.println("NO");
		}
		sc.close();
	}
}
