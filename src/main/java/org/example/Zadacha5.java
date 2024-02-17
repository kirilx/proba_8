package org.example;
import java.util.Scanner;

public class Zadacha5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Избери опция");
        System.out.println("1.Квадрат");
        System.out.println("2.Триъгълник");
        System.out.println("3.Изход от програмата");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                calculateSquareArea(scanner);
                break;
            case 2:
                calculateTriangleArea(scanner);
                break;
            case 3:
                System.out.println("Изход от програмата.");
                break;
            default:
                System.out.println("Невалидна опция.");
        }
    }

    private static void calculateTriangleArea(Scanner scanner) {
        System.out.println("ВВъведете основа на триъгълника: ");
        double sideA = scanner.nextInt();
        System.out.println("Въведете височина на триъгълника: ");
        double sideB = scanner.nextInt();
        if (sideA > 0 && sideB >0){
            double area = 0.5 * sideA * sideB;
            System.out.println("Лицето на триъгълника е " + area);

        }else {
            System.out.println("Невалидни размери на триъгълника.");
        }
    }

    private static void calculateSquareArea (Scanner scanner) {
        System.out.println("Въведете страна на квадрата:");
        int side = scanner.nextInt();
        int area = side * side;
        {
            if (side > 0) {
                System.out.println("Лицето на квадрат е " + area);

        } else {
            System.out.println("Невалидна дължина на страната.");
        }
    }



        }
        }






