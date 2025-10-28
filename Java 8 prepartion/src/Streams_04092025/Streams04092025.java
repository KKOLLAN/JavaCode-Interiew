package Streams_04092025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams04092025 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 32, 12, 1, 4, 1, 45, 214, 45);
		List<Integer> even = numbers.stream().distinct().filter(s -> s % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		List<String> names = Arrays.asList("vamsi", "sunitha", "ravi", "deepu");
		List<String> uppercase = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercase);

		Integer sumofsquares = numbers.stream().map(s -> s * s).reduce(0, Integer::sum);
		System.out.println(sumofsquares);

		Map<Integer, List<String>> grouped = names.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(grouped);

		List<String> startswith = names.stream().filter(s -> s.startsWith("v")).collect(Collectors.toList());
		System.out.println(startswith);

		// Sort Strings by Length
		List<String> lenght = names.stream().sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		System.out.println(lenght);

		// Count Frequency of Each Word
		Map<String, Long> count = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);

		// flatmap
		List<List<String>> nested = Arrays.asList(Arrays.asList("e", "b"), Arrays.asList("c", "v"), Arrays.asList("e"));
		List<String> flat = nested.stream().flatMap(List::stream).sorted().collect(Collectors.toList());
		System.out.println(flat);

		Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(partitioned);

		// Convert List of Strings to a Comma-Separated String
		String comma = names.stream().collect(Collectors.joining(","));
		System.out.println(comma);

		OptionalInt max = numbers.stream().mapToInt(i -> i).max();
		System.out.println(max);

		Long len = names.stream().filter(s -> s.length() > 3).count();
		System.out.println(len);

		String n = "vamsi bhargav";
		long uniquecount = n.chars().distinct().count();
		System.out.println(uniquecount);

		// uniuqe numbers
		Map<String, List<Integer>> uniquenumbers = numbers.stream()
				.collect(Collectors.groupingBy(v -> v % 2 == 0 ? "even" : "odd"));
		System.out.println(uniquenumbers);

		// Sort a List of Strings in Reverse Alphabetical Order
		List<String> sortednames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortednames);
	}

}
