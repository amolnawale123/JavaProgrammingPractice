package com.sap.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringExample3 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("£2,400,000");
		list1.add("£4,350,000");
		list1.add("£325,000");
		list1.add("£600,000");
		list1.add("£319,995");
		list1.add("£699,950");
		list1.add("£999,900");
		list1.add("£625,000");
		list1.add("£570,000");
		list1.add("£600,000");
		list1.add("£380,000");
		list1.add("£105,000");
		list1.add("£6,495,000");
		list1.add("£1,095,000");
		list1.add("£375,000");
		list1.add("£2,299,000");
		list1.add("£700,000");
		list1.add("£650,000");
		list1.add("£950,000");
		list1.add("£900,000");
		list1.add("£425,000");
		list1.add("£1,450,000");
		list1.add("£750,000");
		list1.add("£230,000");
		list1.add("£475,000");
		
		System.out.println("List before sorting : ");
		for(String str:list1) {
			System.out.println(str);
		}
		
		System.out.println();
		
		List<Long> longList = new ArrayList<>();
		
		for(String abc: list1) {
			abc = abc.replaceAll(",","");
			abc=abc.replaceAll("£","");
			longList.add(Long.parseLong(abc));
		}

		System.out.println("The new Long List is as below");
		for(Long def: longList) {
			System.out.println(def);
		}

		System.out.println();
		Collections.sort(longList, Collections.reverseOrder());
		System.out.println("List After Sorting in Descending Order");
		for(Long pqr:longList) {
			System.out.println(pqr);
		}
		
		System.out.println();
		System.out.println("The List after formating with commas is as below");
		List<String> newList = new ArrayList<>();
		String regex = "(\\d)(?=(\\d{3})+$)";
		for(Long def:longList) {
			newList.add("£"+String.valueOf(def).replaceAll(regex, "$1,"));
		}

		for(String abc:newList) {
			System.out.println(abc);
		}
	}

}
