package com.khantse.util.mathutil.core;

public class MathUtility {
    // CLASS NÀY DÙNG CÙNG CẤP CÁC HÀM TÍNH TOÁN TOÁN HỌC
    // BẮT CHỨC CLASS MATH. TRONG JDK
    // VÌ NHỮNG TÍNH TOÁN NÀY, TÍNH RỒI TRẢ RA, KO CẦN LƯU TRỮ LẠI
    // DO ĐÓ TA THIẾT KẾ NÓ DẠNG STATIC


    // TA LÀM HÀM TÍNH N! = 1.2.3.4.5...N
    // QUY ƯỚC:
    // 0! = 1 ( CỦA BÊN TOÁN HỌC)
    // KO CÓ GIAI THỪA CỦA SỐ ÂM, -51 KO HỢP LỆ
    // 20!

    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new  IllegalArgumentException("n must be between 0 and 20");
        }
        if(n == 0) {
            return 1;
        }
        // cpu chay đến dây tức là n=1,2,3,4,5,...19,20
        // tính n!=1.2.3.4.5... thuật toán con heo đất, ốc bu nhồi thịt ,...
        long result = 1;
        for(int i = 1;i <= n; i++){
            result *= i;
        }
        return result;
    }
}
