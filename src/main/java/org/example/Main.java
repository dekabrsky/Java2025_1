package org.example;

public class Main {
    public static void main(String[] args) {
        final long currentTime = System.currentTimeMillis();
        final long currentTimePlusHour = currentTime + 1000 * 60 * 60;

        final long currentDayMillis = currentTimePlusHour % (1000 * 60 * 60 * 24);
        final long hours = currentDayMillis / 1000 / 60 / 60;
        final long minutes = (currentDayMillis % (1000 * 60 * 60)) / 1000 / 60;
        final long seconds = (currentDayMillis % (1000 * 60)) / 1000;

        System.out.println(
            String.format("%02d:%02d:%02d GMT\n", hours, minutes, seconds)
        );
    }
}
