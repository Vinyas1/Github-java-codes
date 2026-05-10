package javex;
class collegenamethread extends Thread{
	public void run ()
	{
		while (true ) {
			System.out.println("vvce");
			try {
				Thread.sleep(10000);
			}
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
	}
}

class branchnamethread extends Thread{
	public void run() {
		while (true ){
			System.out.println("ISE");
			try {
				Thread.sleep(2000);
				
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
public class vvsui {
	public static void main (String [] args)
	{
		collegenamethread collegenamethread1 = new collegenamethread();
		branchnamethread branchnamethread1 = new branchnamethread();
		
		collegenamethread1.start();
		branchnamethread1.start();
	}

}
