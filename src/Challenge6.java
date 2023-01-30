import java.util.Scanner;
import static java.lang.System.currentTimeMillis;

public class Challenge6 {
    public static void main(String[] args) {
        System.out.println("Press enter to Start");
        PressEnter();
        long Now=currentTimeMillis();
        System.out.println("Press enter when 10 seconds elapses");
        PressEnter();

        //capture time difference and convert to Double
        Long Difference = currentTimeMillis() - Now;
        String s = Difference + "";
        Double DifferenceDouble = Double.parseDouble(s);
        //print
        System.out.println("you're out by " + ((DifferenceDouble - 10000)/1000) + " seconds");

    }


    //PressEnter Method
    private static void PressEnter() {
        Scanner Enter = new Scanner(System.in);
        Enter.nextLine();

    }
}
