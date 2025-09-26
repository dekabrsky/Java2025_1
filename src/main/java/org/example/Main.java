package org.example;

public class Main {
    public static void main(String[] args) {
		Long x = System.currentTimeMillis() / 1000;
		x = x % (24 * 60 * 60);
		Long h = (x) / (60 * 60);
		Long m = (x - h * 60 * 60) / (60);
		Long s = (x - h * 60 * 60 - m * 60) / (60);
        System.out.printf("%02d:%02d:%02d GMT\n", h, m, s);
    }
}
