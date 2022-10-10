package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int NUMBER_OF_OPERATION = 3;
    private static final String RULE = "What is the result of the expression?";

    private static final String[][] QUESTION_AND_ANSWER = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
    public static void generateMathExpression() {
        Random random = new Random();

        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            char[] operation = {'+', '-', '*'};
            int randOne = random.nextInt(Engine.BOUND);
            int randIndex = random.nextInt(0, NUMBER_OF_OPERATION);
            int randTwo = random.nextInt(Engine.BOUND);
            int result = getArithmetic(randOne, randTwo, operation[randIndex]);

            QUESTION_AND_ANSWER[i][Engine.QUESTION] = randOne + " " + operation[randIndex] + " " + randTwo;
            QUESTION_AND_ANSWER[i][Engine.ANSWER] = String.valueOf(result);

        }
        Engine.start(RULE, QUESTION_AND_ANSWER);
    }
    public static int getArithmetic(int one, int two, char operator) {
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
