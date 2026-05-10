package jav1;

class box{
	double width;
	double height;
	double depth;
	double vol1;
	double vol2;
	}
class oject{ //object creation for the same class
public static void main(String args[]){	
	box mybox1=new box();
	box mybox2 =new box();
mybox1.width=20;
mybox1.height=30;
mybox1.depth=40;
mybox2.width=100;
mybox2.height=200;
mybox2.depth=300;

double vol1=mybox1.depth*mybox1.height*mybox1.width;
double vol2=mybox2.depth*mybox2.height*mybox2.width;

System.out.println("the vol of 1st box is "+vol1);
System.out.println();
System.out.println("the vol of 2nd box is" +vol2);
}
}