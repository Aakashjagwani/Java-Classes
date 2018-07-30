package dataone;
public class Aakash {

	public static void main(String[] args) {

		int a[]={0,8,4,12,2,12,4,9,1,3,5,13,3};
		int b[] = new int[10];
		
		int sum= 0,divide=0,vc=0;
		for(int i =0;i<a.length;i++)
		{
			sum += a[i];
		}
		System.out.println(sum);
		divide = sum/2;
		 int j;
		for(j=0;j<a.length;j++)
		{
			vc += a[j];
			b[j] = a[j];
			System.out.println(b[j]);
			if(vc==divide){
				break;	
			}	
		}
		for(int i =j+1;i<a.length;i++){
			System.out.println(" "+a[i]);
		}
	}
}
