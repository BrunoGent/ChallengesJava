import java.util.Scanner;

public class Challenge2v2 {
    public static void main(String[] args){
        System.out.println("What's your name");
        //Starting the scanner
        Scanner input = new Scanner(System.in);

        //define variable and first request to input name
        String yourName = input.nextLine();
        //check for empty string and ask again
        while (yourName.equals("")){
            System.out.println("What's your name again");
            yourName = input.nextLine();
        }

        // closing the scanner object
        input.close();

        System.out.println("Hi " + yourName);

    }
}