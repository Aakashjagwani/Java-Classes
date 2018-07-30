import java.util.Scanner;
public class Keyboard {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String c = sc.nextLine(); 
	String s = sc.nextLine();
	int flag = 0 ;
	if(c.equals("R") ) {flag  = 1; };
	String key1 = new String("qwertyuiop");
	String key2 = new String("asdfghjkl;");
	String key3 =	new String("zxcvbnm,./"); 
	StringBuffer fina = new StringBuffer(); 
	int i = 1;
	while(i <= s.length()) {
		String q = String.valueOf(s.charAt(i-1));
		if(key1.contains(q)) {
			int f = 0 ;
			if(flag == 1) {
				f = key1.indexOf(q) - 1;
			}else {
				f = key1.indexOf(q) + 1;
			}
//			if(f >= key2.length()) f = 0;
			fina.append(key1.charAt(f));
			i++;
		}
		else if(key2.contains(q)) {
			int f = 0 ;
			if(flag == 1) {
				f = key2.indexOf(q) - 1 ;
			}else {
				f = key2.indexOf(q) + 1;
			}
//			if(f >= key2.length()) f = 0;
			fina.append(key2.charAt(f));
			i++;
		}
		else {
			int f = 0 ;
			if(flag == 1) {
				f = key3.indexOf(q) - 1 ;
			}else {
				f = key3.indexOf(q) + 1;
			}
//			if(f >= key2.length()) f = 0;
			fina.append(key3.charAt(f));
			i++;
		}
	}
	System.out.println(fina);
	sc.close();
	}
}
