package hackerRank;

import java.util.*;

public class equalStacks {

	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int max1=0,max2=0,max3=0;
        int h1[] = new int[n1];
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
           	s1.push(h1[h1_i]);
            max1+=h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            s2.push(h2[h2_i]);
            max2+=h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
        	s3.push(h3[h3_i]);
            max3+=h3[h3_i];
        }
        while(!s1.isEmpty() || !s2.isEmpty() || !s3.isEmpty()) {
        	if(max1==max2 && max2==max3) {
        		System.out.println(max1);
        		return ;
        	}
        	if(max1>max2 && max1>max2) {
        		int del = s1.get(0);
        		s1.remove(0);
        		max1 = max1 - del ; 
        	}
        	else if(max2>max1 && max2>max3) {
        		int del = s2.get(0);
        		s2.remove(0);
        		max2 = max2-del ; 
        	}
        	else if(max3>max1 && max3>max2) {
        		int del = s3.get(0);
        		s3.remove(0);
        		max3 = max3-del ; 
        	}
        }
	}
}
