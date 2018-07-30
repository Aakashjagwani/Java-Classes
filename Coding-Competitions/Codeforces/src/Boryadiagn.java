import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boryadiagn {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr1[i] = sc.nextInt();
			arr2[i] = sc.nextInt();
		}	
		List<Integer> days = new ArrayList<>();
		int doc1 = arr1[0] ;
		days.add(doc1);
	
		for (int j = 1; j < n; j++) {
			int c = 0 ;
			int ans  = days.get(j-1) ;
			int next  = arr1[j] + arr2[j] ;
			if(arr1[j] > ans) {
				days.add(arr1[j]);	
			}
			else if(next > ans  ) {
				days.add(next);
			}
			else {
				c = c + 2 ;
				for(c = 2; next > ans ; c++) {
					next  = arr1[j] +  arr2[j];
				}
				days.add(next);

			}
			System.out.println(days.get(j));
			
		}
		System.out.println(days.get(days.size()-1));
		sc.close();
	}
}
