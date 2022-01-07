package ch05;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	
	public static void main(String[] args) {
		java.util.List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.println(s));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(s->System.out.println(s));
		sList.stream().filter(s->s.length() >=5).forEach(s->System.out.println(s));
	}
}
