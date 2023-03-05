package com.gradle.tutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzzTest {
    @Test
    public void FizzBuzzzNormalNumbers() {

        FizzBuzzzProcessor fb = new FizzBuzzzProcessor();
        Assertions.assertEquals("1", fb.convert(1));
        Assertions.assertEquals("2", fb.convert(2));
    }

    @Test
    public void FizzBuzzzThreeNumbers() {

        FizzBuzzzProcessor fb = new FizzBuzzzProcessor();
        Assertions.assertEquals("Fizz", fb.convert(3));
    }

    @Test
    public void FizzBuzzzFiveNumbers() {

        FizzBuzzzProcessor fb = new FizzBuzzzProcessor();
        Assertions.assertEquals("Buzz", fb.convert(5));
    }

    @Test
    public void FizzBuzzzThreeAndFiveNumbers() {

        FizzBuzzzProcessor fb = new FizzBuzzzProcessor();
        Assertions.assertEquals("Buzz", fb.convert(5));
    }
}