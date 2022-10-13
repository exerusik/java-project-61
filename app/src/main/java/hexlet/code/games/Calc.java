package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int NUMBER_OF_OPERATION = 3;
    private static final String RULE = "What is the result of the expression?";

    private static final char[] OPERATION = {'+', '-', '*'};
    public static void generateMathExpression() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randOne = random.nextInt(Engine.BOUND);
            int randIndex = random.nextInt(0, NUMBER_OF_OPERATION);
            int randTwo = random.nextInt(Engine.BOUND);
            int result = getArithmetic(randOne, randTwo, OPERATION[randIndex]);

            questionAndAnswer[i][Engine.QUESTION] = randOne + " " + OPERATION[randIndex] + " " + randTwo;
            questionAndAnswer[i][Engine.ANSWER] = String.valueOf(result);

        }
        Engine.start(RULE, questionAndAnswer);
    }
    public static int getArithmetic(int one, int two, char operator) {
        int result = 0;
        switch (operator) {
            case '+':
                result = one + two;
                break;
            case '-':
                result = one - two;
                break;
            case '*':
                result = one * two;
                break;
            default:
                throw new IllegalArgumentException("Something went wrong");
        }
        return result;
    }
}
