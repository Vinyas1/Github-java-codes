package jav1;

class si{
	double time;
	double rate;
	double pr;

	si(){
		pr=1000;
		rate=2;
		time=3;
		
	}
	void call() {
		double si;
		si=(pr*rate*time)/100;
		System.out.println("the simple intrest is"+si);
	}
}

class sirev{
	public static void main(String args[]) {
		si mysi=new si();
		
		mysi.call();
	}
}