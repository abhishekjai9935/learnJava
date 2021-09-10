package com.learning.problems;

public class OperatorAndAssignment {

    public static void operatorAndAssignmentLearning() {
        System.out.println(Float.NEGATIVE_INFINITY);
        System.out.println(Float.NaN + Float.NEGATIVE_INFINITY + Float.POSITIVE_INFINITY);
//        System.out.println(-10.0/0); //output -Infinity
//        System.out.println(10/0); // RE: ArithmeticException / by zero



//        System.out.println('a'+'b'); //output: 195
//        System.out.println('a' + 1); // output : 98
//        System.out.println('a' + 1.2); // output : 98.2  As char + double = max(int, char, double)

    /*Compile time error increment/decrement operator are not allowed on constants*/
//        int y = 10;
//        ++10;


       /* No error*/
//        int a = 10;
//        a++;
//        System.out.println(a);

      /*  No error*/
//        char ch = 'a';
//        ch++;
//        System.out.println("ch = "+ ch);


        /*Compile time error as no casting is done*/
//        char ch = 'a';
//        ch = ch + 1;
//        System.out.println("ch = "+ ch);
//
//        byte b = 10;
//        b = b +1 ;
//        System.out.println("b = "+ b);
    }
}
