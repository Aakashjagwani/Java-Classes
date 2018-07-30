package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class videoGame {
	private static Scanner sc;
	static int index = 0;
	static boolean haiYanahi  = false;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int width =sc.nextInt();
		int height =sc.nextInt();
		List<Integer> numbers = new ArrayList<>(); 
		for(int i = 0;i<width;i++) {
			numbers.add(i, sc.nextInt());
		}
		int j = 1;
		while(j!=0){
			j = sc.nextInt();
			operation(numbers, j,height);
		}
		for (int p = 0;p<=numbers.size()-1;p++) {
			System.out.print(numbers.get(p)+" ");
		}
	}
	private static void operation(List<Integer> current,int j,int maxH) {
		if(j == 1 && index!=0) {
			index--;
		}
		else if(j == 2 && index!=(current.size()-1)){
			index++; 
		}
		else if(j == 3 && haiYanahi == false &&  current.get(index)!=0 ) {
			int k = current.get(index);
			k--;
			current.set(index, k);
			haiYanahi = true ;
		}
		else if (j == 4 && current.get(index)!=maxH  && haiYanahi == true ) {
			int k = current.get(index);
			k++;
			current.set(index, k);
			haiYanahi = false;
		}
	}
}