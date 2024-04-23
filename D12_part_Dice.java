import java.util.Random;
import java.util.Scanner;

public class D12_part_Dice {

    public void diceGame (int balance) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();



        System.out.println("Welcome to the totally legal Dice Game!");
        System.out.println("_______________________________________");


        while (balance > 1) {

            System.out.print("Please enter your bet (Balance: $" + balance + "): $");
            int bet = input.nextInt();

            if (bet > balance) {
                System.out.println("*** ERROR, your balance is not enough!");
            } else {
                // roll dice
                int dice1 = random.nextInt(6) +1;
                int dice2 = random.nextInt(6) +1;

                System.out.println("You rolled the dice and you scored: " + dice1 + " and " + dice2);
                if ((dice1 + dice2) > 7) {
                   System.out.println("Total is " + (dice1 + dice2) + " ** Congratulations, you win $" + bet + "!");
                   balance = balance + bet;
                } else if (dice1 + dice2 < 7) {
                   System.out.println("Total is " + (dice1 + dice2) + " ** Sorry, better luck next time.");
                   balance = balance - bet;
                } else {
                   System.out.println("Total is " + (dice1 + dice2) + "** You get your $" + bet + " bet back!");
                }
            }
            System.out.print("Roll again? (y/n) ");
            String choice = input.next();
        }
        // Τσεκαρισμα το balance
        if (balance < 1) {
            System.out.println("*** ERROR, not enough balance to start the game!");
        }

    }


}
