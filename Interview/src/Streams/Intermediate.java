package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intermediate {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<String> name = Arrays.asList("kiran", "kumar", "ravi");

//		filter
		number.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

//	map: it will transform the data A to a
		List<String> upper = name.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upper);

//	Reduce : reduce it to one element, after the operation it will cut across the swim lane
//		its a terminal operation because it print some output.
//		
//		reduce() returns a single value (like Integer), not a stream.
//		You cannot call .forEach() on an Integer.
		Integer sum = number.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		List<Integer> inp = number.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(inp);
	}

}
