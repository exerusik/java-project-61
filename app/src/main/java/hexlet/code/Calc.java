package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void Calculate() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        int countTrue = 0;
        while(countTrue < 3) {
        int randOne = random.nextInt(100);
        int randIndex = random.nextInt(3);
        int randTwo = random.nextInt(100);
        int correctAnswer = 0;
        System.out.print("Question: ");
            switch (randIndex) {
                case 0 -> {
                    System.out.println(randOne + "+" + randTwo);
                    correctAnswer = randOne + randTwo;
                }
                case 1 -> {
                    correctAnswer = randOne - randTwo;
                    System.out.println(randOne + "-" + randTwo);
                }
                case 2 -> {
                    correctAnswer = randOne * randTwo;
                    System.out.println(randOne + "*" + randTwo);
                }
            }
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();

        if (answer == correctAnswer) {
            System.out.println("Correct!");
            countTrue++;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + ".\n" +
                    "Let's try again, " + Cli.name + "!");
            break;
        }
        if (countTrue == 3) {
            System.out.println("Congratulations, " + Cli.name);
        }
    }
    }
}
