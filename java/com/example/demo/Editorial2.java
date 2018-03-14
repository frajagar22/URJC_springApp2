package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Editorial {
	private String nombre;
	private int telefono;
	private String correo;
	private int codigo_postal;
	private String codigo_fiscal;
	private List<Libro> libros;
	
	public Editorial() {
		
	}
	public Editorial(String n,int t,String c,int cp,String cf) {
		this.nombre=n;
		this.telefono=t;
		this.correo=c;
		this.codigo_postal=cp;
		this.codigo_fiscal=cf;
		this.libros=new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	public String getCodigo_fiscal() {
		return codigo_fiscal;
	}
	public void setCodigo_fiscal(String codigo_fiscal) {
		this.codigo_fiscal = codigo_fiscal;
	}
	
	public void añadirLibros(Libro libro) {
		if(libros.contains(libro)) {
			System.out.println("El libro" + libro + "ya se encuentra en la librería");
		}
		libros.add(libro);
	}
	
	public void eliminarLibros(Libro libro) {
		if(libros.contains(libro)) {
			libros.remove(libro);
		} else {
			System.out.println("Este libro no se encuentra en la librería");
		}
	}
	
	public void ordenarAño() {
		Collections.sort(libros,new OrdenarLibroAño());
	}
	public void ordenarAutor() {
		Collections.sort(libros,new OrdenarPorAutor());
	}
	public void ordenarLibroPrecio() {
		Collections.sort(libros,new OrdenarLibroPrecio());
	}
	public void ordenarPorEditorial() {
		Collections.sort(libros,new OrdenarPorCategoria());
	}
	
	
	
	

}
