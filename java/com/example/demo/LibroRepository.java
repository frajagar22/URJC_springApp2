
public class LibroRepository {

	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;


	public interface LibroRepository extends JpaRepository<Libro, Long> {
		
		//Obtiene la lista de libros con mismo nombre
		Libro findByNombreLibro(String nombreLibro);
		
		//Obtiene la lista de todos los libros 
		List<Libro> findAll();
		//Obtiene la lista de todos los libros de un autor
		List<Libro> findAllLibrosAutor(String nombreAutor);
		//Obtiene la lista de los libros de una categoria
		List<Libro> findAllCategoria(String categoria);
	}
}
