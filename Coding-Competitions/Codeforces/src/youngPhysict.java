import java.io.IOException;
import java.util.Scanner;

public class youngPhysict {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int x =0,y =0, z = 0;
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test --> 0) {
			x += sc.nextInt();
			y += sc.nextInt();
			z += sc.nextInt();
		}
		
		if(x == 0 && y == 0 && z == 0) 
			System.out.println("YES");	
		else
			System.out.println("NO");
		sc.close();
	}

}
