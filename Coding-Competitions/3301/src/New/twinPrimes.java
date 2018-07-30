package New;
public class twinPrimes {
	public static void main(String[] args) throws Exception{
		long start1 = 3l ;
		long end = 1000000l;
		try {
			threadka l5 = new threadka(start1,end);
			l5.t.start();
		}
		catch(Exception e) {
			System.out.println("Idhar");
		}
		start1 = 1000001l;
		end   =  10000000l;
		try{
			threadka l1 = new threadka(start1,end);
			l1.t.start();
		}
		catch(Exception e) {
			System.out.println("Udhar");
		}
		start1 = 10000001l;
		end   = 100000000l;
		try{
			threadka l2 = new threadka(start1,end);
			l2.t.start();
		}
		catch(Exception e) {
			System.out.println("kidhar");
		}
		start1 = 100000001l;
		end   =  1000000000l;
		try{
		threadka l3 = new threadka(start1,end);
		l3.t.start();
		}
		catch(Exception e) {
			System.out.println("Jidhar");
		}
		start1 = 1000000001l;
		end   =  10000000000l;
		try{
			threadka l4 = new threadka(start1,end);
			l4.t.start();
		}catch(Exception e) {
			System.out.println("kahi nhi");
		}
		start1 = 10000000001l;
		end   =  100000000000l;
		try{
			threadka l5 = new threadka(start1,end);
			l5.t.start();
		}catch(Exception e) {
			System.out.println("nya thread");
		}
		start1 = 100000000001l;
		end   =  1000000000000l;
		try{
			threadka l6 = new threadka(start1,end);
			l6.t.start();
		}catch(Exception e) {
			System.out.println("akhri thread");
		}
		
		
	}
}