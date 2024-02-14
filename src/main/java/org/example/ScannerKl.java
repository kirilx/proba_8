package org.example;

import java.util.Scanner;

public class ScannerKl {
    private static Scanner keyboard;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");
        int dayNumnber = scanner.nextInt();

        String dayName;
        switch (dayNumnber) {
            case 1:
                dayName = "Monday";
                break;
            case 2 :
                dayName = "Tusday";
                break;
            case 3 :
                dayName = "Wednesday";
                break;
            case 4 :
                dayName = "Thursday";
                break;case 5 :
                dayName = "Friday";
                break;
            case 7 :
                dayName = "Saturday";
                break;
            case 8 :
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalit input" ;
                break;
        }
            System.out.println("You entered " + dayNumnber + " . So weekday is "+ dayName + " ");
        }
    }
