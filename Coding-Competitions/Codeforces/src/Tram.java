import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Tram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		int a[] = new int[1000]; 
		int b[] = new int[1000];
		int capacity = 0;
		for(int i = 0;i<n;i++) {
			 int[] array = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
			 a[i] = array[0];
			 b[i] = array[1];
		}
		int dif = 0,aya =0,dif1 = 0,aya1 =0;
		int capacity1 = 0;
		int max =0 ;

		for (int i = 0; i < n; i++) {
			 
			
			if(i==0) {
				dif1 =  0;
				aya1 = b[0];
				capacity1 = aya1 + dif1;
			}
			else {
				 aya = b[i];
				 dif = dif + b[i-1] - a[i];
				 capacity = aya + dif;
				 if(capacity > max) {
					 max = capacity;
				 }
			}
		}
		if(max < capacity1)
		 {
			 max = capacity1;
		 }
		System.out.println(max);
		
	}
//	
//	public static void main(String[] args){
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int k=0;
//		int max=0;
//		for(int q=0;q<n;q++){
//			int a=s.nextInt(); int b=s.nextInt();
//			k=k-a+b;
//			if(k>max) max=k;
//		}
//		System.out.println(max);
//	}
//	
//	
//	

}
