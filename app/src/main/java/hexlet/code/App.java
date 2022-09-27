package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit\n" + "Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 : Cli.welcomeCli();
            break;
            case 2 : Even.evenGame();
            break;
            case 3 : Calc.Calculate();
            break;
            case 0 : break;
        }
    }
}
