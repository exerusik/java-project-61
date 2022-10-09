package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void generateMathExpression() {

        Random random = new Random();
        String rule = "What is the result of the expression?";
        String [][] questionAndAnswer = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            char[] operation = {'+', '-', '*'};
            int randOne = random.nextInt(100);
            int randIndex = random.nextInt(0,3);
            int randTwo = random.nextInt(100);
            int result = getArifmetic(randOne, randTwo,operation[randIndex]);

            questionAndAnswer[i][Engine.QUESTION] = randOne + " " + operation[randIndex] + " " + randTwo;
            questionAndAnswer[i][Engine.ANSWER] = String.valueOf(result);

        }
        Engine.start(rule, questionAndAnswer);
    }
    public static int getArifmetic(int one, int two, char operator) {
        int result = 0;
        switch (operator) {
            case '+' : result = one + two;
            break;
            case '-' : result = one - two;
            break;
            case '*' : result = one * two;
            break;
            default : throw new IllegalArgumentException("Something went wrong");
        }
        return result;
    }
}
