package jav1;

class box1{
	int width;
	int depth;
	int height;

void call() {
	int volume=width*height*depth;
	System.out.println("the volume of box is "+volume);
	
}
}

class methobject{
	public static void main(String args[]) {
		box1 notmybox=new box1();
		notmybox.width=10;
		notmybox.depth=20;
		notmybox.height=30;
	
		notmybox.call();
		}
}

