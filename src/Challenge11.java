/**Write a program that will give the answer to logic gates -

OR
 Enter 1st input 1
 Enter 2nd input 0
 Result = 1

 OR, AND, XOR, NAND, NOR
**/

import java.util.Scanner;
public class Challenge11 {
    public static void main(String[] args) {
        int Input1;
        int Input2;
        //calls function to SElect operation and stores it
        int VarGate;
        VarGate = Operation();

        //Scanner and ask for inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first input");
        Input1 = input.nextInt();
        System.out.println("Enter second input");
        Input2 = input.nextInt();

        //Does the operation adn prints the result
        switch (VarGate){
            /*CASE OR   */case 1: if (Input1 == 1 || Input2 == 1){System.out.println(" Result = 1");} else{System.out.println(" Result = 0");}
            /*CASE AND  */case 2: if (Input1 == 1 && Input2 == 1){System.out.println(" Result = 1");} else{System.out.println(" Result = 0");}
            /*CASE XOR  */case 3: if (Input1 == 1 ^  Input2 == 1){System.out.println(" Result = 1");} else{System.out.println(" Result = 0");}
            /*CASE NAND */case 4: if (Input1 == 1 && Input2 == 1){System.out.println(" Result = 0");} else{System.out.println(" Result = 1");}
            /*CASE NOR  */case 5: if (Input1 == 1 || Input2 == 1){System.out.println(" Result = 0");} else{System.out.println(" Result = 1");}
        }
    }








//Asks for User input and validates
    private static int Operation() {
        Scanner input = new Scanner(System.in);
        int LogicGate;
        boolean Flag = true;
        System.out.println("choose 1-OR    2-AND    3-XOR    4-NAND    5-NOR");

        do {
            LogicGate = input.nextInt();
            if ((LogicGate >= 1 && LogicGate <= 5) ) {
                Flag = false;
                break;
            }
            else{
                System.out.println("Wrong input, choose again");

            }

        } while (Flag);
        return LogicGate;
    }
}


