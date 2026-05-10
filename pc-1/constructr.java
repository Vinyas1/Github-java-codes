package jav1;

class cube{
	int length;
	int height;
	int bredth;
	int vol;

cube(){
	length=50;
	bredth=60;
	height=70;
		
}
	
}
class constructr{
	public static void main(String args[]) {
		cube mycube=new cube();
		int vol=mycube.length*mycube.bredth*mycube.height;
		System.out.println("the volume of the cube is " +vol);
	}
}