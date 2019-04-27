package sampleTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Workspace\\testProject\\src\\test\\java\\sampleTest\\numbers.txt");
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Workspace\\testProject\\src\\test\\java\\sampleTest\\output.txt"));
		Scanner scanner = new Scanner(file);
		// LinkedList<String> lines = new LinkedList<>();
		List<LinkedList<String>> groups = new ArrayList<>();
		LinkedList<String> lines = new LinkedList<String>();
		groups.add(lines);
		while (scanner.hasNextLine()) {
			String currentLine = scanner.nextLine();
			if (currentLine.trim().length() == 0) {
				lines = new LinkedList<String>();
				groups.add(lines);
				continue;
			}
			lines.add(currentLine);
		}
		scanner.close();

		for (LinkedList lineGroup : groups) {
			Iterator<String> iterator = lineGroup.descendingIterator();
			while (iterator.hasNext()) {
				out.println(iterator.next());
			}
			out.println();
		}
		 out.close();
		

	}

}
