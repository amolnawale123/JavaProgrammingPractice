package com.sap.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeapYear {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Year:");
			int year = Integer.parseInt(br.readLine());
			if(year%4==0){
				System.out.println("The given year is a leap year");
			}else {
				System.out.println("The given year is not a leap year");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
