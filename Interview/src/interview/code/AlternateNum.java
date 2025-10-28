package interview.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AlternateNum {

	public static void main(String[] args) {
		int ap[] = { 1, 2, 4, 5, 3, 3, 4, 5, 6, 7, 8, 9, 10 };

		IntStream.range(0, ap.length).filter(i -> i % 2 == 0).map(i -> ap[i]).forEach(System.out::println);

//		even number
		List<Integer> alt = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6, 73, 36, 3);
		List<Integer> even = alt.stream().filter(i -> i % 2 == 0).toList();
		System.out.println(even);

	}

}
