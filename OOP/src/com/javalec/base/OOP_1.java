package com.javalec.base;

public class OOP_1 {

	public static void main(String[] args) {
		//1~10������ ���� ���Ͽ� ����ϰ� , �� ���� ¦�� ���� Ȧ�� ���� �Ǻ�
		
		//������ ���α׷���
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("1~10�� �� : "+ sum);
		
		if(sum %2==0)System.out.println("¦��");
		else System.out.println("Ȧ��");
		
		
		
	}

}
