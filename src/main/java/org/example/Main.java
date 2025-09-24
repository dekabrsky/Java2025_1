package org.example;

public class Main {
    public static void main(String[] args) {
        long curTime = System.currentTimeMillis() / 1000;
        System.out.printf("%02d:%02d:%02d GMT", curTime / 3600 % 24, curTime / 60 % 60, curTime % 60);
    }
}