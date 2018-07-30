package hackerRank;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner sc =new Scanner(System.in); 
        int n = sc.nextInt();
        for(int i =0;i<n;i++){    //5
            int k  ;          //1 
            for(k = i+1 ;k > 0;k--){ 
               System.out.print(k+" ");
            }
            for(k=2;k<=(n-i);k++ ){
                System.out.print(k + " ");
            }
            System.out.println(" ");
        }
    }
}