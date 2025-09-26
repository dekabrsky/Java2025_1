package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter your height (in meters): ");
        double height = sc.nextDouble();

        System.out.printf("\nEnter your weight (in kilograms): ");
        double weight = sc.nextDouble();

        double bmi = weight / height / height;
        String verdict;

        if (bmi < 18.5) {
            verdict = "Underweight";
        } else if (bmi < 25) {
            verdict = "Ok";
        } else if (bmi < 30) {
            verdict = "Overweight";
        } else {
            verdict = "Obesity :(";
        }

        System.out.println(verdict);
    }
}