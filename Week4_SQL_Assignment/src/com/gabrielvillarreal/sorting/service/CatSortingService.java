package com.gabrielvillarreal.sorting.service;

import java.util.Comparator;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.gabrielvillarreal.sorting.dao.CatSortingDao;
import com.gabrielvillarreal.sorting.model.Cats;

public class CatSortingService {
	private CatSortingDao sortDao = new CatSortingDao();
	
	public List<Cats> getCats (SortType type) {
		List<Cats> cats = sortDao.getCats();
		Comparator<Cats> comp = null;
		
		switch (type) {
		
		case ANONYMOUS_INNER_CLASS:
		comp = new Comparator<Cats>() {
				@Override
				public int compare(Cats cat1, Cats cat2) {
					return Cats.compareCats(cat1, cat2);
				}};
			break;
			
		case LAMBDA:
			comp = (c1, c2) -> Cats.compareCats(c1, c2);
			break;
			
		case METHOD_REFERENCE:
			comp = Cats :: compareCats;
			break;
			
		case NORMAL_CLASS:
			comp = new Mysort();
			break;
			
		default:
			throw new RuntimeException("Unhandled sort type:" + type);
		
		}
		cats.sort(comp);
		return cats;
	}
	static class Mysort implements Comparator<Cats> {

		@Override
		public int compare(Cats cat1, Cats cat2) {
			return Cats.compareCats(cat1, cat2);
		}
		
	}
}
