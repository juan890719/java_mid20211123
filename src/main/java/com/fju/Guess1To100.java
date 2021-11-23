package com.fju;

import java.util.Random;
import java.util.Scanner;

public class Guess1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        boolean bingo = false;
        int secret = random.nextInt(100)+1;
        System.out.println(secret);

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number in " + min + " to " + max);
            int number = scanner.nextInt();
            if (number == secret) {
                bingo = true;
                break;
            } else if (number < secret && number > min) {
                min = number;
            } else if (number > secret && number < max) {
                max = number;
            }
        }

        if (bingo) {
            System.out.println("You win secret number is " + secret);
        } else {
            System.out.println("You loose secret number is " + secret);
        }
    }
}
