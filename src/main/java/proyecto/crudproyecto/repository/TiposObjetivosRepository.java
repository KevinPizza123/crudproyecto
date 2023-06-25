package proyecto.crudproyecto.repository;


 import org.springframework.data.repository.CrudRepository;

import proyecto.crudproyecto.entities.TiposObjetivos;

import java.util.List;
    
    public interface TiposObjetivosRepository extends CrudRepository<TiposObjetivos, Long> {
    
        List<TiposObjetivos> findAll();
    
    
    
    }
