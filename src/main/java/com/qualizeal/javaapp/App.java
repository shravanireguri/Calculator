package com.qualizeal.javaapp;

import com.qualizeal.javaapp.mathematics.Addition;
import com.qualizeal.javaapp.mathematics.Subtraction;
import com.qualizeal.javaapp.mathematics.Multiplication;

public class App {
    public static void main(String[] args ) {
        Addition addition = new Addition();
		int add_ans = addition.add();
		System.out.println(add_ans);
		
		Subtraction subtraction = new Subtraction();
		int sub_ans = subtraction.subtract();
		System.out.println(sub_ans);
		
		Multiplication multiplication = new Multiplication();
		int mul_ans = multiplication.multiply();
		System.out.println(mul_ans);
    }
}
