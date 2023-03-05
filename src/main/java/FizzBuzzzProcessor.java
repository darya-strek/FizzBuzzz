package com.gradle.tutorial;

public class FizzBuzzzProcessor {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(convert(i));
        }
    }

    public static String convert(int fizzBuzzz) {
        if (fizzBuzzz % 15 == 0) {
            return "FizzBuzz";
        }
        if (fizzBuzzz % 3 == 0) {
            return "Fizz";
        }
        if (fizzBuzzz % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(fizzBuzzz);
    }
}