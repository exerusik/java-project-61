package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String[] correctAnswer = new String[3];
    public static String ruleOfGame;
    public static String[] question = new String[3];

    private static final int COUNT_OF_ROUND = 3;

  public static void logicGames() {
    Cli.welcomeCli();
    System.out.println(ruleOfGame);


      for (int i = 0; i < COUNT_OF_ROUND; i++) {
      System.out.println("Question: " + question[i]);
      System.out.print("Your answer: " );
      Scanner scanner = new Scanner(System.in);
      String answer = scanner.nextLine();
      if (answer.equals(correctAnswer[i])) {
        System.out.println("Correct!");
      } else {
        System.out.println ("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + Engine.correctAnswer[i] + "'.\n" +
                "Let's try again, " + Cli.getName());
        break;
      }
      if (i==2) {
        System.out.println("Congratulation " + Cli.getName() + "!");
      }
    }
  }
}
