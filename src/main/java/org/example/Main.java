package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double a = distance(x2, y2, x3, y3);
        double b = distance(x1, y1, x3, y3);
        double c = distance(x1, y1, x2, y2);

        double aRad = Math.acos((b*b + c*c - a*a) / (2 * b * c));
        double bRad  = Math.acos((a*a + c*c - b*b) / (2 * a * c));
        double cRad = Math.acos((a*a + b*b - c*c) / (2 * a * b));

        double aDeg = Math.toDegrees(aRad);
        double bDeg  = Math.toDegrees(bRad);
        double cDeg = Math.toDegrees(cRad);

        System.out.printf("Угол при вершине A: %.2f°\n", aDeg);
        System.out.printf("Угол при вершине B: %.2f°\n", bDeg);
        System.out.printf("Угол при вершине C: %.2f°\n", cDeg);

    }
    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

}