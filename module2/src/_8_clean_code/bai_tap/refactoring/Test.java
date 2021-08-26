package _8_clean_code.bai_tap.refactoring;

import java.util.Arrays;
import java.util.Scanner;

import static _8_clean_code.bai_tap.refactoring.TennisGame.getScore;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player1's score: ");
        int play1Score = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter player2's score: ");
        int play2Score = Integer.parseInt(scanner.nextLine());
        System.out.println("Game's result = " + getScore( play1Score, play2Score));
    }
}
