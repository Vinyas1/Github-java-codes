package jav1;

class simpi{
	double rate;
	double time;
	double prin;
	

void call()
{

	double si=prin*rate*time;
	System.out.println("the simple intrest is "+si);
}
}

class revmeth{
	public static void main(String args[]) {
		simpi mysimpi=new simpi();
		mysimpi.prin=1200;
				mysimpi.rate=5;
				mysimpi.time=2;
				
				mysimpi.call();
		
	}
}
