package Day5CollectionAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		
//		Comparator<Person> compAge = (p1,p2) -> p1.getAge() - p2.getAge();
		
		TreeSet<Person> people = new TreeSet<>();
		people.add(new Person("Polo",21));
		people.add(new Person("Jack",25));
		people.add(new Person("Lili",23));
		
		Stream<Person> str = people.stream();
		
//		str.filter(s->s.contains("o")).forEach(System.out::println);
//		str.forEach(System.out::println);

//		str.filter(s->s.getAge()>21).forEach(s -> System.out.println(s.getName()));
		str.filter(s->s.getAge()>21).forEach(System.out::println);
		
	}

}
