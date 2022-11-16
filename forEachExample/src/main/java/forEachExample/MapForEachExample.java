package forEachExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEachExample {

	public static void main(String[] args) {
		Map<Integer, Person> map =new HashMap<Integer, Person>();
		map.put(1,new Person("ABC", 24));
		map.put(2,new Person("PQR", 45));
		map.put(3,new Person("XYJ", 65));
		map.put(4,new Person("IJK", 24));
		map.put(5,new Person("LMN", 78));
		map.put(6,new Person("DEF", 30));
		
		System.out.println("using for Loop");
		for(Entry<Integer, Person> e: map.entrySet())
		{
			System.out.println(e.getKey()+"     "+e.getValue().getName() +":"+ e.getValue().getAge());
		}
		
		System.out.println("\n");
		System.out.println("With For Each");
		
		map.forEach((k,v) -> System.out.println(k+"     "+ v.getName()+":"+v.getName()));
	}

}
