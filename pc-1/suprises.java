package jav1;
 
class nazi{
	double length;
	double bredth;
	
	nazi(){
		length=10;
		bredth=20;
		
	}
}

class suprises{
	public static void main(String args[]) {
		nazi mynazi=new nazi();
		double area;
		area=mynazi.bredth*mynazi.length;
		System.out.println("the area of the given square is "+area);
		
	}
}