package interview.code;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {

	public static void main(String[] args) {
	String input = "kollana kiran kumar";
	System.out.println("Inpu:" +input);
	
	String longest = Arrays.stream(input.split(" "))
			.max(Comparator.comparingInt(String::length))
					.orElse(" ");
	System.out.println("Output:" + longest);

	}

}


