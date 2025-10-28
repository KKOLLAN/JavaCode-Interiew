package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStream {

	public static void main(String[] args) {
//		Premetive data Type
		int[] arry = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(arry);
		intStream.forEach(System.out::print);

//				Object
		Integer[] object = { 1, 2, 2, 3 };
		Stream<Integer> integerStream = Stream.of(object);
		integerStream.forEach(System.out::println);

//		List
		List<Integer> intList = Arrays.asList(1,2,3,4);
		intList.stream().forEach(System.out::print);
	}

}
