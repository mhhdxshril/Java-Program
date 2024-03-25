


public class Main {
    public  static void main(String[] args) {
        task2("Wanda");
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
        String k1 = ""+ alphabet.charAt((alphabet.indexOf(name.charAt(0)) + key) % 26);
        String k2 = ""+ alphabet.charAt((alphabet.indexOf(name.charAt(1)) + key) % 26);
        String k3 = ""+ alphabet.charAt((alphabet.indexOf(name.charAt(2)) + key) % 26);
        String k4 = ""+ alphabet.charAt((alphabet.indexOf(name.charAt(3)) + key) % 26);
        String k5 = ""+ alphabet.charAt((alphabet.indexOf(name.charAt(4)) + key) % 26);

        //change the first character to upper case
        String k1a = k1.toUpperCase();

        //generate the output
        String output = k1a + k2 + k3 + k4 + k5;

        //print out the output
        System.out.println(output);

        //return the output
        return output;
    }
}