package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final int BOUND = 10;
    private static final int START_OF_LENGTH = 5;
    public static void findNumber() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            StringBuilder question = new StringBuilder();
            int firstElement = random.nextInt(Engine.BOUND);
            int commonRatio = random.nextInt(1, BOUND);
            int lengthProgression = random.nextInt(START_OF_LENGTH, BOUND);
            int missElement = random.nextInt(lengthProgression);
            for (int j = 0; j < lengthProgression; j++) {
                firstElement += commonRatio;
                if (j == missElement) {
                    question.append("..")
                            .append(" ");
                    questionAndAnswer[i][Engine.ANSWER] = String.valueOf(firstElement);
                    continue;
                }
                question.append(firstElement)
                        .append(" ");

            }
            questionAndAnswer[i][Engine.QUESTION] = String.valueOf(question);
        }
        Engine.start(RULE, questionAndAnswer);
    }
}
