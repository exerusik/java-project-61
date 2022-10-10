package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_OF_ROUND = 3;
    public static final int Q_AND_A = 2;

    public static final int QUESTION = 0;

    public static final int ANSWER = 1;

    public static final int BOUND = 100;


    public static void start(String ruleOfGame, String[][] questionAndAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(ruleOfGame);


        for (int i = 0; i < questionAndAnswer.length; i++) {
            for (int j = 0; j < questionAndAnswer[i].length; j++) {
                System.out.println("Question: " + questionAndAnswer[i][j]);
                j++;
                System.out.print("Your answer: ");
                String answer = scanner.nextLine();
                if (answer.equals(questionAndAnswer[i][j])) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "'"
                            + " is wrong answer ;(. Correct answer was "
                            + "'" + questionAndAnswer[i][j]
                            + "'.\n"
                            + "Let's try again, "
                            + name + "!");
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
