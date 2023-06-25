package proyecto.crudproyecto.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.crudproyecto.entities.ProyectoCronograma;
import proyecto.crudproyecto.repository.ProyectoCronogramaRepository;

import java.util.List;

@Service
public class ProyectoCronogramaService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private ProyectoCronogramaRepository proyectocronogramaRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public ProyectoCronograma save( ProyectoCronograma entity){
        return proyectocronogramaRepository.save(entity);
    }

    //read
    public ProyectoCronograma findById(long id){
        return proyectocronogramaRepository.findById(id).orElse(null);
    }
    //put

    //delete
    public void delete(ProyectoCronograma entity){
        proyectocronogramaRepository.delete(entity);
    }
    //traer todo

    public List findAll(){
        return (List) proyectocronogramaRepository.findAll();
    }


}