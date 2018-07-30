package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

	public class leftRot {

	    static int[] leftRotation(int[] a, int d) {
	        // Complete this function
	    	int l = a.length ;
	    	int a1 [] = new int[l];
	        for(int i = 0 ; i < l ; i ++){
	        	if(d == l){
	        	   d = 0;
		        }
		        a1[i] = a[d];
	            d++;
	        }
			return a1;
	        
	        
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int d = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i = 0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int[] result = leftRotation(a, d);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	        }
	        System.out.println("");


	        in.close();
	    }
	}