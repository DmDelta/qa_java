package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionWithoutManeTest {
    private final String sex;

    private final Boolean hasMane;

    public LionWithoutManeTest(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[] getSex() {
        return new Object[][]{
                {"Неизвестно", true},
                {"", true},
                {"123", false}
        };
    }

    @Test(expected = Exception.class)
    public void lionHaventManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        boolean expected = lion.doesHaveMane();
        assertEquals(expected, hasMane);
    }
}