
import java.util.Scanner;

public class Watermelon {
	
	public static void main(String[] args) {
		
	
	Scanner sc =new Scanner(System.in);
	int s = sc.nextInt();
		
	
	if(s%2==0 && s>2) 
		System.out.println("Yes");
	else
		System.out.println("No");
	
	sc.close();
	
	}	
}
