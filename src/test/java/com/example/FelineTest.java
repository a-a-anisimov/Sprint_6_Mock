package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

public class FelineTest {
    Feline feline = new Feline();
    List<String> food = List.of("Животные", "Птицы", "Рыба");
    int kittensCount = feline.getKittens();

    @Test
    public void eatMeat() throws Exception {
        Assert.assertTrue(Objects.equals(feline.eatMeat(), food));
    }

    @Test
    public void getFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittens() {
        assertEquals(1, kittensCount);
    }
}