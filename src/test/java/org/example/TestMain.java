package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class TestMain {
    @Test
    public void testHello() {
        Main main = new Main();
        Assertions.assertEquals("hello", main.sayHello());
    }
}
