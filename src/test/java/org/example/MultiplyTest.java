package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplyTest {
    Multiply m = new Multiply();

    @Test
    public void shouldBeCorrect() {
        assertEquals(4, m.multiply(2,2));
    }
    @Test
    public void shouldBeInCorrect() {
        assertNotEquals(4, m.multiply(4,2));
    }
}
