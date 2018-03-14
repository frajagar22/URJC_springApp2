import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.*;
public interface editorialRepository extends JpaRepository<Editorial, String> {
		
		//Obtiene la lista de libros con mismo nombre
		Editorial findByNombre(String nombreEditorial);
		
		//Obtiene la lista de todas las editoriales
		List<Libro> findAll();
	}
}
