package interview.code;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapsFirstLetter {

	public static void main(String[] args) {
		String input = "Java stream Api is Power";
		String result = getFirstLetters(input);
		System.out.println(result);
	}

	private static String getFirstLetters(String sentence) {
//		if(sentence == null) return "";
		return Arrays.stream(sentence.split(" ")).filter(w -> !w.isEmpty()).map(w -> w.substring(0, 1).toUpperCase())
				.collect(Collectors.joining());

	}

}
