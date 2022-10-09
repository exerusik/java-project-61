package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    public static void findEvenNumber() {
        int to = 100;
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String questionAndAnswer[][] = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];

        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
                Random random = new Random();
                int randNum = random.nextInt(to);
                questionAndAnswer[i][Engine.QUESTION] = Integer.toString(randNum);

                questionAndAnswer[i][Engine.ANSWER] = isEven(randNum) ? "yes" : "no";

        }
        Engine.start(rule,questionAndAnswer);
    }

    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
