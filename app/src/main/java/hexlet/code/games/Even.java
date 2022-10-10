package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final String[][] QUESTION_AND_ANSWER = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];

    public static void findEvenNumber() {
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            Random random = new Random();
            int randNum = random.nextInt(Engine.BOUND);
            QUESTION_AND_ANSWER[i][Engine.QUESTION] = Integer.toString(randNum);
            QUESTION_AND_ANSWER[i][Engine.ANSWER] = isEven(randNum) ? "yes" : "no";

        }
        Engine.start(RULE, QUESTION_AND_ANSWER);
    }

    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
