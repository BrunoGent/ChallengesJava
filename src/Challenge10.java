import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        int MyPick;
        int BotPick;
        int Winner;
        int WinCount = 0;
        System.out.println("best out of 5");
        for (int i = 1; i < 6; i++) {
            MyPick = ChooseHand();
            BotPick = ((int) (Math.random() * 3)+1);
            Winner = WhoWin(MyPick,BotPick);

            //print PLAYER PICKS and what he picks
            System.out.print("PLAYER picks ");
            PrintPick(MyPick);

            //print BOT PICKS and what he picks
            System.out.print("BOT   picks ");
            PrintPick(BotPick);

            //Prints who won the round
            switch (Winner) {
                case 0 : System.out.println(WInEnum.TIE + " rematch"); i--; break;
                case 1 : System.out.println(WInEnum.PLAYER_WINS + " (game " + i + ")" ); WinCount++; break;
                case 2 : System.out.println(WInEnum.BOT_WINS + " (game " + i + ")" ); break;
            }
        }
    //At the end of the game, prints who won and by how much
    if (WinCount > 2){System.out.println("PLAYER WINS! - " + WinCount + " out of 5");}
    else {System.out.println("BOT WINS! - " + (5-WinCount) + " out of 5");}





    }

    private static void PrintPick(int Picks) {
        switch (Picks){ case 1 : System.out.println(Pick.ROCK); break; case 2 : System.out.println(Pick.PAPER); break; case 3: System.out.println(Pick.SCISSORS); break;}
    }

    enum Pick {
        //O es al revés??? Number is ENUM and parameter is NAME
        ROCK(1),
        PAPER(2),
        SCISSORS(3);
        public final int HandName;
        Pick (int HandName){
            this.HandName = HandName;
        }
    }
    enum WInEnum {
        //O es al revés??? Number is ENUM and parameter is NAME
        PLAYER_WINS(1),
        BOT_WINS(2),
        TIE(0);
        public final int WinDefine;
        WInEnum (int WinDefine){
            this.WinDefine = WinDefine;
        }
    }
    //Function to ask for Player hand and validate
    private static int ChooseHand() {
        Scanner input = new Scanner(System.in);
        int VarHand;
        boolean Flag = true;
        System.out.println("choose 1:rock 2:paper 3:scissors");

        do {
            VarHand = input.nextInt();
            if (VarHand == 1 || VarHand == 2 || VarHand == 3) {
                Flag = false;
                break;
            }
            else{
                System.out.println("Wrong input, choose again");

            }

        } while (Flag);
        return VarHand;
    }

    //Method to Check who won - 0 Tie, 1 Player Wins, 2 Bot Wins
    private static int WhoWin(int x, int y) {
        switch (x){
            case 1: //Player picks Rock
                switch (y) {
                    case 1: //tie
                        return 0;
                        //break;
                    case 2: //Bot wins
                        return 2;
                        //break;
                    case 3: //User wins
                        return 1;
                        //break;
                }
            case 2: //Player picks Paper
                switch (y) {
                    case 1: //User wins
                        return 1;
                        //break;
                    case 2: //tie
                        return 0;
                        //break;

                    case 3: //Bot wins
                        return 2;
                        //break;
                }
            case 3: //Player picks Paper
                switch (y) {
                    case 1: //Bot wins
                        return 2;
                        //break;
                    case 2: //User wins
                        return 1;
                        //break;
                    case 3: //tie
                        return 0;
                        //break;
                }
            default: return 0;
        }
    }
}
