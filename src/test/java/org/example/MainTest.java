package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    // Пример теста для ориентира (см. README, раздел «Тесты»). Можно удалить.
    @Test
    void greetingContainsName() {
        assertEquals("Hello, Anya!", Main.greeting("Anya"));
    }
}
