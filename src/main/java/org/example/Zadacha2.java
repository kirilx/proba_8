package org.example;

import java.util.Scanner;

public class Zadacha2 {
    private static Scanner keyboard;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете дължината");
        int lenght = scanner.nextInt();
        while (lenght <= 0) {
            System.out.println("Въведи покожително число");
            lenght = scanner.nextInt();
        }

            System.out.println("Въведете височина");
            int hight = scanner.nextInt();
            while (hight <= 0) {
                System.out.println("Въведи покожително число");
                hight = scanner.nextInt();

            }
int perimeter = 2 * (lenght + hight);
            int area = lenght * hight ;
        System.out.println("Периметър е "+ perimeter);
        System.out.println("Лицето е "+ area);
        }

    }

