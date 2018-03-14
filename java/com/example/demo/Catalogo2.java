package com.example.demo;

import java.util.ArrayList;

public class Catalogo {

	private ArrayList<Libro> libros;

	public Catalogo() {

	}

	public Catalogo(ArrayList<Libro> libros) {
		this.libros = new ArrayList<>();
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
	public void añadirLibrosCatalogo(Libro libro) {
		if(libros.contains(libro)) {
			System.out.println("El libro" + libro + "ya se encuentra en la librería");
		}
		libros.add(libro);
	}
	
	public void eliminarLibrosCatalogo(Libro libro) {
		if(libros.contains(libro)) {
			libros.remove(libro);
		} else {
			System.out.println("Este libro no se encuentra en la librería");
		}
	}
	
	
	
	
}
