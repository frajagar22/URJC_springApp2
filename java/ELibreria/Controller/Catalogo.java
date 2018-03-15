package ELibreria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ELibreria.repository.*;

@Controller
public class Catalogo {
	// Conjunto de libros del catalogo
	@Autowired
	private LibroRepository libros;
	// Conjunto de editoriales del catalogo
	@Autowired
	private editorialRepository editoriales;
	
	

	
	
	
}
