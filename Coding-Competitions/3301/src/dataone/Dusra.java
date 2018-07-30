package dataone;

public class Dusra {
	public static void main(String[] args) {
		String s="The Quick brown fox jumps over the lazy dog";
		String a[] = s.split(" ");
		for(int j=0;j<a.length;j++)
		{	
			int k=a[j].length();
			for(int c=k-1;c>=0;c--)
				{
					System.out.print(a[j].charAt(c));						
				}
				System.out.print(" ");
		}
	}  
}
