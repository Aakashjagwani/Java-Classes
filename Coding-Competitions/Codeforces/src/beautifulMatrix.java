import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beautifulMatrix {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int arr[][]=new int[5][5];
		String[] s = null;
		for(int i=0;i<5;++i)
		      {
		    	   s = bi.readLine().split(" "); 
 		    	   for(int j =0;j<5;j++) {
		    		  arr[i][j] = Integer.parseInt(s[j]);
		    		  if(arr[i][j]== 1)System.out.println(Math.abs(2-i)+Math.abs(2-j));
		      }
		}
//		int seti = 0,setj = 0;
//		for(int i=0;i<5;++i)
//	      {
//			for(int j=0;j<5;++j)
//		      {
//				if(arr[i][j] == 1) {
//					seti = i ;
//					setj = j ;
//				}
//		      }
//	      }
//		int count = 0;
//		if(seti == 2 ) {
//			if(setj == 2) {
//					count = 0 ;
//					}
//			else {
//					int oper = setj - 2; 
//					count = java.lang.Math.abs(oper);
//			}
//		}
//		else {
//			if(setj == 2 && (seti > 3 || seti < 1)  ) {
//				count = setj ;
//				System.out.println(count);
//				return ;
//			}
//			else {
//					int oper = setj - 2; 
//					count = java.lang.Math.abs(oper);
//			}
//			int oper = seti - 2; 
//			count += java.lang.Math.abs(oper);
//		}
//		System.out.println(count);
	}
}
//		if(scan.nextInt() == 1)System.out.println(Math.abs(2-i)+Math.abs(2-j));;