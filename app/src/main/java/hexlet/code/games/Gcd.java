package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static void gcd() {
        Random random = new Random();
        Engine.ruleOfGame = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < 3; i++) {
            int randOne = random.nextInt(50);
            int randTwo = random.nextInt(50);
            Engine.question[i] = randOne + " " + randTwo;
            Engine.correctAnswer[i] = String.valueOf(gcdAlcorithm(randOne, randTwo));

        }
        Engine.logicGames();
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