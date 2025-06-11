package com.khantse.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test  // tương đương vs hàm  main(), code trong hàm này sẽ run như hàm main()
           // biến mỗi test case thành test run, thành main()
    public void verifyFactoralGiveRigthArgORunsWell() {
        //0! có là 1 hay ko
        assertEquals(1,MathUtility.getFactorial(1));

    }
    @Test
    public void verifyFactoralGiveRigthArg2RunsWell() {
        assertEquals(2,MathUtility.getFactorial(2));
    }
    @Test
    public void verifyFactoralGiveRigthArg3RunsWell() {
        assertEquals(6,MathUtility.getFactorial(3));
    }
    @Test
    public void verifyFactoralGiveRigthArg4RunsWell() {
        assertEquals(24,MathUtility.getFactorial(4));
    }

}