package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] coeff = readCoeff();

        double[] roots = solveQuadratic(
                coeff[0],
                coeff[1],
                coeff[2]
        );

        printSolution(roots);
    }

    static double[] readCoeff() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициенты a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        return new double[]{a, b, c};
    }

    static double[] solveQuadratic(double a, double b, double c) {
        double d = b * b - 4 * a * c;

        if (d < 0) {
            return new double[0];
        }

        if (d == 0) {
            double x = -b / (2 * a);
            return new double[]{x};
        }

        double sqrtD = Math.sqrt(d);
        double x1 = (-b - sqrtD) / (2 * a);
        double x2 = (-b + sqrtD) / (2 * a);

        return new double[]{x1, x2};
    }

    static void printSolution(double[] roots) {
        if (roots.length == 0) {
            System.out.println("Действительных корней нет");
        } else if (roots.length == 1) {
            System.out.println("Один корень: x = " + roots[0]);
        } else {
            System.out.println("Два корня:");
            System.out.println("x1 = " + roots[0]);
            System.out.println("x2 = " + roots[1]);
        }
    }
}