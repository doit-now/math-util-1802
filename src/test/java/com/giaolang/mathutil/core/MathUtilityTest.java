package com.giaolang.mathutil.core;

import org.junit.jupiter.api.Test;

//IMPORT STATIC LÀ CÁCH KHAI BÁO TRƯỚC TÊN CLASS CHỨA HÀM STATIC
//ĐỂ Ở DƯỚI GỌI HÀM STACTIC NGẮN GỌN NHƯ BÊN PASCAL, C: GỌI HÀM KO CẦN DẤU CHẤM TÊN CLASS
//NẾU CÓ NHIỀU HÀM STATIC, THÌ TA CHỈ CẦN IMPORT STATIC TÊN CLASS.*
import static com.giaolang.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //CLASS XÀI BỘ THƯ VIỆN JUNIT, ĐC TẢI TRÊN MẠNG VỀ TỰ ĐỘNG BỞI MAVEN.
    //BỘ THƯ VIỆN JUNIT NÀY DÙNG ĐỂ TEST TỰ ĐỘNG CÁC HÀM CỦA CLASS CHÍNH
    //NÓ SẼ TỰ CHẠY KHI ĐÓNG GÓI APP, ĐỂ CHECK XEM CÁC HÀM CÓ CHẠY ĐÚNG KO
    //ĐÚNG TỨC LÀ EXPECTED == ACTUAL
    //NẾU CÓ NHIỀU TEST CASE, THÌ NÓ SẼ GOM STATUS CỦA CÁC TEST CASE LẠI THÀNH 2 MÀU XANH ĐỎ, MẮT DÂN DEV CHỈ CẦN NHÌN 2 MÀU XANH - PASSED
    //ĐỎ - FAILED MÀ KO CÀN NHÌN TỪNG TEST CASE COI PASSED HAY FAILED
    //Y CHANG CHO CÁC NGÔN NGỮ LẬP TRÌNH KHÁC - LÀ CHUẨN TEST CODE RỒI
    //BÔ THƯ VIỆN NÀY CÒN GỌI LÀ FRAMEWORK, JUNIT TESTING FRAMEWORK

    //TEST CASE #3: 5!
    @Test
    public void testFactorialGivenRightAgrument5ReturnsWell() {
        assertEquals(120, getFactorial(5));
        //                            5!  hy vọng trả vể 120
        //assert là hàm so 2 giá trị có == nhau hay ko, của thư viên JUnit
    }

    //TEST CASE #3: 4!
    @Test
    public void testFactorialGivenRightAgrument4ReturnsWell() {
        assertEquals(24, getFactorial(4));
        //                            4!  hy vọng trả vể 24
        //assert là hàm so 2 giá trị có == nhau hay ko, của thư viên JUnit
    }

    //TEST CASE #2: 1!
    @Test
    public void testFactorialGivenRightAgrument1ReturnsWell() {
        assertEquals(1, getFactorial(1));
        //                            1!  hy vọng trả vể 1
        //assert là hàm so 2 giá trị có == nhau hay ko, của thư viên JUnit
    }

    //TEST CASE #1: VERIFY GETFACTORIAL WITH N = 0, EXPECTED RESULT 0! = 1
    @Test
    public void testFactorialGivenRightAgrument0ReturnsWell() {
        int n = 0;                     //0!
        long expectedResult = 1;       //hy vọng trả về 1
        long actualResult = getFactorial(n); //thực tế sẽ là mấy

        //đi so sánh 2 giá trị coi expected == actual???
       // System.out.println( "Expected: " + expectedResult + " vs. Actual: " + actualResult);
        //System.out.println(expectedResult == actualResult); //true/false

        assertEquals(expectedResult, actualResult);
        //so sánh xem 2 đứa expected == actual ko???? nhưng ko viết sout()
        //hàm này của class thư viện JUnit
    }

}