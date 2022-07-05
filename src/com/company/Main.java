package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scan.nextInt();

        if (Math.sqrt(a) != a * a) {
            throw new ArithmeticException();
        } else {
            System.out.println("true");
        }
    }
}
