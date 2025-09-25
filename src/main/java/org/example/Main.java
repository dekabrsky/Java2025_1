package org.example;

public class Main {
    public static void main(String[] args) {
        long ms_in_day = 1000 * 60 * 60 * 24, cur_time = System.currentTimeMillis(),
        ms_in_cur_day = cur_time % ms_in_day, 
        hrs_in_cur_day = ms_in_cur_day / (1000 * 60 * 60),
        minutes_in_cur_day = (ms_in_cur_day / (1000 * 60)) % 60,
        seconds_in_cur_day = (ms_in_cur_day / 1000) % 60;
        System.out.println(hrs_in_cur_day + ":" + minutes_in_cur_day + ":" + seconds_in_cur_day + " GMT");
    }
}