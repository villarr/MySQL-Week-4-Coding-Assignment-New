package com.gabrielvillarreal.sorting;

import java.util.List;

import com.gabrielvillarreal.sorting.model.Cats;
import com.gabrielvillarreal.sorting.service.CatSortingService;
import com.gabrielvillarreal.sorting.service.SortType;

public class CatsSorting {
	private CatSortingService sortService = new CatSortingService();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CatsSorting().run();
		
	}
	private void run() {
		// TODO Auto-generated method stub
		List<Cats> cats = sortService.getCats(SortType.ANONYMOUS_INNER_CLASS );
		print(cats, SortType.ANONYMOUS_INNER_CLASS);
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	private void print(List<Cats> cats, SortType type) {
		switch (type) {
		case ANONYMOUS_INNER_CLASS:
			for (Cats cat: cats) {
				System.out.println(cat.getNom());
			}
			break;
			
		case LAMBDA:
			cats.forEach(cat -> System.out.println(cat.getNom()));
			break;
			
		case METHOD_REFERENCE:
			cats.forEach(System.out::println);
			break;
			
		case NORMAL_CLASS:
			for (Cats cat: cats) {
				System.out.println(cat.getNom());
			}
			break;
			
		default:
			break;
		
	
		}
		
	}
}
