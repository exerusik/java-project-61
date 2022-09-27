package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    public static void evenGame() {
        int to = 100;


        Engine.ruleOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0 ; i < 3 ; i++) {
            Random random = new Random();
            int randNum = random.nextInt(to);
            Engine.question[i] = Integer.toString(randNum);

            Engine.correctAnswer[i] = isEven(randNum) ? "yes" : "no";

            }
        Engine.logicGames();
        }

            public static boolean isEven ( int randomNumber){
                return randomNumber % 2 == 0;
            }
        }
