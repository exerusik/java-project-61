package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final String[][] QUESTION_AND_ANSWER = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void findSimpleNumber() {
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randomNum = random.nextInt(Engine.BOUND);
            QUESTION_AND_ANSWER[i][Engine.QUESTION] = String.valueOf(randomNum);
            QUESTION_AND_ANSWER[i][Engine.ANSWER] = isPrime(randomNum) ? "yes" : "no";

        }
        Engine.start(RULE, QUESTION_AND_ANSWER);
    }
    public static boolean isPrime(int num) {
        boolean isCheck = false;
        for (int i = 2; i <= num; i++) {
            isCheck = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isCheck = false;
                }
            }
        }
        return isCheck;
    }
}

