package com.gabrielvillarreal.sorting.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

import com.gabrielvillarreal.sorting.dao.CatSortingDao;
import com.gabrielvillarreal.sorting.model.Cats;

public class CatsOptional {
	private static CatSortingDao dao =  new CatSortingDao();
	private static Optional<Cats> cat = Optional.ofNullable(new Cats("Henry"));
	private static Optional<Cats> cat2 = Optional.empty();
/*
 * 
 * 
 * 	
 */
	
	
	public static void main(String[] args) throws NoSuchElementException {
		catMethod(cat2);
		catMethod2(cat);
}
/*
 * 
 * 
 * 	
 */
	
	public static Cats catMethod (Optional<Cats> optional) {
		if (cat.isPresent()) {
		System.out.println("There is a cat here named " + cat.get() + "!");	
		}
		else {
			System.out.println(optional.orElseThrow());
		}
		return null;
	}
	public static Optional<Cats> catMethod2 (Optional<Cats> optional) throws NoSuchElementException {
		if (catMethod(cat2) != null) {
		System.out.println("There is a cat here named " + cat + "!");	
		}
		else if (optional.empty() != null) {
			throw new NoSuchElementException("This is an empty cat");
			
		}
		return null;
	}
}