package com.vanchuong.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // CHUẨN BỊ BỘ DATA ĐỂ RIÊNG SAU ĐÓ FILL VÀO
    //  MẢNG 2 CHIỀU [EXPECTED VALUE, N]
    public static Object[][] initData() {
        Object[][] dataset = {{5, 120}, {6, 720}, {4, 24}, {3, 6}, {1, 1}, {0, 1}};
        return dataset;
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgRunsWell( int number, long expected){
        assertEquals(expected, MathUtility.getFactorial(number));
    }
}