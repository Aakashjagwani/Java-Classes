package Day1;

import java.util.Scanner;

class superGirl {

	@SuppressWarnings("null")
	public static void main(String[] args)  {
		try {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int pebles[] = null;
		for(int i = 0; i< N ;i++) {
			pebles[i] = in.nextInt();
		}
		int yes = 0;
		for(int j = 0 ; j < N ; j = j + 2 ) {
			if( pebles[j+1] > pebles[j])
			{
				yes += 1 ;
			}
		}
		if(yes == N/2) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
		catch (Exception e) {
			System.err.println(e);
		}
	return ;
	}
}