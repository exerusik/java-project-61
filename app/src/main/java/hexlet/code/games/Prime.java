package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void findSimpleNumber() {
        Random random = new Random();
        String[][] questionAndAnswer = new String[Engine.COUNT_OF_ROUND][Engine.Q_AND_A];
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int randomNum = random.nextInt(100);
                questionAndAnswer[i][Engine.QUESTION] = String.valueOf(randomNum);
                questionAndAnswer[i][Engine.ANSWER] = isPrime(randomNum) ? "yes" : "no";

        }
            Engine.start(rule, questionAndAnswer);
    }
        public static boolean isPrime (int num){
            boolean isCheck = false;
            for (int i = 2; i <= num; i++) {
                isCheck = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isCheck = false;
                    }
                }
            }
                return isCheck;
        }
    }

