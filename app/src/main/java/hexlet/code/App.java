package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    private static final String WELCOME = "1";
    private static final String EVEN = "2";
    private static final String CALCULATE = "3";
    private static final String GCD = "4";
    private static final String PROGRESSION = "5";
    private static final String PRIME = "6";

    private static final String EXIT = "0";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n");
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case WELCOME:
                Cli.greting();
                break;
            case EVEN:
                Even.findEvenNumber();
                break;
            case CALCULATE:
                Calc.generateMathExpression();
                break;
            case GCD:
                Gcd.findLargestDivisor();
                break;
            case PROGRESSION:
                Progression.findNumber();
                break;
            case PRIME:
                Prime.findSimpleNumber();
                break;
            case EXIT:
                System.exit(0);
                break;
            default:
                throw new IllegalArgumentException("You entered invalid number, this game does not exist");
        }
    }
}
