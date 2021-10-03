package com.gabrielvillarreal.sorting.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.gabrielvillarreal.sorting.model.Cats;

public class CatStream {
	
	static List<Cats> cats = new ArrayList<Cats>(List.of(
			
			new Cats("Mary the cat"),
			new Cats("Bob the cat"),
			new Cats("Arif the cat"),
			new Cats("Huan the cat"),
			new Cats("Uri the cat"),
			new Cats("Magy the cat"),
			new Cats("Moss the cat"),
			new Cats("Ebbe the cat"),
			new Cats("Tse the cat"),
			new Cats("Gino the cat"),
			new Cats("Udi the cat"),
			new Cats("Kwee the cat"),
			new Cats("Shir the cat"),
			new Cats("Gao the cat"),
			new Cats("Erez the cat"),
			new Cats("Mona the cat"),
			new Cats("Eben the cat"),
			new Cats("Dung the cat"),
			new Cats("Hugo the cat"),
			new Cats("Ohad the cat"),
			new Cats("Giri the cat"),
			new Cats("Adas the cat"),
			new Cats("Shaw the cat"),
			new Cats("Duro the cat"),
			new Cats("Arve the cat")));
	
	
	public List<Cats> getCats() {
	return cats;
	}
	
	public static void main(String[] args) {
		//// @formatter:off
 

		String newCatString = cats.stream()
				.map(Object::toString)
				.sorted()
				.collect(Collectors.joining(", " + "\n"));
		
		System.out.println(newCatString);
		// @formatter:on
	}
	}

	


	