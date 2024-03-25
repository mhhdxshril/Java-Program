public class Main {
    public static void main(String[] args) {
        task3();
    }
    public static void task3() {
        //declare and initialize the variables

        int priceOfCoffee = 15000;
        int priceOfTea = 42500;
        int priceOfPizza = 42750;
        int currency = 200000;
        int numOfCoffee = 3;
        int numOfTea = 5;
        int numOfPizza = 1;
        String nameOfCustomer = "Albert";

        double discountOfCoffee = 0.10;
        double discountOfTea = 0.15;
        double discountOfPizza = 0.05;
        double tax = 0.11;
        double cashInHand = currency;

        // count number of items
        int numOfItems = numOfCoffee + numOfTea + numOfPizza;

        // count the total price
        double totalPrice = (priceOfCoffee * numOfCoffee) + (priceOfTea * numOfTea) + (priceOfPizza * numOfPizza);
        // count the total price after tax
        double totalPriceAfterTax = totalPrice * (1 + tax);
        // print total price
        System.out.println("Total Price: "+ totalPrice);

        // count the change
        double change = totalPriceAfterTax - cashInHand;
        //printing the change
        System.out.println("Change: " + change);

        // count amount of donation
        double donation = 417.5;
        System.out.println("Donation: "+ donation);


        // print the receipt
        System.out.println("-----------------------------------\n");
        System.out.println("Name Of Customer: "+ nameOfCustomer);
        System.out.println("ORDERS");
        System.out.println("Number of Items: " + numOfItems );
        System.out.println("Tea \t|\t" + numOfTea + "\t|\t"  + priceOfTea);
        System.out.println("Coffe\t|\t" + numOfCoffee + "\t|\t"  + priceOfCoffee);
        System.out.println("Pizza\t|\t" + numOfPizza + "\t|\t"  + priceOfPizza);
        System.out.println("Total Before Tax: "+ totalPrice);
        System.out.println("Tax: " + tax);
        System.out.println("Total After Tax: "+ totalPriceAfterTax);
        System.out.println("Amount Paid: "+ cashInHand);
        System.out.println("Change: " + change);
        System.out.println("-----------------------------------\n");
    }
}