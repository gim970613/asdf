package com.javalec.base;

public class OOP_1 {

	public static void main(String[] args) {
		//1~10까지의 합을 구하여 출력하고 , 그 합이 짝수 인지 홀수 인지 판별
		
		//절차식 프로그래밍
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("1~10의 합 : "+ sum);
		
		if(sum %2==0)System.out.println("짝수");
		else System.out.println("홀수");
		
		
		
	}

}
