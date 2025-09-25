package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x0, y0, x1, y1, x2, y2;
        System.out.println("Введи точки!");
        x0 = scan.nextDouble();
        y0 = scan.nextDouble();
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        double side1 = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0)*(y1 - y0));
        double side2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)*(y2 - y1));
        double side3 = Math.sqrt((x0 - x2) * (x0 - x2) + (y0 - y2)*(y0 - y2));

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Точки не образуют треугольник!");
            return;
        }

        double a = Math.acos(Math.max(-1, Math.min(1, (side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2))));
        double b = Math.acos(Math.max(-1, Math.min(1, (side1 * side1 - side2 * side2 + side3 * side3) / (2 * side1 * side3))));
        double c = Math.acos(Math.max(-1, Math.min(1, (side3 * side3 + side2 * side2 - side1 * side1) / (2 * side2 * side3))));

        System.out.println("Точки треугольника:");
        System.out.printf("%.2f %.2f %.2f", Math.toDegrees(a), Math.toDegrees(b), Math.toDegrees(c));
    }
}