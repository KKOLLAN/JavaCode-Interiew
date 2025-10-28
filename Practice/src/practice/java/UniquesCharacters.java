package practice.java;

import java.util.stream.Collectors;

public class UniquesCharacters {

	public static void main(String[] args) {

		String input = "stream";

		boolean allUnique = input.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() == input.length();
		System.out.println("all unique characters? : " + allUnique);
	}

}
