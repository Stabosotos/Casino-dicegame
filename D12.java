import java.util.Scanner;

public class D12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;
        String choice;
        // Επαναληψη ολης της διαδικασιας
        do {
            // Αρχικο μηνυμα και μενου
            System.out.println("Welcome to Las Vegas Casino!");
            System.out.println("____________________________");
            System.out.println("Balance: $" + balance);
            System.out.println("*** Main Menu ***");

            System.out.println("Press:\n" +
                    "d) to record a deposit\n" +
                    "\n" +
                    "w) to record a withdrawal\n" +
                    "\n" +
                    "g) to start a dice game\n" +
                    "\n" +
                    "x): to exit the casino peacefully");
            // Input επιλογης
            String choice2 = input.next();
            choice = choice2;
            System.out.println("Your selection: " + choice);
            // Ελεγχος επιλογης και εκπληρωση διαδικασιας
            switch (choice) {

                case "d":
                    System.out.print("Please enter the amount to deposit: $");
                    int amount = input.nextInt();
                    balance = balance + amount;
                    System.out.println("You deposited $" + amount + " and your new balance is $" + balance + ".");
                    break;
                case "w":
                    System.out.print("Enter amount to withdraw: $");
                    int withdraw = input.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Your balance is not enough.");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("You withdrew $" + withdraw + "Your new balance is: $" + balance);
                    }
                    break;
                case "g":
                    D12_part_Dice game = new D12_part_Dice();
                    game.diceGame(balance);
                    break;
            }
        } while (choice.equals("d") || choice.equals("w") || choice.equals("b"));


    }
}
