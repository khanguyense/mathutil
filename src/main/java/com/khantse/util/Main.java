package com.khantse.util;

import com.khantse.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          //
        verifyFactoralGiveRigthArgORunsWell();
        verifyFactoralGiveRigthArgO1RunsWell();
        verifyFactoralGiveRigthArgsRunsWell();
        }
        //TEST CASE #3
        public static void verifyFactoralGiveRigthArgsRunsWell(){
            System.out.println("2!= 2" + " ,actual: "+MathUtility.getFactorial(2));
            System.out.println("3!= 6" + " ,actual: "+MathUtility.getFactorial(3));
            System.out.println("4!= 24" + " ,actual: "+MathUtility.getFactorial(4));
            System.out.println("5!= 120" + " ,actual: "+MathUtility.getFactorial(5));
            System.out.println("6!= 720" + " ,actual: "+MathUtility.getFactorial(6));

        }
        // TEST CASE #2
    public static void verifyFactoralGiveRigthArgO1RunsWell(){
        int n = 1;
        long expected = 1; // hi vọng
        long actual = MathUtility.getFactorial(n);
        System.out.println("1!= expected "+expected + " ,actual: "+actual);


    }

        // TEST THỬ HÀM TÍNH GIAI THỪA, GỌI TRONG MAIN()
        // MUỐN TEST J DÓ THÌ PHẢI CÓ TEST CASE !!
        // TEST CASE # 1: VERIFY THE getFactorial() WITH N =0;
        // STEP:
        //    GIVEN n = 0
        //    GET CALL getFactorial(n= 0)
        // EXPECTED RESULTS :
        //          THE METHOD MUST RETURN 1 AS THE RESULTS OF O! = 1
        // STATUS : PASSED | FAILED PHẢI CHỜ

     public static void verifyFactoralGiveRigthArgORunsWell(){
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
         System.out.println("0!= expected "+expected + " ,actual: "+actual);


    }
}
// kĩ thuât vừa viết code vừa gõ test case vừa gõ test run đc gọi là tdd
//TDD( ĐƯA VÀO CV ) TEST DRIVEN DEVELOPER