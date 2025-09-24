package org.example;

import java.util.regex.Pattern;

public class Point {

    private final double x;
    private final double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private static final String DOUBLE_REGEXP = "(-?)(0|([1-9]\\d*))(\\.\\d+)?";
    private static final Pattern POINT_REGEXP = Pattern.compile("^\\(" + DOUBLE_REGEXP + "," + DOUBLE_REGEXP +"\\)");

    public static Point parsePoint(String s) throws PointFormatException {
        if (s == null) {
            throw new NullPointerException("Не могу получить точку из строки со значением null.");
        }
        if (!POINT_REGEXP.matcher(s).matches()) {
            throw new PointFormatException();
        }
        String[] coordsStringInfo = s.substring(1, s.length() - 1).split(",");
        return new Point(Double.parseDouble(coordsStringInfo[0]), Double.parseDouble(coordsStringInfo[1]));
    }

    public static double distance(Point p1, Point p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
}