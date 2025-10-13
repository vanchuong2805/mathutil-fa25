package com.vanchuong.mathutil.core.test;

import static com.vanchuong.mathutil.core.MathUtility.*;
// import static chỉ dành cho những hàm static để không cần ghi tên class
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    // hàm main có thể run,
    // 1 class test có thể có nhiều test ¬ nhiều main
// TEST CASE #1: Check/Verify getFactorial() method with valid parameter, e.g. n = 0
    // STEPS:
    // 1. Given a valid n, e.g. n = 0
    // 2. Call/Invoke getFactorial(n=0)
    // 3. Execute
    // EXPECTED RESULT:
    // The method will return 1 as the result of 0!
    @Test
    public void testFactorialGivenRightArg0RunsWell() {

        assertEquals(1, getFactorial(0));
    }
    @Test
    public void testFactorialGivenRightArg5RunsWell() {

        assertEquals(120, getFactorial(5));
    }
    @Test
    public void testFactorialGivenRightArg4RunsWell() {

        assertEquals(24, getFactorial(4));
    }
    @Test
    public void testFactorialGivenRightArg3RunsWell() {

        assertEquals(6, getFactorial(3));
    }
}