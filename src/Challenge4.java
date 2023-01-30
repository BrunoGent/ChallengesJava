import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        boolean bError = true;
        Integer Speed = 0, Time = 0;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("What speed?(m/s)");
                Speed = input.nextInt();

                System.out.println("For how long?(s)");
                Time = input.nextInt();

                bError = false;
            }
            catch (Exception e) {
                System.out.println("must be all numbers.");
                input.reset();
                input.next();
            }
        }
        while (bError);
        System.out.println("Distance travelled is " + Speed*Time + " m");
    }
}
