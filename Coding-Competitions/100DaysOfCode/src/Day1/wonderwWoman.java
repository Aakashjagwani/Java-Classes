package Day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

 class wonderwWoman {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int N =sc.nextInt();
		int nums[] = new int[N];
	    String[] arr = new String[nums.length];

		for(int i = 0;i<N;i++) {
			nums[i] = sc.nextInt();
	        arr[i]=String.valueOf(nums[i]);
		}
		int largest = Integer.parseInt(largestNumber(arr));
		System.out.println(largest);
	}
	static String largestNumber(String[] arr) {
	    Arrays.sort(arr, new Comparator<String>(){
	        public int compare(String a, String b){
	            return (b+a).compareTo(a+b);
	        }
	    });
	    StringBuilder sb = new StringBuilder();
	    for(String s: arr){
	        sb.append(s);
	    }
	 
	    while(sb.charAt(0)=='0'&&sb.length()>1)
	        sb.deleteCharAt(0);
	 
	    return sb.toString();
	}	
}