package org.example;

import java.util.Scanner;

public class Zadacha3 {
    private static Scanner keyboard;

    public static void main(String[] args) {

        Scanner ribi = new Scanner(System.in);
        System.out.println("Въведете цифра 1");
        int number1 = ribi.nextInt();


        if (number1 > 0 ){
            System.out.println("Числото е положително");

        } else if( number1 < 0) {
            System.out.println("Числото е отрицателно");
        }else {
            System.out.println("Числото е нула");
        }
    }

}
