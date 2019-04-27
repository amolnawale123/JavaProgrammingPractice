package com.sap.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RectangleArea {

	public static void main(String[] args) {
		int len = 0;
		int wid = 0;
		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the length of the rectangle: ");
			len = Integer.parseInt(br1.readLine());

			System.out.println("Enter the width of the rectangle: ");
			wid = Integer.parseInt(br1.readLine());

			int area = len * wid;
			System.out.println("Area of the Rectangle is :" + area);
			int perimeter = 2 * (len + wid);
			System.out.println("Perimeter of Rectangle is :" + perimeter);
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}

	}

}
