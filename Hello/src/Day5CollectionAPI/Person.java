package Day5CollectionAPI;

import java.util.TreeSet;
import java.util.stream.Stream;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person() {

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name = " + name + " , age = " + age + " ] "	;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.name.compareTo(p.name);
	}

	
	
	
	
}
