package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    private static final String RULE = "Find the greatest common divisor of given numbers.";
    public static void findLargestDivisor() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randOne = random.nextInt(Engine.BOUND);
            int randTwo = random.nextInt(Engine.BOUND);
            questionAndAnswer[i][Engine.QUESTION] = randOne + " " + randTwo;
            questionAndAnswer[i][Engine.ANSWER] = String.valueOf(gcdAlgorithm(randOne, randTwo));

        }
        Engine.start(RULE, questionAndAnswer);
    }
    public static int gcdAlgorithm(int one, int two) {

        if (one == 0 || two == 0) {
            return 0;
        }
        if (one == two) {
            return one;
        }
        if (one > two) {
            return gcdAlgorithm(one - two, two);
        } else {
            return gcdAlgorithm(one, two - one);
        }
    }
}
