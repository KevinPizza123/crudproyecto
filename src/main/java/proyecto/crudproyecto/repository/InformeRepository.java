package proyecto.crudproyecto.repository;



 import org.springframework.data.repository.CrudRepository;

import proyecto.crudproyecto.entities.Informe;

import java.util.List;
    
    public interface InformeRepository extends CrudRepository<Informe, Long> {
    
        List<Informe> findAll();
    
    
    
    }
