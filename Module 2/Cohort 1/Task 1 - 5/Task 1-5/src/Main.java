/**
 * ES234211 - Basic Programming
 * Computing Lab. Work
 * Coursework No.   : 02
 * Student ID       : .......................
 * Student Name     : .......................
 * Class            : ...
 * Cohort           : ...
 */

public class Main {

    public static void main(String[] args) {
        // Do not change

        task1("Rahman Arif/17-02-2003/Jakarta/M/A/WNI/Single");
        //task1("Alice Rebecca/17-03-1984/London/F/O/WNA/Married");
        //task2("Wanda");
        //task3();
        //task4("Outside is warm");
    }

    public static String task1(String data){
        // Your code here
        // ...

        int startPosition = 0;
        //find the first slash position within string stored in variable named data
        int slashPosition = data.indexOf("/");
        //chop the string from the beginning to the first slash position (/ is excluded)
        String name = data.substring(startPosition, slashPosition);
        //split and reverse the name to correct firstname and lastname order
        String firstName = name.substring(name.indexOf(" ")+1, slashPosition);
        String lastName = name.substring(0, name.indexOf(" ");
        //get the first character of first and last name
        String initial = ""+ firstName.charAt(0) + lastName.charAt(0);

        //chop the string stored in variable named data from the first slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the date of birth dd-mm-yyyy
        String birthDate = data.indexOf(startPosition, slashPosition);
        //chop the year of birth yyyy
        String birthYear = birthDate.substring(6, 10);
        //count the age
        int age = 2024 - (Integer.parseInt(birthYear));

        //chop the string stored in variable named data from the second slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/")
        //chop the palce of birth
        String birthPlace =data.substring(startPosition, slashPosition);

        //chop the string stored in variable named data from the third slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.index("/")
        //chop the sex data M or F
        String sex = data.substring(startPosition, slashPosition);
        //change M to Male and F to Female
        sex= sex.replace("M", "Male");
        sex= sex.replace("F", "Female");

        //chop the string stored in variable named data from the fourth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the blood type data
        String bloodType = data.substring(startPosition, slashPosition);

        //chop the string stored in variable named data from the fifth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the citizenship data
        String citizen = data.substring(startPosition, slashPosition);
        //check whether local citizen
        boolean isLocalCitizenB = citizen.equals("WNI");
        //change true or false to Yes or No
        String isLocalCitizen =""+ isLocalCitizen;
        isLocalCitizen = isLocalCitizen.replace("true", "Yes");
        isLocalCitizen = isLocalCitizen.replace("false", "No");

        //chop the string stored in variable named data from the sixth slash (excluded) to the end
        data = data.substring(startPosiion, slashPosition);
        //chop the marital status data
        String maritalStatus = data;

        //generating the output
        String line1 = "Full Name: " + firstName + " " + lastName + " (" + initial + ")";
        String line2 = "Age: " + age;
        String line3 = "City of Birth: " + ___;
        String line4 = "Sex: " +___;
        String line5 = "Blood Type: " + ___;
        String line6 = "Local Citizen: " + isLocalCitizen;
        ____

        //store the output to variable named output
        String output = line1 + "\n" + line2 + "\n" + line3+ "\n" + line4 + "\n" + line5 + "\n" + line6 ;

        //print out the output
        System.out.println(output);

        return output;
    }

    public static String task2(String name){
        // Your code here
        // ...

        //store all alphabet to single string
        //each alphabet with its index: a -> 0, b->1. ... z ->25
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        //change the input to lowercase, since tha alphabets are all in lowercase
        name = name.toLowerCase();

        //set the key

        int key = 5;

        //shift each character to 5 places right, if more than 25 then it back to 0
        String k1 = ""+alphabet.charAt((___) + key) ___ ___);
        String k2 = ""+(alphabet.indexOf(name.chartAt(1) + key) % 26;
        String k3 = ""+
                String k4 =
                String k5 =

                //change the first character to upper case
                ___

        //generate the output
        String output = ____

        //print out the output
        ___

        //return the output
        return output;
    }

    public static void task3(){

        //declare and initialize the variables

        int priceOfCoffee = 15000;
        ___ priceOfTea = ___;
        ___ priceOfPizza = ___;
        ___ currency = ___;
        int ___ = 3;
        int numOfTea = ___;
        ___ numOfPizza = ___
        ___ nameOfCustomer = ___

        double discountOfCoffee = ___;
        ___ discountOfTea = 0.15;
        ___ discountOfPizza = ___
        double ___ = ___;
        double cashInHand = ___

        // count number of items
        int numOfItems = ___;

        // count the total price
        ___ totalPrice = ___;
        // count the total price after tax
        double totalPriceAfterTax = ___;
        // print total price
        SYstem.out.println("Total Price: "+ ___ + totalPrice);

        // count the change
        double change = ___
        //printing the change
        System.Out.println("Change: "___);

        // count amount of donation
        ___ donation = ___;
        System.out.Println("Donation: "+ ___);


        // print the receipt
        System.out.println("-----------------------------------\n");
        System.out.println("Name Of Customer: "+___);
        System.out.println("___");
        System.out.println(___ + ___);
        System.out.printlN("___ \t|\t" + numOfTea + "\t|\t"  + ___);
        System.out.println("___\t|\t" + numOfCoffee + "\t|\t"  + ___);
        System.out.println("Pizza\t|\t" + numOfPizza + "\t|\t"  + ___);
        System.out.println("Total Before Tax: "+ ___
                System.out.println("Tax: " + ___ + ___);
        System.out.println("___ "+ ___);
        System.out.println("Amount Paid: "+ ___;
        System.out.println("Change: " + ___
                ___
                ___
    }

    public static void task4(String input){
        // Your code goes here
        String word1 = input.split(" ");
        

        System.out.println();
    }
}

