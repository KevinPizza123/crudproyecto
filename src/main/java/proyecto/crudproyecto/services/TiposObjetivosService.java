package proyecto.crudproyecto.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.crudproyecto.entities.TiposObjetivos;
import proyecto.crudproyecto.repository.TiposObjetivosRepository;

import java.util.List;

@Service
public class TiposObjetivosService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private TiposObjetivosRepository tiposobjetivosRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public TiposObjetivos save( TiposObjetivos entity){
        return tiposobjetivosRepository.save(entity);
    }

    //read
    public TiposObjetivos findById(long id){
        return tiposobjetivosRepository.findById(id).orElse(null);
    }
    //put

    //delete
    public void delete(TiposObjetivos entity){
        tiposobjetivosRepository.delete(entity);
    }
    //traer todo

    public List findAll(){
        return (List) tiposobjetivosRepository.findAll();
    }


}