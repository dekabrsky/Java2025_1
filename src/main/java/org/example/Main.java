package org.example;

public class Main {
    public static void main(String[] args) {
        long currentTime, totalSec, currentSec, totalMin, currentMin, totalHour, currentHour;
        currentTime = System.currentTimeMillis();
        totalSec = currentTime / 1000;
        currentSec = totalSec % 60;
        totalMin = totalSec / 60;
        currentMin = totalMin % 60;
        totalHour = totalMin / 60;
        currentHour = totalHour % 24;
        System.out.print(currentHour + ":" + currentMin + ":" + currentSec + " GMT");
        
    }
}