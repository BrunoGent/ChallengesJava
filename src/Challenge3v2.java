import java.util.Scanner;

public class Challenge3v2 {
    public static void main(String[] args) {
        boolean bError = true;
        Double Length = 0.0, Height = 0.0, Width = 0.0;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("Insert Length");
                Length = input.nextDouble();

                System.out.println("Insert Height");
                Height = input.nextDouble();

                System.out.println("insert Width");
                Width = input.nextDouble();

                bError = false;
            }
            catch (Exception e) {
                System.out.println("must be all numbers.");
                input.reset();
                input.next();
            }
        }
        while (bError);

        System. out.println("Length is: " + Length);
        System. out.println("Height is: " + Height);
        System. out.println("Width is: " + Width);
        System.out.println("Area of Square is: " + Length*Height*Width);
    }
}
