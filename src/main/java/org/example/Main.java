package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите процентную ставку");
        double i = input.nextDouble();
        i = i / 12.0 / 100.0;
        System.out.println("Введите сумму кредита");
        double A = input.nextDouble();
        System.out.println("Введите количество лет на кредит");
        double n = input.nextDouble();
        n *= 12.0;
        double M = A * i / (1.0 - 1.0 / Math.pow(1.0 + i, n));
        double T = M * n;
        System.out.print("Ежемесячный платёж: ");
        System.out.println(String.format("%.2f", M));
        System.out.print("Стоимость кредита: ");
        System.out.println(String.format("%.2f", T));
        input.close();
    }
}