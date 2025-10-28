package interview.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGroups {

	public static void main(String[] args) {

		String[] arr = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };

//Map to store sorted string as key and list of anagrams as value
Map<String, List<String>> map = new HashMap<>();

for(String str : arr) {
	char[] chars = str.toCharArray();
	Arrays.sort(chars);  //Sort character to get the key
	String key = new String(chars);
	
	map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
}
	

//Print only the groups which have more than one word
for(List<String> group: map.values()) {
	if(group.size()> 1) {
		System.out.println(group);
	}
}

		
//		another way
		
		Map<String, List<String>> map1 = Arrays.stream(arr).collect(Collectors.groupingBy(s -> {
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			return new String(chars);
		}));
		map1.values().stream().filter(group -> group.size() > 1).forEach(System.out::println);
	}
}
