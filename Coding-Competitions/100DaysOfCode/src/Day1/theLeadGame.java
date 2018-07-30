package Day1;

import java.io.IOException;
import java.util.Scanner;

class theLeadGame {

	private static Scanner sc;

	public static void main(String[] args) throws NumberFormatException, IOException  {
		sc = new Scanner(System.in);
		int s =sc.nextInt();int s1 =0 ,s2 = 0;
		int max = 0,person = 0 ;
		for(int i = 0; i < s ;i++) {
			s1 += sc.nextInt();
			s2 += sc.nextInt();
			{
				if(s1-s2 > max) {
					max = s1 - s2 ;
					person = 1 ;
				}
				else if(s2-s1 > max){
					max = s2 - s1 ;
					person = 2 ;
				}
				else {
					continue ;  
				}
			}
		}
		System.out.println(person+" "+max);
	}
}
