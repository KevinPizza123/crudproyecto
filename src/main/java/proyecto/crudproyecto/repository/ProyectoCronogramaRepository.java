package proyecto.crudproyecto.repository;

 import org.springframework.data.repository.CrudRepository;

import proyecto.crudproyecto.entities.ProyectoCronograma;

import java.util.List;
    
    public interface ProyectoCronogramaRepository extends CrudRepository<ProyectoCronograma, Long> {
    
        List<ProyectoCronograma> findAll();
    
    
    
    }
