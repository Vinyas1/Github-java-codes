package javex;


interface Shape {
	void printArea();
	}


class rectangle implements Shape {
	private double length;
	private double bredth;
	
	public  rectangle (double length ,double bredth)
	{
		this.length=length;
		this.bredth=bredth;
		
	}
	public void printArea ()
	{
		double area;
		area=length*bredth;
		System.out.println("the area of Rectangle is " +area);
	}
}

class triangle implements Shape {
	private double base;
	private double height;


public  triangle (double height ,double base)
{
	this.height=height;
	this.base=base;
}
	

public void printArea ()
{
	double area;
	area=height*base;
	System.out.println("the area of Triangle is " +area);
}
}

class circle implements Shape{
private	double radius;

public  circle (double radius )
{
	this.radius=radius;
}
public void printArea(){
 double area= Math.PI *radius *radius;

 System.out.println("the area of Circle is " +area);
}
}


public class inter {
    public static void main(String[] args) {
        // Create instances of the shapes
        rectangle Rectanglecoc = new rectangle(5, 10);
        triangle Trianglecoc = new triangle(2, 8);
        circle Circlecoc = new circle(5);

        // Call the printArea method for each shape
        Rectanglecoc.printArea();
        Trianglecoc.printArea();
        Circlecoc.printArea();
    }
}