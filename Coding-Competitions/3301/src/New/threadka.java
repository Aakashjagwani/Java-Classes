package New;

public class threadka implements Runnable{

	Thread t=new Thread(this);
	long chalu = 0l,band = 0l;

	public threadka(long start1,long end) {
		chalu = start1 ;
		band = end;
		t.start();
	}
	public void run(){
		try{
			for(long i = chalu;i<band;i+=2 ) {
				if(isPrime(i) == true && isPrime(i+2) == true) {
							System.out.println(i + " " + (i+2));
					}
				}
			}
		catch(Exception e){
				System.out.println("e");
		}
	}
	public static boolean isPrime(long x) {
		if(x%3==0 )
		    return false;
		for(long i = 2 ; i <= Math.sqrt(x) ; i += 2) {
			if(x % i == 0)return false;
		}
		return true;
	}
}