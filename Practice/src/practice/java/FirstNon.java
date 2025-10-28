package practice.java;

import java.util.Map;
import java.util.stream.Collectors;

public class FirstNon {

	public static void main(String[] args) {
	String str = "SWISS";
//	Character chars = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(w -> w,Collectors.counting()))
//	.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
//	System.out.println(chars);
	
	Character chr = str.chars().mapToObj(c ->(char)c).filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch)).findFirst().orElse(null);
	System.out.println(chr);

	
	
}
}
