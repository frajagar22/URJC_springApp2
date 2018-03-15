package ELibreria.repository;

	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;
	import ELibreria.model.Libro;

	public interface LibroRepository extends JpaRepository<Libro, Long> {
		
		//Obtiene la lista de libros con mismo nombre
		Libro findByTitulo(String titulo);
		
		//Obtiene la lista de todos los libros 
		List<Libro> findAll();
		//Obtiene la lista de todos los libros de un autor
		List<Libro> findAllAutor(String autor);
		//Obtiene la lista de los libros de una categoria
		List<Libro> findAllCategoria(String categoria);
	}

