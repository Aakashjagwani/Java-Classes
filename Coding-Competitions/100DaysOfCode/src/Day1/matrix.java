package Day1;

import java.util.Scanner;

public class matrix {
	private static Scanner sc;
	
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int N =sc.nextInt();
		int matrix[][] = new int[N][N];
		for(int i = 0 ;i<N;i++) {
			for(int j = 0;j<N;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ;i<N;i++) {
			for(int j = N-1;j>=0;j--) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
}
