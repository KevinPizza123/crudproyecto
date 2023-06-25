package proyecto.crudproyecto.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.crudproyecto.entities.Informe;
import proyecto.crudproyecto.repository.InformeRepository;

import java.util.List;

@Service
public class InformeService {
    //atributo delimitador de acceso,tipo de dato,nombre del atributo
    @Autowired
    private InformeRepository informeRepository;

    //Crud
    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    public Informe save( Informe entity){
        return informeRepository.save(entity);
    }

    //read
    public Informe findById(long id){
        return informeRepository.findById(id).orElse(null);
    }
    //put

    //delete
    public void delete(Informe entity){
        informeRepository.delete(entity);
    }
    //traer todo

    public List findAll(){
        return (List) informeRepository.findAll();
    }


}