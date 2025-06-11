package com.khantse.util.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    // CHUẨN BỊ BỘ DATA ĐỂ RIÊNG- Đ - DATA DRIVEN
    // LÁT HỒI FILL VÀO HÀM SO SÁNH  T TESTING
    // FILL VÀO QUA THAM SỐ HÀM - HÀM LÀM VIỆC VỚI NHIỀU DATA
    // DDT CÒN GỌI TÊN KHÁC: PARAMETERIED TESTING -> KIỂM THỬ THEO KIỂU THAM SỐ HÓA



    //BỘ DATA : NẰM TRONG HÀM STATIC ( HÀM NẰM 1 CHỖ ĐỂ MỌI NGƯỜI VÀO LẤY MÀ DÙNG - HÀM TĨNH )
    //BỘ DATA l THƯỜNG LÀ MẢNG 2 CHIỀU, GIÁ TRỊ ĐẦU VÀO VÀ GIÁ TRỊ ĐẦU RA KÌ VỌNG

    public static Object[][] initData(){

        return new Object[][]{{0,1},
                              {1,1},
                              {2,2},
                              {3,6},
                              {4,24},
                              {5,120},
                              {6,720}};
                             // n expected

    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightAgrsRunWell( int n, long expected ){
        assertEquals(expected,MathUtility.getFactorial(n));
    }

}