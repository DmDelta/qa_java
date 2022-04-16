package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {
    private Feline feline;

    @Before
    public void initObjects() {
        feline = new Feline(); // создали экземпляр класса
    }

    @Test
    public void getFamilyTest() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }

    @Test
    public void getKittensTestDefault() {
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
    }

    @Test
    public void getKittensTestWithParams() {
        int actual = feline.getKittens(2);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
}