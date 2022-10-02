package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void findNumber() {
        Random random = new Random();

        for (int i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            int fullProgressionLength = random.nextInt(6, 10);
            String[] fullProgression = new String[fullProgressionLength];

            int firstElement = random.nextInt(2, 10);
            int commonRatio = random.nextInt(2, 5);
            fullProgression[0] = String.valueOf(firstElement);
            int randomElementOfProgression = random.nextInt(1, fullProgressionLength);

            StringBuilder roundOfProgression = new StringBuilder(fullProgression[0]);
            for (int j = 1; j < fullProgression.length; j++) {
                int multiply = Integer.parseInt(fullProgression[j - 1]) * commonRatio;
                fullProgression[j] = String.valueOf(multiply);
                if (j == randomElementOfProgression) {
                    roundOfProgression.append(" ..");
                    Engine.correctAnswer[i] = String.valueOf(multiply);
                    continue;
                }
                roundOfProgression.append(" ").append(multiply);

            }
            Engine.question[i] = roundOfProgression.toString();
        }
        Engine.setRuleOfGame("What number is missing in the progression?");
        Engine.start();
    }
}
