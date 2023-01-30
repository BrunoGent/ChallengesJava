import java.util.Scanner;

public class Challenge2v3 {
    public static void main(String[] args) {
        //define a flag boolean to exit the while loop
        boolean flag = true;
        //define string and assign "" value (returns error otherwise???)
        String yourName = "";
        //Starting the scanner
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name");
//------------------------------------------------------
        //starts loop to check for name without numerical characters
        while (flag) {
            //enter string anc convert to array for iteration
            yourName = input.next();
            char[] yourNameArray = yourName.toCharArray();
            //Check for digits in array
            for (int i = 0; i < yourName.length(); i++) {
                //What to do in case the string has a digit
                if (Character.isDigit(yourNameArray[i])) {
                    System.out.println("name is not correct, insert only letters");
                    flag = true;
                    break;
                }
            //if no digits in name...changes the flag to false to exit while loop
            flag = false;
            }
        //"break" for loop jumps here (meaning that the string has a digit on it)
        }
        // closing the scanner object
        input.close();
        // print name
        System.out.println("Hi " + yourName);
    }
}