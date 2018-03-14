package com.example.demo;

import java.util.Comparator;

public class OrdenarLibroPrecio implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getPrecio()-o2.getPrecio();
	}
	

}
