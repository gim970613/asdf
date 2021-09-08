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
		
		System.out.print("시발 값을 입력해라 우매한 인간아  ");
		i=scanner.nextInt();
		System.out.print("다시한번 입력해라 병신아  ");
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
