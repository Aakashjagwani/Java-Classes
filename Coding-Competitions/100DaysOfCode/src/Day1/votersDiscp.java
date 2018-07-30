package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class votersDiscp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int[] array = Arrays.stream(bi.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
		ArrayList<Integer> arr1 =new ArrayList<Integer>();
		Set<Integer> arraySet =new HashSet<Integer>();
		Set<Integer> treeSet =new TreeSet<Integer>();
		
		int l = array[0] + array[1] + array[2];
		for(int i = 0; i < l ;i++) {
			int k = Integer.parseInt(bi.readLine());
			arr1.add(k);
		}
		for(int p : arr1)
			{
			if(arraySet.contains(p)) {
				treeSet.add(p);
			}
			else{
				arraySet.add(p);
			}
		}
		int l1 = treeSet.size();
		System.out.println(l1);
		treeSet.stream().forEach(System.out::println);
	}
}