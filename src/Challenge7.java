import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        //define and draw cards for 1st time
        int Suit = DrawSuit(), Card = DrawCard();
        //define matrix for cards left
        boolean[][] UsedDeck = new boolean[13][4];

        for (int i = 52; i > 0; i--) {
            System.out.println("press enter to draw a card");
            PressEnter();
            //check if card has already been drawn (false = not drawn)
            while (UsedDeck[Card][Suit]) {
                Suit = DrawSuit();
                Card = DrawCard();
            }
            UsedDeck[Card][Suit] = true;

            //print the number and suit
            switch (Card) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9:
                    System.out.print(Card + 1 + " of ");
                    break;
                case 10:
                    System.out.print("J of ");
                    break;
                case 11:
                    System.out.print("Q of ");
                    break;
                case 12:
                    System.out.print("K of ");
                    break;
                case 0:
                    System.out.print("ACE of ");
                    break;
            }
            switch (Suit) {
                case 0:
                    System.out.println("Diamond");
                    break;
                case 1:
                    System.out.println("Clubs");
                    break;
                case 2:
                    System.out.println("Hearts");
                    break;
                case 3:
                    System.out.println("Spades");
                    break;
            }
                //shows cards left
                System.out.println(i - 1 + " Cards Left");


        }
    }

    private static int DrawSuit() {
        return (int) (Math.random() * 4);
    }
    private static int DrawCard() {
        return (int) (Math.random() * 13);
    }

    private static void PressEnter() {
        Scanner Enter = new Scanner(System.in);
        Enter.nextLine();
    }
}

/*
 switch (Suit) {
 case 0:
 System.out.println(Card + 1 + " of Diamond");
 break;
 case 1:
 System.out.println(Card + 1 + " of Clubs");
 break;
 case 2:
 System.out.println(Card + 1 + " of Hearts");
 break;
 case 3:
 System.out.println(Card + 1 + " of Spades");
 break;
 }
 */