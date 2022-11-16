package forEachExample;

import java.util.ArrayList;
import java.util.List;

public class ForEachWxample {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("ABC", 24));
		list.add(new Person("PQR", 45));
		list.add(new Person("XYJ", 65));
		list.add(new Person("IJK", 24));
		list.add(new Person("LMN", 78));
		list.add(new Person("DEF", 30));
		System.out.println("Without For Each");
		// without Java8
		for (Person p : list) {
			System.out.println(p.getName() + "   " + p.getAge());
		}
		System.out.println("\n");
		System.out.println("With For Each");
		// with for Each Method
		list.forEach(p -> System.out.println(p.getName() + "   " + p.getAge()));
		
		System.out.println("\n");
		System.out.println("Stream With For Each");
		
		list.stream().forEach(p -> System.out.println(p.getName() + "   " + p.getAge()));
	}

}
