public class Main {
    public static void main(String[] args) {
        task4("Outside is warm");
    }
     public static void task4(String input) {
        String letter1 = input.substring(input.indexOf(" ") + 4, input.indexOf(" ") + 5).toUpperCase();
        String word1 = input.substring(input.indexOf(" ") + 5);
        String word2 = input.substring(0 , input.indexOf(" ")).toLowerCase();

        System.out.println(letter1 + word1 + " is " + word2);
     }
}