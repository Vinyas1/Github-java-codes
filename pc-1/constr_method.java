package jav1;

class cuboid{
	double height;
	double width;
	double length;
	
	cuboid (){
		height=50;
		length=70;
		width=90;
		
	}

	void call () {
		double vol= height*width*length;
		System.out.println("the volume of the cuboid is "+vol);
	}
}

class constr_method{
	public static void main(String args[]) {
		cuboid mycuboid =new cuboid();
		mycuboid.call();
	}
}
