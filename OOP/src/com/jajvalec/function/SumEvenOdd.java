package com.jajvalec.function;

import com.sun.net.httpserver.Authenticator.Result;

public class SumEvenOdd {
	
	//Field or Property
	int count = 0;
	//Constructor
	
	public SumEvenOdd() {
		
	}
	
	//Method
	
	public int sumCalc(int i ,int j) {// A function1
		int sum= 0;
		for(int x=i;x<=j;x++) {
			sum+=x;
		}
		return sum;
	}

	public String evenOdd(int i) {// B function2
		String result;
		int j=i%2;
		if(j==0) {
			result = "Â¦¼ö"; 
		}else {
			result = "È¦¼ö"; 			
		}
		return result;
	}
}
