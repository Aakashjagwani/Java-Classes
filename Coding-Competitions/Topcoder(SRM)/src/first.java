import java.util.*;

public class first {

	    public static void main(String[] args) {
	
	    	Scanner sc=new Scanner(System.in);
	    	String str = sc.nextLine();
	        StringTokenizer s=new StringTokenizer(str, " ");
	        
	        int N = Integer.parseInt(s.nextToken());
	        int Q = Integer.parseInt(s.nextToken());
	        int lastAnswer = 0;

	        int a[][] = new int[Q][];
	        int i;
	        for(i=0;i<Q;i++)
	        {
	        	for(int j=0;j<3;j++)
	        	{
	        		a[i][j] = sc.nextInt();        
	        	}
	        }
        	System.out.println(a);

	        List seqList = new ArrayList<>();
	        
	        sc.close();
	        
	    }
	}
