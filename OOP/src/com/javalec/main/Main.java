package com.javalec.main;

import java.util.Scanner;
import com.jajvalec.function.A;
import com.jajvalec.function.B;
import com.jajvalec.function.C;
import com.jajvalec.function.D;
import com.jajvalec.function.Eclass;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i=0,j=0;
		
		System.out.print("�ù� ���� �Է��ض� ����� �ΰ���  ");
		i=scanner.nextInt();
		System.out.print("�ٽ��ѹ� �Է��ض� ���ž�  ");
		j=scanner.nextInt();
		
		A a = new A(i,j);
		B b = new B(i,j);
		C c = new C(i,j);
		D d = new D(i,j);
		Eclass e =new Eclass(i,j);
		
		a.AAA();
		b.BBB();
		c.CCC();
		d.DDD();
		e.EEE();
		System.out.println("123");
		System.out.println("123");
		System.out.println("123");
		
		System.out.println("12341234");

	}

}
