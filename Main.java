package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

            System.out.println("The weight of the parcel in kilograms?");
            var kg = scanner.nextDouble();

        while (true) {
            System.out.println("Delivery cost per kilogram in UAH.");
            var UAH = scanner.nextDouble();

            if (UAH == 0)
                break;

            var result = kg * UAH;
            System.out.println("Result = " + result);
        }
    }
}