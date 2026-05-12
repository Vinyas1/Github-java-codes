package javex;

  public class Main {

	  static class Node {
		  int data;
		  Node next;
		public Node(int data) {
			this.data= data;
			
		}
	  }
	  
	  static class Singlyll {
		  Node head;
		  
		  public Singlyll() {
			  head = null;
		  }
	  public void insertbegin(int data) {
		  Node n1 = new Node(data);
		  n1.next= head;
		  head = n1;
		  
	  }
	  
	  public void insertend (int data) {
		  Node n1 = new Node(data);
		  if(head == null) {
			  head = n1;
			  return; 
		  }
		  Node current = head;
		  while(current.next != null) {
			  current = current.next;
		  }
		  current.next = n1;
	  }
	  
	  
	  public void display() {
	  Node current = head;
	  
		  if(head == null) {
			  System.out.print("no nodes to display");
			  return;
		  }
		  while(current != null) {

		  System.out.print(current.data + "->");
		  current = current.next;
	  }
	  System.out.print("null");
	  
	  }
	  
	  
	  
	  }	  
	  
	public static void main(String[] args) {
	  Singlyll s1 = new Singlyll(); 
	  s1.insertbegin(0);
	  s1.insertend(10);
	  s1.insertend(20);

	  s1.insertend(30);

	  s1.insertend(40);

	  s1.display();
	  
	}

}
