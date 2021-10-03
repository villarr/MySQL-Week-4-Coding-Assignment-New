package com.gabrielvillarreal.sorting.model;

public class Cats {
	public Cats(String nom) {
		super();
		this.nom = nom;
	}

	private String nom;

	public String getNom() {
		return nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}

	public static int compareCats (Cats p1, Cats p2) {
		return p1.nom.compareTo(p2.nom);

	}

	}

