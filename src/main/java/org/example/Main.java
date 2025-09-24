package org.example;

public class Main {
    public static void main(String[] args) {
        TimeConverter converter = new TimeConverter();

        long timeMilis = System.currentTimeMillis();

        String time = converter.convertMillisecondsToTime(timeMilis);
        System.out.println(time);
    }
}