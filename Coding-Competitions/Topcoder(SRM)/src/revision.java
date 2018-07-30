import java.util.Scanner;

public class revision {

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	
//    	System.out.print(t);
    	
    	
    	for(int i=0;i<t;i++)
    	{
    		String str = sc.next();
    		char c[] = str.toCharArray();
    		for(int j=0;j<c.length;j= j+2) {
    			System.out.print(c[j]);
    		}
    		System.out.print(" ");  		
    		for(int j=1;j<c.length;j= j+2) {
    			System.out.print(c[j]);
    		}	
    		System.out.println("");  		
	
    	}
    	sc.close();	
    }
}
