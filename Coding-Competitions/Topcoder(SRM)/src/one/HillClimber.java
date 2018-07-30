package one;

import java.util.Scanner;

public class HillClimber {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int head[] = new int[n];
		
		int c = longest(head);
		System.out.println(c);
		sc.close();
	}
	    public static int longest(int height[]){
	        int count = 0 ;
	        int len = height.length;
	        int i = 0,max = 0;
	        while(i<len-1)
	        {
	        	   if(height[i+1]>height[i])
	                {
	                    count++ ;
	                    i++;
	                    if(count > max ){
	                    	max = count ;
	                    }
	                }
	                else {
	                	i++;
	                	count = 0;
	                }
	            }
	        return max;
	    }
	}