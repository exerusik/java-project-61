package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final String[][] QUESTION_AND_ANSWER = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
    private static final int BOUND = 10;
    private static final int START_OF_LENGTH = 5;
    public static void findNumber() {
        Random random = new Random();
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            String question = "";
            int firstElement = random.nextInt(Engine.BOUND);
            int commonRatio = random.nextInt(1, BOUND);
            int lengthProgression = random.nextInt(START_OF_LENGTH, BOUND);
            int missElement = random.nextInt(lengthProgression);
            for (int j = 0; j < lengthProgression; j++) {
                firstElement += commonRatio;
                if (j == missElement) {
                    question += ".." + " ";
                    QUESTION_AND_ANSWER[i][Engine.ANSWER] = String.valueOf(firstElement);
                    continue;
                }
                question += firstElement + " ";

            }
            QUESTION_AND_ANSWER[i][Engine.QUESTION] = question;
        }
        Engine.start(RULE, QUESTION_AND_ANSWER);
    }
}
