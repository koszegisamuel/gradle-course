package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sayHello() {
        assertEquals("Hello John Doe!", new Main().sayHello("John Doe"));
    }
}