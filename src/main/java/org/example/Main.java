package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
    }

    // Пример для ориентира: вычислительная логика отдельным методом,
    // чтобы её можно было покрыть тестом. Можно удалить.
    static String greeting(String name) {
        return "Hello, " + name + "!";
    }
}