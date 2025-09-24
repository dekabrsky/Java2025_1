package org.example;

import java.util.Scanner;

public class Main {

    private static Point[] readTrianglePoints() {

        Scanner sc = new Scanner(System.in);

        String input;
        Point[] trianglePoints = new Point[3];

        for (int i = 0; i < 3; ++i) {
            while (true) {
                System.out.println("Введите " + (i+1) + "-ю точку треугольника:");
                input = sc.nextLine();
                try {
                    trianglePoints[i] = Point.parsePoint(input);
                    break;
                } catch (PointFormatException e) {
                    System.out.println(e.getMessage());
                }
            }

        }

        sc.close();

        return trianglePoints;
    }

    private static double calculateAngle(double lengthA, double lengthB, double lengthC) {
        double numerator = lengthA*lengthA - lengthB*lengthB - lengthC*lengthC;
        double denominator = -2*lengthB*lengthC;
        return Math.acos(numerator / denominator);
    }

    private static void calculateTriangleAngles(Point[] trianglePoints) {

        double lengthA = Point.distance(trianglePoints[0], trianglePoints[1]);
        double lengthB = Point.distance(trianglePoints[0], trianglePoints[2]);
        double lengthC = Point.distance(trianglePoints[1], trianglePoints[2]);

        System.out.println("Величина первого угла в радианах: " + calculateAngle(lengthA, lengthB, lengthC));
        System.out.println("Величина второго угла в радианах: " + calculateAngle(lengthB, lengthA, lengthC));
        System.out.println("Величина третьего угла в радианах: " + calculateAngle(lengthC, lengthA, lengthB));

    }

    public static void main(String[] args) {
        Point[] trianglePoints = readTrianglePoints();
        calculateTriangleAngles(trianglePoints);
    }
}