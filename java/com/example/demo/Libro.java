package com.example.demo;

import java.util.Comparator;

public class Libro {
	private String autor;
	private String titulo;
	private Editorial editorial;
	private int año;
	private int n_paginas;
	private String isbn;
	private int precio;
	private String categoria;
	
	public Libro() {
		
	}
	public Libro(String a, String t, Editorial e,int anio, int n,String i,int p,String c) {
		this.autor=a;
		this.titulo=t;
		this.editorial=e;
		this.año=anio;
		this.n_paginas=n;
		this.isbn=i;
		this.precio=p;
		this.categoria=c;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public int getN_paginas() {
		return n_paginas;
	}
	public void setN_paginas(int n_paginas) {
		this.n_paginas = n_paginas;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int compareAño(Object o) {
		Libro nuevo=(Libro) o;
		if(nuevo.año>this.año) {
			return -1;
		}
		else if(nuevo.año<this.año) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	

}
