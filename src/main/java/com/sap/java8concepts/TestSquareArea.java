package com.sap.java8concepts;


interface Square{
	int calculate(int x);
	
}

public class TestSquareArea {

	public static void main(String[] args) {

		int a=5;
		Square sq = x->x*x;
		
		int area = sq.calculate(a);
		System.out.println(area);
		
		
	}

}
