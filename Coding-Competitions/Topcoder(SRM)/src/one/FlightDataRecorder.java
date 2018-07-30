package one;

import java.util.Scanner;

public class FlightDataRecorder {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int head[] = new int[n];
		int dist[] = new int[n];
		
		System.out.println("Enter heading and distance");
		for(int i=0;i<n;i++) {
			head[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			dist[i] = sc.nextInt();
		}
		double c = getDistance(head,dist);
		System.out.println(c);
		sc.close();
	}
public static double getDistance(int heading[],int distance[]) {
	double x = 0.0,y=0.0;
	int n = heading.length;
	for(int i=0;i<n;i++) 
	{
		x = x + distance[i] * java.lang.Math.cos((heading[i] * 3.14)/180);
		y = y + distance[i] * java.lang.Math.sin((heading[i] * 3.14)/180);
	}
	return java.lang.Math.hypot(x,y);
}
}