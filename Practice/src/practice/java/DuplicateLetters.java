package practice.java;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateLetters {
public static void main(String[] args) {
	String str ="Programming";
	
	Map<Character, Long> dupli =str.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(w -> w, Collectors.counting()))
	.entrySet().stream().filter(e ->e.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	System.out.println(dupli);
}
}
