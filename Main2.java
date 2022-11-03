package org.example;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer from -999999999 to 999999999");
        System.out.println();
        System.out.println("Number one");
        String numb1 = sc.nextLine();
        try {
            Integer.parseInt(numb1);
        } catch (NumberFormatException e) {
            System.err.println("Error: wrong integer");
            System.exit(1);
        }

        System.out.println("Number two");
        String numb2 = sc.nextLine();
        try {
            Integer.parseInt(numb2);
        } catch (NumberFormatException e) {
            System.err.println("Error: wrong integer");
            System.exit(1);
        }
        System.out.println("Number three");
        String numb3 = sc.nextLine();
        try {
            Integer.parseInt(numb3);
        } catch (NumberFormatException e) {
            System.err.println("Error: wrong integer");
            System.exit(1);
        }

        int num1 = Integer.parseInt(numb1);
        int num2 = Integer.parseInt(numb2);
        int num3 = Integer.parseInt(numb3);
        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println(num1 + ">" + num2 + ">" + num3);
            }
            if (num2 < num3) {
                System.out.println(num1 + ">" + num2 + "<" + num3);
            }
            if (num2 == num3) {
                System.out.println(num1 + ">" + num2 + "=" + num3);
            }
        }
        if (num1 < num2) {
            if (num2 > num3) {
                System.out.println(num1 + "<" + num2 + ">" + num3);
            }
            if (num2 < num3) {
                System.out.println(num1 + "<" + num2 + "<" + num3);
            }
            if (num2 == num3) {
                System.out.println(num1 + "<" + num2 + "=" + num3);
            }
        }
        if (num1 == num2) {
            if (num2 > num3) {
                System.out.println(num1 + "=" + num2 + ">" + num3);
            }
            if (num2 < num3) {
                System.out.println(num1 + "=" + num2 + "<" + num3);
            }
            if (num2 == num3) {
                System.out.println(num1 + "=" + num2 + "=" + num3);
            }
        }
    }
}