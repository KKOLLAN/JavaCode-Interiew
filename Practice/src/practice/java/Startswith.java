package practice.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Startswith {

	public static void main(String[] args) {
		List<String> starts = Arrays.asList("kiran", "bhargav", "kumar", "vamshi");
		List<String> str1 = starts.stream().filter(n -> n.startsWith("k")).collect(Collectors.toList());
		System.out.println(str1);
	}

}
