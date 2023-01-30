import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        System.out.println("What's your name");
        //Starting the scanner
        Scanner input = new Scanner(System.in);
        String yourName = input.next();
        // closing the scanner object
        input.close();

        System.out.println("Hi " + yourName);

    }
}