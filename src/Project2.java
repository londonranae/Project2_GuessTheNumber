import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class Project2 {
    public static void main(String[] args) {
        int rand = ThreadLocalRandom.current().nextInt(1, 20);
        int guessCount = 6;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please pick a number between 1 and 20.");
        while (guessCount > 0) {
            String guesses = scan1.nextLine();
            guessCount--;
            if (guessCount == 0) {
                System.out.println("Looks like you ran out of guesses. Would you like to play again? y/n");
                String answer2 = scan1.nextLine();
                if (Objects.equals(answer2, "y")) {
                    guessCount = 6;
                } if (Objects.equals(answer2, "n")) {
                    break;
                }
            }
            if (Integer.parseInt(guesses) > rand) {
                System.out.println("You're too high! Guess again! Guesses left: " + guessCount);
            }
            if (Integer.parseInt(guesses) < rand) {
                System.out.println("You're too low! Guess again! Guesses left: " + guessCount);
            }
            if (Objects.equals(guesses, String.valueOf(rand))) {
                System.out.println("You won!");
                System.out.println("Would you like to play again? y/n");
                String answer = scan1.nextLine();
                if (Objects.equals(answer, "y")) {
                    guessCount = 6;
                    System.out.println("Pick a number between 1 and 20.");
                }
                if (Objects.equals(answer, "n")) {
                    break;
                }
            }

        }
        System.out.println("Thanks for playing.");
            }

            }


