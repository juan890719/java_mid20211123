package com.fju;

import java.util.Scanner;

public class StarBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number :");
        int firstNum = scanner.nextInt();
        System.out.println("Please enter second number :");
        int secondNum = scanner.nextInt();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 21; j++) {
                if (j >= firstNum && j <= secondNum) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
}
