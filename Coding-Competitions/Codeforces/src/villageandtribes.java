import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class villageandtribes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(bi.readLine());
		String temp[] = new String[test];
		for(int i = 0;i<test;i++) {
			temp[i] = bi.readLine();
		}
		for(int i = 0;i<test;i++) {
			int countA = 0,countB=0;
			char c[] = temp[i].toCharArray();
			for(int j = 0 ; j<temp[i].length(); j++) {
				if(c[j] == 'A') {
					for(int k = j+1 ; k<temp[i].length();k++ ) {
						if(c[k] == 'A') {
							countA = k-j+1;
						}
						else{
							countA = 1 ;
						}
					}
				}
				else if(c[j] == 'B') {
					for(int k = j+1 ; k<temp[i].length();k++ ) {
						if(c[k] == 'B') {
							countB = k-j+1;
						}
						else{
							countB = 1 ;
						}
				}
			}
		}
	    System.out.println(countA + " " + countB);
	}
}
}