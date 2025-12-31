import java.util.*;

public class NumberGenerater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;
        while (playAgain) {
            int secretNumber = rand.nextInt(100) + 1;
            boolean guessed = false;
            System.out.println();
            System.out.println("==================================");
            System.out.println("     🎯 NUMBER GUESSING GAME");
            System.out.println("==================================");
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("Try to guess it!");
            System.out.println();
            while (!guessed) {
                try {
                    System.out.print("Enter your guess: ");
                    int n = sc.nextInt();
                    if (n < 1 || n > 100) {
                        System.out.println("❌ Please enter a number between 1 and 100.");
                    } else if (n > secretNumber) {
                        System.out.println("⬆ Too High! Try again.");
                    } else if (n < secretNumber) {
                        System.out.println("⬇ Too Low! Try again.");
                    } else {
                        System.out.println("🎉 Yoo Congrats 😎 You guessed it right!");
                        guessed = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid input! Enter numbers only.");
                    sc.next(); 
                }
            }
            System.out.print("\nDo you want to play again? (yes / no): ");
            sc.nextLine(); 
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("\nThanks for playing! 👋");
            }
        }
        sc.close();
    }
}
