package interview.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {

	public static void main(String[] args) {
		String[] str1 = { "kiran", "kumar", "kiran", "human", "human" };
		
//		number of words count
		List<String> str = Arrays.asList(str1);
		Map<String, Long> count = str.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count);

//	most frequest word in List
		List<String> maxrep = Arrays.asList("hello", "iam hello", "hello");
		String mostFrequesnt = maxrep.stream().flatMap(s -> Arrays.stream(s.split(" ")))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println(mostFrequesnt);

//  FInd the most repeated word in the sentence
		String sentence = "This is is is is is a test sentence and this test is just a test";

		String mostRepeatedWord = Arrays.stream(sentence.toLowerCase().split(" "))
				.collect(Collectors.groupingBy(word -> word, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println("Most repeated word:" + mostRepeatedWord);
	}

}
