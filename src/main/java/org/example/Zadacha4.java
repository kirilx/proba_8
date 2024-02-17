package org.example;
import java.util.Scanner;

public class Zadacha4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете цифра 1:");
        int number1 = scanner.nextInt();

        System.out.println("Въведете цифра 2:");
        int number2 = scanner.nextInt();

        System.out.println("Въведете цифра 3:");
        int number3 = scanner.nextInt();

        int maxNumber = number1;

        if (number2 > maxNumber) {
            maxNumber = number2;
        }

        if (number3 > maxNumber)
            maxNumber = number3;

        System.out.println("Най-голямата цифра е: " + maxNumber);
    }
}
