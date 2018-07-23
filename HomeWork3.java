import java.util.Random;
import java.util.Scanner;
/**
 * author Denisov Maxim
 * date 17/07/2018
 */
public class HomeWorkThird {

    public static Scanner scanner;
    public static Random random;

    public static void main (String [] args) {
        scanner = new Scanner(System.in);
        random = new Random();
		System.out.println("Game: guess the number.");
        int attempt = 0;
        int answerUser;
        int computerNumber;
        computerNumber = rand.nextInt(10);
        System.out.println("I made a number from 0 to 9. Try to guess it. You got three.");
        while (attempt < 3) {
            attempt++;
            System.out.print("Enter your number: ");
            answerUser = scanner.nextInt();
            if (answerUser == computerNumber) {
                System.out.println("Greetings! Good job! Want to try? 1-Yes, 0 - no");
                answerUser = scanner.nextInt();
                if (answerUser == 1) {
                    firstGame();
                } else {
                    return;
                }
            } else if (answerUser < computerNumber) {
                System.out.println("your number is less than mine. Try again, and you will succeed. Just don't forget " +
                        "you have left " + (3- attempt) + " attempts.");
            } else  {
                System.out.println("your number is greater than mine. Try again, and you will succeed. Just don't forget" +
                        "you have left " + (3 - attempt) + " attempts.");
            }
            if (attempt == 3) {
                System.out.println("Unfortunately, you're out of attempts. Don't be upset. Want to try? 1-Yes, 0-no. I was thinking of - "
                + computerNumber);
                answerUser = scanner.nextInt();
                if (answerUser == 1) {
                    firstGame();
                } else {
                    System.out.println("I enjoyed playing with you! Come back!");
                    return;
                }
            }
        }
    }

}
