package com.sap.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int i=1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Number:");
			int num = Integer.parseInt(br.readLine());
			while(i<=10){
				System.out.println(num+" X "+i+" = "+(num*i));
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
