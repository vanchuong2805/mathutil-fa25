package com.vanchuong;

import com.vanchuong.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArg0RunsWell();
        testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArg6RunsWell();
        testFactorialGivenInvalidArgMinus5ThrowsException();
    }

    // TEST CASE #1: Check/Verify getFactorial() method with valid parameter, e.g. n = 0
    // STEPS:
    // 1. Given a valid n, e.g. n = 0
    // 2. Call/Invoke getFactorial(n=0)
    // 3. Execute
    // EXPECTED RESULT:
    // The method will return 1 as the result of 0!
    public static void testFactorialGivenRightArg0RunsWell() {
        int n = 0; // input
        long expectedValue = 1; // hope to see 0! = 1
        // call method
        long actualValue = MathUtility.getFactorial(n);
        // compare
        // dùng boolean hoặc print
        System.out.println("0! expected: " + expectedValue);
        System.out.println("0! actual: " + actualValue);
    }

    // TEST CASE #2: Check/Verify getFactorial() method with valid parameter, e.g. n = 5
    // STEPS:
    // 1. Given a valid n, e.g. n = 5
    // 2. Call/Invoke getFactorial(n=5)
    // 3. Execute
    // EXPECTED RESULT:
    // The method will return 120 as the result of 5!
    public static void testFactorialGivenRightArg5RunsWell() {
        int n = 5; // input
        long expectedValue = 120; // hope to see 5! = 120
        // call method
        long actualValue = MathUtility.getFactorial(n);
        // compare
        // dùng boolean hoặc print
        System.out.println("5! expected: " + expectedValue);
        System.out.println("5! actual: " + actualValue);
    }

    // TEST CASE #3: Check/Verify getFactorial() method with valid parameter, e.g. n = 6
    // STEPS:
    // 1. Given a valid n, e.g. n = 6
    // 2. Call/Invoke getFactorial(n=6)
    // 3. Execute
    // EXPECTED RESULT:
    // The method will return 720 as the result of 6!
    public static void testFactorialGivenRightArg6RunsWell() {
        System.out.println("6! expected: 720 | actual: " + MathUtility.getFactorial(6));
    }

    // TEST CASE #4: Check/Verify getFactorial() method with invalid parameter, e.g. n = -6
    // STEPS:
    // 1. Given a invalid n, e.g. n = -6
    // 2. Call/Invoke getFactorial(n = -6)
    // 3. Execute
    // EXPECTED RESULT:
    // The method will throw an exception
    public static void testFactorialGivenInvalidArgMinus5ThrowsException() {
        MathUtility.getFactorial(-5); //PASSED KHI CÓ THROW EXCEPTION
    }
}