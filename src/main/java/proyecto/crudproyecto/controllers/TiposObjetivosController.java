package proyecto.crudproyecto.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import proyecto.crudproyecto.entities.TiposObjetivos;
import proyecto.crudproyecto.services.TiposObjetivosService;

import java.util.List;

@RestController
@RequestMapping("api/tiposobjetivos")
@CrossOrigin( "*")
public class TiposObjetivosController {


    @Autowired
    private TiposObjetivosService tiposobjetivosService;



    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    @PostMapping("/crear")
    public TiposObjetivos save(@RequestBody TiposObjetivos entity){
        return tiposobjetivosService.save(entity);
    }
    //read
    @GetMapping("/listar/{id}")
    public TiposObjetivos findById(@PathVariable long id){
        return tiposobjetivosService.findById(id);
    }
    @PutMapping("/actualizar")
    public TiposObjetivos update(@RequestBody TiposObjetivos entity) {
        return tiposobjetivosService.save(entity);
    }

    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable long id){
        TiposObjetivos tiposobjetivos = tiposobjetivosService.findById(id);
        tiposobjetivosService.delete(tiposobjetivos);
    }

    @GetMapping("/listar")
    public List<TiposObjetivos> findAll(){
        return (List<TiposObjetivos>) tiposobjetivosService.findAll();
    }
}