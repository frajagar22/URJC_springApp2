package ELibreria.repository;

import java.util.List;
import ELibreria.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface editorialRepository extends JpaRepository<Editorial, Long> {
		
		//Obtiene la lista de libros con mismo nombre
		Editorial findByNombre(String nombreEditorial);
		
		//Obtiene la lista de todas las editoriales
		List<Editorial> findAll();
}

