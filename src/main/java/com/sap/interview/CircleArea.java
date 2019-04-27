package com.sap.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CircleArea {

	public static void main(String[] args) {
		int rad=0;
		try{
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the radius of the circle: ");
			rad = Integer.parseInt(br1.readLine());
			double area = java.lang.Math.PI * rad * rad;
			System.out.println("Area of the Circle is :" + area);
			double perimeter = 2*java.lang.Math.PI*rad;
			System.out.println("Perimeter of Circle is :" + perimeter);
		}catch(Exception e){
			System.out.println("Error : "+ e);
		}
	}

}
