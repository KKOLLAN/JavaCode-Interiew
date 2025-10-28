package practice.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWords {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Kiran", "Kumar", "Kiran", "Kumar", "Bhargav");

//		number of words in the list
		long inte = words.stream().count();
		System.out.println(inte);

//		Count the Number of repeated words
		Map<String, Long> counts = words.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		System.out.println(counts);
		
//		it will print repeated words
		counts.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + " =>" + entry.getValue()));
	}

}

