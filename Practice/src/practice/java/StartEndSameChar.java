package practice.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartEndSameChar {
	public static void main(String[] args) {
		String sentence = "apple anna cicic banana level";
		List<String> result = Arrays.stream(sentence.split(" "))
				.filter(word -> word.charAt(0) == word.charAt(word.length()-1)).collect(Collectors.toList());
		System.out.println("words stating and ending with same character: " + result);

	}
}
