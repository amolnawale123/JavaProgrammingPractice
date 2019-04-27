package com.sap.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ThirdLargestInArrayExample {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Integer a[] = new Integer[] {11,24,32,32,43,11,54,65,76,9,89};
		Integer a[] = new Integer[] {11,24,32,32,32,43,54,54,65,76,9,11,76,9,89,83,94,103};
		List<Integer> list= Arrays.asList(a);
		Collections.sort(list);
		System.out.println("The sorted list is: " + list);
		Set<Integer> set = new LinkedHashSet<>(list);
		for(Integer i: list) {
			set.add(i);
		}
		
		System.out.println("Set : " + set); 
		System.out.println("Size of the Set : "+set.size());
		
		Integer[] arr = new Integer[set.size()];
		int i=0;
		for(Integer x:set) {
			arr[i++]=x;
		}
		System.out.println("New Integer Array = "+Arrays.toString(arr));
		
		System.out.println("Fourth Largest number : "+ arr[arr.length-4]);
		 
	}

}
