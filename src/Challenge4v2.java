import java.util.Scanner;

public class Challenge4v2 {
    public static void main(String[] args) {
        boolean bError = true;
        Double Distance = 0.0, Time = 0.0;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("distance that needs to be travelled?(m)");
                Distance = input.nextDouble();

                System.out.println("time it takes?(s)");
                Time = input.nextDouble();

                bError = false;
            }
            catch (Exception e) {
                System.out.println("must be all numbers.");
                input.reset();
                input.next();
            }
        }
        while (bError);
        System.out.println("To travel " + Distance + " meters in " + Time + " seconds, you need to move at: " + Distance/Time + "m/s.");
    }
}
