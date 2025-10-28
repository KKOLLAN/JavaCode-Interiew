package interview.code;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " - " + age;
	}
}

public class AlternativeGrouping {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Alice", 35),
				new Person("Charlie", 40), new Person("Bob", 28), new Person("Alice", 32));

		List<Person> sortedList = people.stream().collect(Collectors.groupingBy(p -> p.name)).entrySet().stream()
				.sorted(Map.Entry.comparingByKey()) // sort names alphabetically
				.flatMap(entry -> entry.getValue().stream().sorted((p1, p2) -> Integer.compare(p2.age, p1.age))) // sort
																													// by
																													// age
																													// descending
				.collect(Collectors.toList());

		sortedList.forEach(System.out::println);
	}
}
