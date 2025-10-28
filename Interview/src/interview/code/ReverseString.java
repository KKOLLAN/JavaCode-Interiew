package interview.code;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {

//		String str = "Kiran Kumar";
//		StringBuilder reversed = new StringBuilder(str).reverse();
//		System.out.print(reversed);

//		ANother way

        String original = "Hello, World!";
        String reversed = new StringBuilder(original)
            .reverse()
            .toString();
        
        System.out.println("Reversed String: " + reversed);

//Another way
		String ar = "hello kiran kumar";
		Stream.of(ar).map(x -> new StringBuilder(x).reverse()).forEach(System.out::println);

//		Without stringBuilder

		String input = "java kiran";
		String reverseds = IntStream.range(0, input.length()).mapToObj(i -> input.charAt(input.length() - 1 - i))
				.map(String::valueOf)
//			.reduce("", String::concat);
				.collect(Collectors.joining());
		System.out.println(reverseds);

//	reverse string using for loop
		String str = "hello";
		String reversed1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed1 += str.charAt(i);

		}
		System.out.println(reversed1);
	}
}
