package com.fju;

public class StarPyramid {
    public static void main(String[] args) {
        for(int i=1 ; i<=9 ; i++) {
            for (int j=8 ; j>=i ; j--) {
                System.out.print(" ");
            }
            for (int k=1 ; k<=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
