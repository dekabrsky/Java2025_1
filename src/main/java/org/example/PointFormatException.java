package org.example;

public class PointFormatException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = """
            Некорреткный формат ввода. Ожидается запись точки в виде (double,double).
            Примеры:
                (132.89, -0.123),
                (1435, 893.0)
            """;

    public PointFormatException() {
        super(DEFAULT_MESSAGE);
    }

    public PointFormatException(String message) {
        super(message);
    }

}
