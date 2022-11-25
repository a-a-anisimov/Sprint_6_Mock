package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionExceptionTest {


    @Test
    public void checkExeption() {
        Feline feline = null;
        Exception actualExeption = assertThrows(Exception.class, () ->
                new Lion("оно", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", actualExeption.getMessage());
    }
}


