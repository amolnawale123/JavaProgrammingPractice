package com.sap.interview;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int num = 50;
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (isPrimeNumber(i)) {
				if (isPrimeNumber(num - i)) {
					System.out.println(num + " = " + i + " + " + (num - i));
					flag = true;
				}
			}
		}

		if (!flag) {
			System.out.println(num + " cannot be expressed as the sum of two prime numbers");
		}

	}

	public static boolean isPrimeNumber(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
