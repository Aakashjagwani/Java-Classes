import java.util.Scanner;

public class HolidayOfequality {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		int max= 0;
		for(int i = 0 ;i<n;i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) max  = arr[i];
		}
		int count  = 0;
		for(int i = 0 ;i<n;i++) {
			if(arr[i] < max ) {
				count  += max - arr[i]; 
			}
		}
		System.out.println(count);
		sc.close();
	}

}
