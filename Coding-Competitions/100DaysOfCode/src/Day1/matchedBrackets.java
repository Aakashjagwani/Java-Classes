package Day1;

import java.util.Scanner;
import java.util.Stack;

public class matchedBrackets {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		int N =sc.nextInt();
		
		Stack<Integer> st = new Stack<Integer>(); 
	    for(int i = 0 ; i< N ;i++) {
	    	st.push(sc.nextInt());
	    }
	    int depth = 1 ,max = 0 ,index = 0,noticeIndex = 0 ;
		while(st.isEmpty()) {
			if(st.pop() == 1  ) {
				max = depth ;
				noticeIndex = index ;
			}
			st.pop();
			index++;
		}
		System.out.println(noticeIndex+" " +depth+" "+max );
		
	}

}
