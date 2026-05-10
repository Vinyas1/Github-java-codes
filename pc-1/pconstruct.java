package jav1;

class nazibit{
	double height;
	double depth; 
	double width;
	
	nazibit(double w,double h,double d){
		depth=d;
		height=h;
		width=w;
	}
	
	void call() {
		double vol;
		vol=depth*height*width;
		System.out.println("the volume fo the box is "+vol);
	}
}
public class pconstruct{
	public static void main(String args[]) {
		nazibit mynazibit=new nazibit(5,3,4);
		mynazibit.call();
		
	}
}