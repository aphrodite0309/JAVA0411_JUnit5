package org.example.test;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Tester2 {
    private int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void testStream() {
        assertTrue(Arrays.stream(values).sum() == 55, () -> "sum should be equal to 55");
    }

    @Test
    public void testStream2() {
        assertEquals(Arrays.stream(values).sum(), 55, "sum should be equal to 55");
    }

    @Test
    public void testStream3() {
        assertAll("check all numbers",
                () -> assertEquals(values[0], 1),
                () -> assertEquals(values[1], 2),
                () -> assertEquals(values[2], 3));
    }

    @Test
    public void testTimer4() {
        assertTimeout(Duration.ofMillis(2000), () -> Thread.sleep(1900));
    }

    @Test
    public void test5() {
        int x = 5;
        int y = 6;
        assumeTrue(x + y < 12);
        assertEquals(x + y, 11);
    }

    @Test
    public void test6() {
        int x = 5;
        int y = 6;
        assumeTrue(x + y > 12);
        assertEquals(x + y, 11);
    }
}
