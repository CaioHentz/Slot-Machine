import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        String[] symbols = {"🍒", "🍋", "🍉", "💎", "7", "❤️"};
        Random random = new Random();

        System.out.println("\nWelcome to the Slot Machine... Good luck!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (choice.equals("y") || choice.equals("Y")) {

            System.out.println("\nSpinning...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int i1 = random.nextInt(symbols.length);
            int i2 = random.nextInt(symbols.length);
            int i3 = random.nextInt(symbols.length);

            System.out.println("\n| " +symbols[i1] +" | "+ symbols[i2]+ " | "+ symbols[i3] + " | \n");

            if (i1 == i2 && i2 == i3){
                System.out.println("JACKPOT! All matches!");
            } else if (i1 == i2 || i2 == i3 || i1 == i3) {
                System.out.println("Nice! Two matches");
            } else {
                System.out.println("No matches...");
            }

            System.out.println("\n\nRoll again? (y/n)");
            choice = scanner.nextLine();
        }
    }
}