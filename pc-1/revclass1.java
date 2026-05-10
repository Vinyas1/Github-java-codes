package jav1;

class Discount {
    double amt;
    double dis;
    double qty;
}

class revclass1 {
    public static void main(String[] args) {
        Discount myDiscount1 = new Discount();
        Discount myDiscount2 = new Discount();
        double total1;
        double total2;
        double netamt1;
        double netamt2;
    
        myDiscount1.amt = 100;
        myDiscount1.dis = 5; 
        myDiscount1.qty = 2;

        myDiscount2.amt = 200;
        myDiscount2.dis = 8; 
        myDiscount2.qty = 3;

       
         total1 = myDiscount1.amt * myDiscount1.qty;
         total2 = myDiscount2.amt * myDiscount2.qty;
         netamt1 = total1 - (myDiscount1.dis / 100 * total1);
         netamt2 = total2 - (myDiscount2.dis / 100 * total2);

        // Output results
        System.out.println("The amount after discount for first item is: " + netamt1);
        System.out.println("The amount after discount for second item is: " + netamt2);
    }
}
