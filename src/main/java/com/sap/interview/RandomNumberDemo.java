package com.sap.interview;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberDemo {

	public static void main(String[] args) {

		// Generating random integers between 0 and 50 using Random class
		System.out.println("Random integers between 0 and 50 using Random class :");
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(r.nextInt(50));
		}

		// Generating random integers between 0 and 50 using Math.random()
		System.out.println("Random integers between 0 and 50 using Math.random() :");
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.random() * 50);
		}

		// Generating random integers between 0 and 50 using ThreadLocalRandom
		System.out.println("Random integers between 0 and 50 using ThreadLocalRandom :");
		for (int i = 0; i < 5; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt(0, 50));
		}
	}

}
