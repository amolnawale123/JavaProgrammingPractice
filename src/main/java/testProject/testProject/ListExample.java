package testProject.testProject;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List <String> strList = new ArrayList<String>();
		strList.add("Amol");
		strList.add("Ashwini");
		strList.add("Sachin");
		strList.add("Kedar");
		strList.add("Vandana");
		strList.add("Deepti");
		strList.add("Amit");

		System.out.println(strList.contains("Ameet"));
	}

}
