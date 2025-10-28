package interview.code;

public class Employee {

	private String name;
	private String city;
	private double salary;
	
	
	public Employee(String name, String city, double salary) {
		this.name=name;
		this.city=city;
		this.salary=salary;
		
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return "Employee{name='" + name + "', city='" + city + "', salary=" + salary + '}';
	}
	

}




//
//public class Main {
//    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(
//                new Employee("Alice", "New York", 120000),
//                new Employee("Bob", "New York", 150000),
//                new Employee("Charlie", "San Francisco", 130000),
//                new Employee("David", "San Francisco", 140000),
//                new Employee("Eve", "Los Angeles", 110000),
//                new Employee("Frank", "Los Angeles", 115000),
//                new Employee("Grace", "Chicago", 125000),
//                new Employee("Hank", "Chicago",yee::getCity))
//                .values()
//                .stream()
//                .map(list -> list.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null))
//                .collect(Collectors.toList()); 135000),
//                new Employee("Ivy", "Houston", 145000),
//                new Employee("Jack", "Houston", 155000)
//        );
//
//        List<Employee> highestPaidEmployees = employees.stream()
//                .collect(Collectors.groupingBy(Emplo
//
//        highestPaidEmployees.forEach(employee -> 
//                System.out.println("Name: " + employee.getName() + ", City: " + employee.getCity() + ", Salary: " + employee.getSalary())
//        );
//    }
//}
