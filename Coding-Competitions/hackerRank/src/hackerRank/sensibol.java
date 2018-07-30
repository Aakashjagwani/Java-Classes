package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class sensibol {

	public static void main(String[] args) throws IOException {
	     BufferedReader sc =new BufferedReader(new InputStreamReader(System.in)); 
         int t =Integer.parseInt(sc.readLine());
         String input[] = new String[t];
         for(int i = 0;i<t;i++){
            input[i] = sc.readLine();
         }
         for(int k = 0;k<t;k++){
        	 Hashtable<Character,Integer> table = new Hashtable<Character,Integer>();
        	 char fre[] = input[k].toCharArray();
             for(char c : fre ) {
        	     if( table.get(c) == null )
        	         table.put(c,1);
        	     else
        	         table.put(c,table.get(c) + 1);
        	 }
             if(table.size() == 2) {
        		 System.out.println("YES");
        	 }
        	 else {
        		 System.out.println("NO");
        	 }
        }
         sc.close();
	}
}
