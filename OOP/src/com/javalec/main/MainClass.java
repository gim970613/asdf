package com.javalec.main;

import com.jajvalec.function.SumEvenOdd;

//import com.javalec.function.function1
//import com.javalec.function.function2

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startNum = 1, endNum = 10;
		
		SumEvenOdd sumEvenOdd = new SumEvenOdd();
		int sum = sumEvenOdd.sumCalc(startNum, endNum);
		System.out.println(sum);
		String result = sumEvenOdd.evenOdd(sum);
		System.out.println(result);
	}

}
