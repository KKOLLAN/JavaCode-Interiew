package interview.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationsABC {
	
	public static void main(String[] args) {
		String input = "abc";

		List<String> perm = generatePermutations(input);
		perm.forEach(System.out::println);
	}

	private static List<String> generatePermutations(String input) {
		if (input.length() == 0) {
			return Arrays.asList("");
			
		}

		return input.chars().mapToObj(c -> (char) c)
				.flatMap(c -> generatePermutations(input.replaceFirst(String.valueOf(c), "")).stream().map(s -> c + s))
				.collect(Collectors.toList());
	}

}

