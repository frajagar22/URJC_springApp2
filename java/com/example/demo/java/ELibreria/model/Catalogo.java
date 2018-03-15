package ELibreria.model;

import ELibreria.repository.*;

public class Catalogo {

	private LibroRepository libros;
	private editorialRepository editoriales;

	public Catalogo() {

	}

	public Catalogo(LibroRepository libros) {
		this.libros = libros;
	}
	
	public LibroRepository getLibros() {
		return libros;
	}

	public void setLibros(LibroRepository libros) {
		this.libros = libros;
	}

	public editorialRepository getEditoriales() {
		return editoriales;
	}

	public void setEditoriales(editorialRepository editoriales) {
		this.editoriales = editoriales;
	}


	
	
	
}
