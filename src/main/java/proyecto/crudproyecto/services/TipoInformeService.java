package proyecto.crudproyecto.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.crudproyecto.entities.TipoInforme;
import proyecto.crudproyecto.repository.TipoInformeRepository;

import java.util.List;

@Service
public class TipoInformeService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private TipoInformeRepository tipoinformeRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public TipoInforme save( TipoInforme entity){
        return tipoinformeRepository.save(entity);
    }

    //read
    public TipoInforme findById(long id){
        return tipoinformeRepository.findById(id).orElse(null);
    }
    //put

    //delete
    public void delete(TipoInforme entity){
        tipoinformeRepository.delete(entity);
    }
    //traer todo

    public List findAll(){
        return (List) tipoinformeRepository.findAll();
    }


}