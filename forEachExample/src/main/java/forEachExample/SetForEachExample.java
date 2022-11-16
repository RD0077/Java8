package forEachExample;

import java.util.HashSet;
import java.util.Set;

public class SetForEachExample {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("ABC", 24));
		set.add(new Person("PQR", 45));
		set.add(new Person("XYJ", 65));
		set.add(new Person("IJK", 24));
		set.add(new Person("LMN", 78));
		set.add(new Person("DEF", 30));
		
		System.out.println("Without For Each");
		// without Java8
		for (Person p : set) {
			System.out.println(p.getName() + "   " + p.getAge());
		}
		
		System.out.println("\n");
		System.out.println("With For Each");
		// with for Each Method
		set.forEach(p -> System.out.println(p.getName() + "   " + p.getAge()));
		
		System.out.println("\n");
		System.out.println("Stream With For Each");
		
		set.stream().forEach(p -> System.out.println(p.getName() + "   " + p.getAge()));
		
	}
}
