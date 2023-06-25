package proyecto.crudproyecto.repository;


 import org.springframework.data.repository.CrudRepository;

import proyecto.crudproyecto.entities.Proyecto;

import java.util.List;
    
    public interface ProyectoRepository extends CrudRepository<Proyecto, Long> {
    
        List<Proyecto> findAll();
    
    
    
    }
