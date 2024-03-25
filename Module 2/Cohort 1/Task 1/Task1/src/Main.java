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
        String lastName = name.substring(name.indexOf(""));
        //get the first character of first and last name
        String initial = "" + firstName.charAt(0) + lastName.charAt(0);

        //chop the string stored in variable named data from the first slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the date of birth dd-mm-yyyy
        String birthDate = data.substring(startPosition, slashPosition);
        //chop the year of birth yyyy
        String birthYear = birthDate.substring(6, 10);
        //count the age
        int age = 2024 - (Integer.parseInt(birthYear));

        //chop the string stored in variable named data from the second slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the palce of birth
        String birthPlace =data.substring(startPosition, slashPosition);

        //chop the string stored in variable named data from the third slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //find the position of the next slash
        slashPosition = data.indexOf("/");
        //chop the sex data M or F
        String sex = data.substring(startPosition, slashPosition);
        //change M to Male and F to Female
        sex = sex.replace("M", "Male");
        sex = sex.replace("F", "Female");

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
        String isLocalCitizen =" "+ isLocalCitizenB;
        isLocalCitizen = isLocalCitizen.replace("true", "Yes");
        isLocalCitizen = isLocalCitizen.replace("false", "No");

        //chop the string stored in variable named data from the sixth slash (excluded) to the end
        data = data.substring(slashPosition+1);
        //chop the marital status data
        String maritalStatus = data;

        //generating the output
        String line1 = "Full Name: " + firstName + " " + lastName + " (" + initial + ")";
        String line2 = "Age: " + age;
        String line3 = "City of Birth: " + birthPlace;
        String line4 = "Sex: " + sex;
        String line5 = "Blood Type: " + bloodType;
        String line6 = "Local Citizen: " + isLocalCitizen;
        String line7 = "Marital Status: " + maritalStatus;

        //store the output to variable named output
        String output = line1 + "\n" + line2 + "\n" + line3+ "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n" + line7 ;

        //print out the output
        System.out.println(output);

        return output;
    }
}