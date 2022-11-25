package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Test
    public void getKittens() {

    }

    @Mock

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion("Самка");
        assertEquals(false, lion.doesHaveMane());
    }

    @Test
    public void getFood() {
    }
}