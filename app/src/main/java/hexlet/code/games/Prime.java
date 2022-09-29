package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void primeGame() {
        Random random = new Random();
        Engine.ruleOfGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 0; i < 3; i++) {
            int randomNum = random.nextInt(2,500);
            Engine.question[i] = String.valueOf(randomNum);
            for (int j = 2; j < randomNum; j++) {
                if (randomNum % j ==0) {
                Engine.correctAnswer[i] = "no";
                break;
                }
                Engine.correctAnswer[i] = "yes";
            }

        }
        Engine.logicGames();
    }
}
