package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void findNumber() {
        Random random = new Random();
        String rule = "What number is missing in the progression?";
        String [][] questionAndAnswer = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];

        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            String question = "";
            int firstElement = random.nextInt(50);
            int commonRatio = random.nextInt(1,10);
            int lengthProgression = random.nextInt(5,10);
            int missElement = random.nextInt(2,10);
            for (int j = 0; j < lengthProgression; j++) {
                question += firstElement + " ";
                firstElement += commonRatio;
                if (j == missElement) {
                    question += ".." + " ";
                    questionAndAnswer[i][Engine.ANSWER] = String.valueOf(firstElement);
                }
            }
            questionAndAnswer[i][Engine.QUESTION] =question;
        }
        Engine.start(rule, questionAndAnswer);
    }
}
