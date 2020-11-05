package com.sap.interview;

import java.lang.reflect.Array;

public class TestArray {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 4,5 };
		int[] y = new int[x.length];
		int prod = x[0] * x[1] * x[2] * x[3] *x[4];
		System.out.println(prod);

		for (int i = 0; i < x.length; i++) {
			y[i] = prod / x[i];
		}

		for (int j = 0; j < y.length; j++) {
			System.out.print(y[j]+" ");
		}

	}

}
