package sampleTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Workspace\\testProject\\src\\test\\java\\sampleTest\\input.txt");
		@SuppressWarnings("resource")
		PrintWriter out = new PrintWriter(
				new FileWriter("C:\\Workspace\\testProject\\src\\test\\java\\sampleTest\\output2.txt"));
		Scanner scanner = new Scanner(file);
		LinkedList<String> lines = new LinkedList<>();
		while (scanner.hasNextLine()) {
			String currentLine = scanner.nextLine();
			String[] arr = currentLine.split("\\|");
			Collections.reverse(Arrays.asList(arr));
			String line = "";
			for (int i = 0; i < arr.length; i++) {
				line = line + arr[i] + "|";
			}
			lines.add(line);
		}
		scanner.close();
		for (String line : lines) {
			// Iterator<String> iterator = lines.iterator();
			while (line.length() != 0) {
				out.println(line);
			}
		}
		out.close();

	}

}
