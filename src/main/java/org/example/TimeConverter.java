package org.example;

public class TimeConverter {
    public String convertMillisecondsToTime(long totalMilliseconds) {
        int totalSeconds = (int) (totalMilliseconds / 1000);
        int seconds = totalSeconds % 60;
        int totalMinutes = totalSeconds / 60;
        int minutes = totalMinutes % 60;
        int totalHours = totalMinutes / 60;
        int hours = totalHours % 24;

        return String.format("%02d:%02d:%02d GMT", hours, minutes, seconds);
    }
}