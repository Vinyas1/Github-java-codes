package javex;
	class Book {
		private String author ;
		private String name;
		private double price;
		private int numofpages;
		
		public String getname()
		{
			return name;
		}
		public void setname(String name)
		{
			this.name=name;
		}
		 public double getprice ()
		 {
			 return price;
		 }
		 public void setprice(double price)
		 {
			 this.price=price;
		 }
		 public int getnumofpages()
		 {
			 return numofpages;
		 }
		public void setnumofpages (int numofpages)
		{
			this.numofpages=numofpages;
		}
		
	
		public String getauthor()
		{
			return author;
		}
		public void setauthor(String author)
		{
			this.author=author;
		}
		
		public String toString()
		{
			return "book details \n" +
					"name" +name +"\t"+
					"author" +author +"\t"+
					"price" +price +"\t"+ 
					"numofpages" +numofpages ;
		 }
		
	}
	
	public class getsettos {
		public static void  main (String [] args)
		{
			int n=2;
			
			Book[] books =new Book[n];
			
			books[0]= new Book();
			books[0].setname("george in hills ");
			books[0].setauthor("george");
			books[0].setprice(69.00);
			books[0].setnumofpages(120);
			books[1]=new Book();
			books[1].setname("george in river ");
			books[1].setauthor("lila");
			books[1].setprice(50.00);
			books[1].setnumofpages(100);
			
			System.out.println("the details of books using getter method ");
			for (int i=0;i<n;i++)
			{System.out.println("book"+ (i+1));
				System.out.println(books[i].getname());
				System.out.println(books[i].getauthor());
				System.out.println(books[i].getnumofpages());
				System.out.println(books[i].getprice());
			}
			
		System.out.println("details of books using tostring are ");
		for (int i=0;i<n;i++)
		{
			System.out.println(books[i].toString());
		}
		
		
		
		
		}
		
		
		
	
	}
