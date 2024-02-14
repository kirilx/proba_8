package org.example;

import java.util.Scanner;

public class Zadacha4 {
    private static Scanner keyboard;

    public static void main(String[] args) {

        Scanner ribi = new Scanner(System.in);
        System.out.println("Въведете цифра 1");
        int number1 = ribi.nextInt();
        Scanner ribi2 = new Scanner(System.in);
        System.out.println("Въведете цифра 2");
        int number2 = ribi.nextInt();
        Scanner ribi3 = new Scanner(System.in);
        System.out.println("Въведете цифра 3");
        int number3 = ribi.nextInt();
        int maxNumber = number1;

        if (maxNumber > number2) {
            maxNumber = number2;

            if (maxNumber > number3) {
                maxNumber = number3;
            }else {
                System.out.println("Най-голямата цифра е: " + maxNumber);
            }



            }
        }

    }
