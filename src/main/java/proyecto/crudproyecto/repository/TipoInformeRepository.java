package proyecto.crudproyecto.repository;

 import org.springframework.data.repository.CrudRepository;

import proyecto.crudproyecto.entities.TipoInforme;

import java.util.List;
    
    public interface TipoInformeRepository extends CrudRepository<TipoInforme, Long> {
    
        List<TipoInforme> findAll();
    
    
    
    }
