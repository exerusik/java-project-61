package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static void findLargestDivisor() {
        Random random = new Random();
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswer = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randOne = random.nextInt(50);
            int randTwo = random.nextInt(50);
            questionAndAnswer[i][Engine.QUESTION] = randOne + " " + randTwo;
            questionAndAnswer[i][Engine.ANSWER] = String.valueOf(gcdAlcorithm(randOne, randTwo));

        }
        Engine.start(rule, questionAndAnswer);
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
