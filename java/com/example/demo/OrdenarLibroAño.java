package com.example.demo;

import java.util.Comparator;

public class OrdenarLibroAño implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getAño()-o2.getAño();
	}

}
