package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamExample {

	public static void main(String[] args) {
		System.out.println("Using File Reader :- ");
		try {
			FileReader read = new FileReader("D:\\Aurionpro Java 21\\61-Streams-Example\\test.txt");
			BufferedReader reader = new BufferedReader(read);

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("                                                                            ");

		System.out.println("Using Stream :- ");
		try (Stream<String> lines = Files.lines(Paths.get("D:\\Aurionpro Java 21\\61-Streams-Example\\test.txt"))) {
			lines.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
