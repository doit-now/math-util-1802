package com.giaolang;


import com.giaolang.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightAgrument0ReturnsWell();
        testFactorialGivenRightAgrument1ReturnsWell();
        testFactorialGivenRightAgrument5ReturnsWell();
        testFactorialGivenWrongArgumentMinus1ThrowsException();
    }

    public static void testFactorialGivenWrongArgumentMinus1ThrowsException()
    {
        MathUtility.getFactorial(-1);
        //chạy hàm này, thấy ngoại lệ bung ra, mừng rơi nước mắt
        //vì đưa -1 mà hàm ném ngoại lệ nghĩa là hàm chạy đúng do data cà chớn
        //hàm đc thiết kế là n âm thì ném ngoại lệ
        //vậy giờ nếu đưa -1 mà ném ngoại lệ -> HÀM OKIE
    }



    //hàm kiểm thử code chính của mình, hàm này dân dev dùng để test code chính, code chính chính là hàm getFactorial() bên .core
    //Tên hàm kiểm thử mang luôn ý nghĩa của test case
    //ví dụ dưới này: cho tham số tử tế RightArg 0 thì hàm phải chạy ngon runs well
    public static void testFactorialGivenRightAgrument0ReturnsWell() {
        int n = 0;                     //0!
        long expectedResult = 1;       //hy vọng trả về 1
        long actualResult = MathUtility.getFactorial(n); //thực tế sẽ là mấy

        //đi so sánh 2 giá trị coi expected == actual???
        System.out.println( "Expected: " + expectedResult + " vs. Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); //true/false
    }

    public static void testFactorialGivenRightAgrument1ReturnsWell() {
        int n = 1;                     //1!
        long expectedResult = 1;       //hy vọng trả về 1
        long actualResult = MathUtility.getFactorial(n); //thực tế sẽ là mấy

        //đi so sánh 2 giá trị coi expected == actual???
        System.out.println( "Expected: " + expectedResult + " vs. Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); //true/false
    }

    public static void testFactorialGivenRightAgrument5ReturnsWell() {
        int n = 5;                     //1!
        long expectedResult = 120;       //hy vọng trả về 1
        long actualResult = MathUtility.getFactorial(n); //thực tế sẽ là mấy

        //đi so sánh 2 giá trị coi expected == actual???
        System.out.println( "Expected: " + expectedResult + " vs. Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); //true/false
    }


    //DÂN DEV PHẢI TEST CODE CỦA CHÍNH HỌ.
    //HỌ TEST CODE CỦA HỌ NHƯ THẾ NÀO?
    //TRƯƯỚC KHI TEST (TEST RUN) THÌ CẦN CÓ TEST CASE
    //TEST CASE #1
    //CHECK GETFACTORIAL() WITH N = 0
    //STEPS:
    //(1) GIVEN N = 0;
    //(2) CALL GETFACTORAL(0)
    //EXPECTED RESULT/VALUE: 1

    //TEST CASE #2
    //CHECK GETFACTORIAL() WITH N = 1
    //STEPS:
    //(1) GIVEN N = 1;
    //(2) CALL GETFACTORAL(1)
    //EXPECTED RESULT/VALUE: 1

    //TEST CASE #3
    //CHECK GETFACTORIAL() WITH N = 5
    //STEPS:
    //(1) GIVEN N = 5;
    //(2) CALL GETFACTORAL(5)
    //EXPECTED RESULT/VALUE: 120

    //TEST CASE #4
    //CHECK GETFACTORIAL() WITH N = -1
    //STEPS:
    //(1) GIVEN N = -1;
    //(2) CALL GETFACTORAL(-1)
    //EXPECTED RESULT/VALUE: AN EXCEPTION IS THROWN

    //TEST CASE #5
    //CHECK GETFACTORIAL() WITH N = 21
    //STEPS:
    //(1) GIVEN N = 21;
    //(2) CALL GETFACTORAL(21)
    //EXPECTED RESULT/VALUE: AN EXCEPTION IS THROWN

}