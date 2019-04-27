package com.sap.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllEvenNumbers {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Number:");
			int num = Integer.parseInt(br.readLine());
			System.out.println("Even Numbers are:");
			for (int i=1;i<=num;i++){
				if(i%2==0){
					System.out.println(i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
