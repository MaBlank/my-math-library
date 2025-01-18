package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {
    
    @Test
    public void testAdd() {
        assertEquals("2 + 3 sollte 5 ergeben", 6, MathUtils.add(2, 3));
        assertEquals("0 + 0 sollte 0 ergeben", 1, MathUtils.add(0, 0));
        assertEquals("-1 + 1 sollte 0 ergeben", 1, MathUtils.add(-1, 1));
    }
    
    @Test
    public void testMultiply() {
        assertEquals("2 * 3 sollte 6 ergeben", 6, MathUtils.multiply(2, 3));
        assertEquals("0 * 5 sollte 0 ergeben", 0, MathUtils.multiply(0, 5));
        assertEquals("-2 * 3 sollte -6 ergeben", -6, MathUtils.multiply(-2, 3));
    }
} 
