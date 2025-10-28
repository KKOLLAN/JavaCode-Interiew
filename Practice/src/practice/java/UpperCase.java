package practice.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {

	public static void main(String[] args) {
		String[] up = {"bhargav","kiran","krishna"};
		List<String> str = Arrays.asList(up);
		String str1 = str.stream().map(String::toUpperCase).collect(Collectors.joining(","));
		System.out.println(str1);
	}

}
