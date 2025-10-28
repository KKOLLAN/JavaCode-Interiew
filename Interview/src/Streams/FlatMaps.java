package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FlatMaps {

	public static void main(String[] args) {
		String[] str = { "kiran", "kumar", "hello" };
		List<String> map = Arrays.stream(str).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(map);
	

	List<List<String>> strflat = Arrays.asList(Arrays.asList("hello", "kiran"), Arrays.asList("kollana", "kumar"));
	List<String> flat = strflat.stream().flatMap(List::stream).map(Function.identity()).collect(Collectors.toList());
	System.out.println(flat);
	
	}
}
