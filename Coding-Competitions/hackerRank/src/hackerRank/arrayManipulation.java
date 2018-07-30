package hackerRank;

import java.util.Scanner;

public class arrayManipulation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long m = in.nextLong();
        long[] l =new long[ n+1];
        long max = 0 ;
        for(long a0 = 0; a0 < m; a0++){
            long a = in.nextLong();
            long b = in.nextLong();
            long k = in.nextLong();
        
        for(int i = 1 ; i <= n ; i++ ) {
        	if(i>=a && i<=b){
        		l[i] += k;
         	}
        	if(max < l[i]) {
        		max = l[i];
        	}
        }
        }
        System.out.println(max);
        
        in.close();
	}
}
