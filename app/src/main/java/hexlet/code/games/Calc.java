package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void Calculate() {

        Random random = new Random();
        Engine.ruleOfGame = "What is the result of the expression?";
        for (int i = 0; i < 3; i++) {
            int randOne = random.nextInt(100);
            int randIndex = random.nextInt(3);
            int randTwo = random.nextInt(100);
            switch (randIndex) {
                case 0 -> {
                    Engine.question[i] = randOne + "+" + randTwo;
                    Engine.correctAnswer[i] = Integer.toString(randOne + randTwo);
                }
                case 1 -> {
                    Engine.correctAnswer[i] = Integer.toString(randOne - randTwo);
                    Engine.question[i] = randOne + "-" + randTwo;
                }
                case 2 -> {
                    Engine.correctAnswer[i] = Integer.toString(randOne * randTwo);
                    Engine.question[i] = randOne + "*" + randTwo;
                }
            }
        }
        Engine.logicGames();
    }
}
