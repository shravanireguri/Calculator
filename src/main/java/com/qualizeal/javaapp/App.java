package com.qualizeal.javaapp;

import com.qualizeal.javaapp.mathematics.Addition;

public class App {
    public static void main(String[] args ) {
        Addition addition = new Addition();
		int ans = addition.add();
		System.out.println(ans);
    }
}
