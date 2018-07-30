import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulYear {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int f = i ;
		if(Digits(i) == true) {
			f++;
		}
		boolean s = Digits(f);
		
		while(s == false) {
			f++;
			s = Digits(f);
		}
		System.out.println(f);	
	}
	static boolean Digits(int i) {
		int count = 0;
		Set<Integer> set = new HashSet<Integer>();
		boolean flag ;
		while (i > 0) { 
		    int tempVal = i % 10;
	        set.add(tempVal); 
	        i = i / 10;
	        count++;
	    }
		if (count == set.size()) {
	        flag = true ;
	    } 
		else {
	        flag = false;
	    }
		return flag;
	}	
}