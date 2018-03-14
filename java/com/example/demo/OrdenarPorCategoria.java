package com.example.demo;

import java.util.Comparator;

public class OrdenarPorCategoria implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getCategoria().compareTo(o2.getCategoria());
	}

}
