package com.sap.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortArrayElementsByFrequency {

	static void sortArrayElementsByFrequency(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		
		ArrayList<Entry<Integer, Integer>> listOfEntry = new ArrayList<>(map.entrySet());
		Collections.sort(listOfEntry, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		System.out.println("Input Array : " + Arrays.toString(arr));

		System.out.println("Sorted Array Elements In Descending Order Of Their Frequency :");

		System.out.print("[ ");

		for (Entry<Integer, Integer> entry : listOfEntry) {
			int frequency = entry.getValue();

			while (frequency >= 1) {
				System.out.print(entry.getKey() + " ");

				frequency--;
			}
		}

		System.out.print("]");
	}

	public static void main(String[] args) {
		sortArrayElementsByFrequency(new int[] {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3});

	}

}
