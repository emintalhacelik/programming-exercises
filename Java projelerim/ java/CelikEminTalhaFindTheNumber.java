/***********************************************************************
@Title:    CelikEminTalhaFindTheNumber
@Purpose:  To get familiar with loops and conditional statements
@Author:   Celik Emin Talha
@Date:     28.11.2024
@Version:  1.0
************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class CelikEminTalhaFindTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String secretCode = generateSecretCode(random);

        for (int attempts = 1; attempts <= 10; attempts++) {
            System.out.print("Enter your guess (4 digits): ");
            String guess = scanner.nextLine();

            if (guess.length() != 4) {
                System.out.println("Please enter a valid 4-digit number.");
                attempts--;
                continue;
            }

            String feedback = getFeedback(secretCode, guess);
            System.out.println("Feedback: " + feedback);

            if (feedback.equals("++++")) {
                System.out.println("Congratulations! You found the code in " + attempts + " attempts.");
                return;
            }
        }

        System.out.println("Game Over! The correct code was: " + secretCode);
        scanner.close();
    }

    private static String generateSecretCode(Random random) {
        String code = "";
        while (code.length() < 4) {
            int digit = random.nextInt(6) + 1;
            if (!code.contains(String.valueOf(digit))) {
                code += digit;
            }
        }
        return code;
    }

    private static String getFeedback(String secretCode, String guess) {
        String feedback = "";
        for (int i = 0; i < 4; i++) {
            if (guess.charAt(i) == secretCode.charAt(i)) {
                feedback += "+";
            } else if (secretCode.contains(String.valueOf(guess.charAt(i)))) {
                feedback += "-";
            }
        }
        return feedback;
    }
}

