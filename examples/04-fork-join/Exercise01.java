// =================================================================
//
// File: Exercise01.java
// Authors: 
// Description: This file contains the code to count the number of
//				even numbers within an array using Java's Fork-Join 
//				technology.
//
// Copyright (c) 2023 by Tecnologico de Monterrey.
// All Rights Reserved. May be reproduced for any non-commercial
// purpose.
//
// =================================================================

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class Exercise01 extends RecursiveTask<Integer> {
	private static final int SIZE = 100_000_000;
	private static final int MIN = 10_000;
	private int array[], start, end;

	public Exercise01(int start, int end, int array[]) {
		this.array = array;
		// place your code here
	}

	// place your code here

	public static void main(String args[]) {
		int array[] = new int[SIZE];
		int result = 0;
		long startTime, stopTime;
		double elapsedTime = 0;
		ForkJoinPool pool;

		Utils.fillArray(array);
		Utils.displayArray("array", array);

		elapsedTime = 0;
		System.out.printf("Starting...\n");
		for (int i = 0; i < Utils.N; i++) {
			startTime = System.currentTimeMillis();

			// place your code here

			stopTime = System.currentTimeMillis();

			elapsedTime += (stopTime - startTime);
		}
		System.out.printf("result = %d\n", result);
		System.out.printf("avg time = %.5f ms\n", (elapsedTime / Utils.N));
	}
}
