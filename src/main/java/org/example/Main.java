package org.example;

public class Main {
    public static void main(String[] args) {
        final var MILLIS_IN_SECOND = 1000;
        final var SECONDS_IN_MINUTE = 60;
        final var MINUTES_IN_HOUR = 60;
        final var HOURS_IN_DAY = 24;
        final var MILLIS_IN_DAY = HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE * MILLIS_IN_SECOND;

        var millisFromEpoch = System.currentTimeMillis();
        var millisFromDayStart = millisFromEpoch % MILLIS_IN_DAY;
        var secondsFromDayStart = millisFromDayStart / MILLIS_IN_SECOND;
        var seconds = secondsFromDayStart % SECONDS_IN_MINUTE;
        var minutesFromDayStart = secondsFromDayStart / SECONDS_IN_MINUTE;
        var minutes = minutesFromDayStart % MINUTES_IN_HOUR;
        var hours = minutesFromDayStart / MINUTES_IN_HOUR;
        System.out.printf("%02d:%02d:%02d GMT%n", hours, minutes, seconds);
    }
}