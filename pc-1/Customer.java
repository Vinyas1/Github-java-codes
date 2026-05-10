package jav1;

class Customer {
    int custID;
    String name;
    int age;
    String place;
    String phone;

    //Parametrized Constructor
    public Customer(int custID, String name, int age, String place, String phone) {
        this.custID = custID;
        this.name = name;
        this.age = age;
        this.place = place;
        this.phone = phone;
    }

    // Method to print customer details
     void call() {
        System.out.println("Customer ID: " + this.custID);
        System.out.println("Customer Name: " + this.name);
        System.out.println("Customer Age: " + this.age);
        System.out.println("Customer Place: " + this.place);
        System.out.println("Customer Phone: " + this.phone);
        System.out.println();  
    }

    public static void main(String[] args) {
        int n = 2;  
       

        
        Customer[] arr = new Customer[n];

        // Initialize customer objects
        arr[0] = new Customer(1284, "Sharon", 20, "Mysore", "9000000001");
        arr[1] = new Customer(1334, "Lily", 20, "Mandya", "901595428");

        // Print customer details
        System.out.println("Printing Customer Details:");
        for (int i = 0; i < arr.length; i++) {
        	arr[i].call();
        }
    }
}