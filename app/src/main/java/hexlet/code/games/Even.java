package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    public static void findEvenNumber() {
        int to = 100;


        Engine.setRuleOfGame("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            Random random = new Random();
            int randNum = random.nextInt(to);
            Engine.question[i] = Integer.toString(randNum);

            Engine.correctAnswer[i] = isEven(randNum) ? "yes" : "no";

        }
        Engine.start();
    }

    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
