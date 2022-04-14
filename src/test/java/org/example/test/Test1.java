package org.example.test;

import org.example.Utility;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    @DisplayName("very import test")
    @Test
    public void runme() {
        System.out.println("run me...");
        assertEquals(96, Utility.subMe(4));
    }
    @Test
    public void runme2() {
        System.out.println("run me2...");
        assertEquals(97, Utility.subMe(3));
    }

    @BeforeEach
    public void prepare() {
        System.out.println("prepare something");
    }

    @AfterEach
    public void store() {
        System.out.println("store some data");
    }

    @BeforeAll
    public static void prepareOnec() {
        System.out.println("prepare once");
    }

    @AfterAll
    public static void finalCleanUp() {
        System.out.println("final clean up");
    }
}
