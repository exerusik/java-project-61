package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void findEvenNumber() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randNum = random.nextInt(Engine.BOUND);
            questionAndAnswer[i][Engine.QUESTION] = Integer.toString(randNum);
            questionAndAnswer[i][Engine.ANSWER] = isEven(randNum) ? "yes" : "no";

        }
        Engine.start(RULE, questionAndAnswer);
    }

    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
