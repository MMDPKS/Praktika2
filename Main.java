package org.example;

import java.util.Scanner;

public class Main {
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

        int num1 = Integer.parseInt(numb1);
        int num2 = Integer.parseInt(numb2);

        if(num1>num2){
            System.out.println(num1 +">"+num2);
        }
        if (num1<num2){
            System.out.println(num1 +"<"+num2);
        }
        if(num1==num2) {
            System.out.println(num1 +"="+num2);
        }
    }
}