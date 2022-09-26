package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void evenGame() {
        int from = 10;
        int to = 100;

        Random random = new Random(from);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int countTrue = 0;
        while (countTrue < 3) {
            int randNum = random.nextInt(to);
            System.out.print("Question: " + randNum +
                    "\nYour answer: ");
            String answer = scanner.nextLine();

            String correctAnswer = randNum % 2 == 0 ? "yes" : "no";
            boolean evenNum = randNum % 2 == 0;

            if (evenNum && answer.equals(correctAnswer) || !evenNum && answer.equals(correctAnswer)) {
                System.out.println("Correct !");
                countTrue++;

            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'.\n" +
                        "Let's try again, " + Cli.name);
                break;
            }
        }
        if (countTrue == 3) {
            System.out.println("Congratulations, " + Cli.name + "!");
        }
    }
}
