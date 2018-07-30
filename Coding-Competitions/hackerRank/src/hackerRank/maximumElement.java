package hackerRank;

import java.util.Scanner;
import java.util.Stack;

public class maximumElement {

	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
         Stack<Long> stack = new Stack<Long>();
         Stack<Long> trackstack = new Stack<Long>();
         
  		 for(int i=0;i<n;i++) {
        	int type = in.nextInt();
        	if(type == 1) {
        		long data = in.nextLong();
        		stack.push(data);
        		 if(stack.size() == 1){
        	        trackstack.push(data);
        	    }
        		else if(data >= trackstack.peek() ) {
            		trackstack.push(data);
        		}
        	}
        	else if(type == 2 ) {
        		if(stack.isEmpty()) {
        			break ;
        		}
                long q = stack.peek();
                if(q==trackstack.peek()){
                    trackstack.pop();
                }
        		stack.pop();
        	}
        	
        	else{
	    			long max = 0l;
	    	        max	= trackstack.get(trackstack.size()-1);
	            	System.out.println(max);
	    		}
        	}
  		 in.close();
		}
	}