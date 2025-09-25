package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();
        height /= 100;

        double bmi = weight / (height * height);

        String ans;
        if (bmi < 18.5) ans = "Underweight";
        else if (18.5 <= bmi && bmi < 25.0) ans = "norm";
        else if (25.0 <= bmi && bmi < 30.0) ans = "Overweight";
        else ans = "fatness";

        System.out.printf("Your BMI: %.1f. You have %s", bmi, ans);

        scanner.close();
    }
}