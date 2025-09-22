package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        double height = (double)sc.nextInt() / 100;
        double bmi = (double) weight / (height * height);
        if (bmi < 18.5){
            System.out.print("Недостаточный вес");
        } else if (bmi < 25.0) {
            System.out.print("Норма");
        } else if (bmi < 30.0) {
            System.out.print("Избыточный вес");
        }
        else{
            System.out.print("Ожирение");
        }
    }
}