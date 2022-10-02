package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    private static final String welcome = "1";
    private static final String even = "2";
    private static final String calculate = "3";
    private static final String gcd = "4";
    private static final String progression = "5";
    private static final String prime = "6";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n");
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case welcome : Cli.greting();
            break;
            case even : Even.findEvenNumber();
            break;
            case calculate: Calc.generateMathExpression();
            break;
            case gcd : Gcd.findLargestDivisor();
            break;
            case progression : Progression.findNumber();
            break;
            case prime : Prime.findSimpleNumber();
            break;
            default : throw new IllegalArgumentException("You entered invalid number, this game does not exist");
        }
    }
}
