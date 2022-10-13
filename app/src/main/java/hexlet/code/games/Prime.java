package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void findSimpleNumber() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randomNum = random.nextInt(Engine.BOUND);
            questionAndAnswer[i][Engine.QUESTION] = String.valueOf(randomNum);
            questionAndAnswer[i][Engine.ANSWER] = isPrime(randomNum) ? "yes" : "no";

        }
        Engine.start(RULE, questionAndAnswer);
    }
    public static boolean isPrime(int num) {
        boolean isCheck = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isCheck = false;
            }
        }
        return isCheck;
    }
}

