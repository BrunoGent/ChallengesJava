import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Challenge18 {
    public static void main(String[] args) throws InterruptedException {
        int oddNumber=0;
        boolean flag = true;
        /*
        drawStar(2,3);
        drawStar(2,3);
        drawStar(3,1);
        drawStar(2,3);
        drawStar(0,7);
        drawStar(2,3);
        drawStar(2,2);
        drawStar(1,4);
        */
        System.out.println("insert base size of pyramid (odd)");
        Scanner input = new Scanner(System.in);
        //loop to validate number = int and odd
        while (flag){
            if (input.hasNextInt()) {
                oddNumber = input.nextInt();
                if (oddNumber % 2 == 1) {
                    flag = false;
                } else {
                    System.out.println("number must be odd");
                }
            }
            else {
                System.out.println("enter a number");
                input.next();
            }
        }

        //Start printing the pyramid
        //This FOR loop (i) is for rows
        for (int i = 0; i < 1+((oddNumber-1)/2); i++) {
            //This FOR loop (j) is for " "
            for (int j = 0; j < ((oddNumber-1)/2)-i; j++) {System.out.print(" ");}
            //This FOR loop (k) is for "*"
            for (int k = 0; k < 1+(i*2); k++) {System.out.print("*");}
            //jump line at the end of loop
            System.out.println("");
            Thread.sleep(200);
        }
        }
    private static void drawStar(int x, int y) {
        for (int i = 0; i < x; i++){
            System.out.print(" ");
        }
        for (int i = 0; i < y; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
