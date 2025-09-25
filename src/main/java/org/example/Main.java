package org.example;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите ежемесячную процентную ставку: ");
        double rate = scanner.nextDouble();
        rate /= 100.0;
        System.out.print("Введите сумму кредитка: ");
        double sum = scanner.nextDouble();
        System.out.print("Введите срок кредита (целое количество лет): ");
        int len_years = scanner.nextInt();
        int len_months = len_years * 12;
        scanner.close();
        
        double monthly_payment = sum * rate / (1.0 - 1.0 / Math.pow(1.0 + rate, len_months));
        double total_cost = monthly_payment * len_months;
        
        System.out.println("Ежемесячный платёж: " + String.valueOf(monthly_payment));
        System.out.println("Стоимость кредита: " + String.valueOf(total_cost));
    }
}