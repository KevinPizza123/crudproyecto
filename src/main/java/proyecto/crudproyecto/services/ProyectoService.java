package proyecto.crudproyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.crudproyecto.entities.Proyecto;
import proyecto.crudproyecto.repository.ProyectoRepository;

import java.util.List;

@Service
public class ProyectoService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private ProyectoRepository proyectoRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public Proyecto save( Proyecto entity){
        return proyectoRepository.save(entity);
    }

    //read
    public Proyecto findById(long id){
        return proyectoRepository.findById(id).orElse(null);
    }
    //put

    //delete
    public void delete(Proyecto entity){
        proyectoRepository.delete(entity);
    }
    //traer todo

    public List findAll(){
        return (List) proyectoRepository.findAll();
    }


}