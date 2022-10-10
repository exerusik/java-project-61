package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    private static final String RULE = "Find the greatest common divisor of given numbers.";
    private static final String[][] QUESTION_AND_ANSWER = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
    public static void findLargestDivisor() {
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randOne = random.nextInt(Engine.BOUND);
            int randTwo = random.nextInt(Engine.BOUND);
            QUESTION_AND_ANSWER[i][Engine.QUESTION] = randOne + " " + randTwo;
            QUESTION_AND_ANSWER[i][Engine.ANSWER] = String.valueOf(gcdAlcorithm(randOne, randTwo));

        }
        Engine.start(RULE, QUESTION_AND_ANSWER);
    }
    public static int gcdAlcorithm(int one, int two) {

        if (one == 0 || two == 0) {
            return 0;
        }
        if (one == two) {
            return one;
        }
        if (one > two) {
            return gcdAlcorithm(one - two, two);
        } else {
            return gcdAlcorithm(one, two - one);
        }
    }
}
