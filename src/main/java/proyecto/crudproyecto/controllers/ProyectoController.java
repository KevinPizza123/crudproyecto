package proyecto.crudproyecto.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import proyecto.crudproyecto.entities.Proyecto;
import proyecto.crudproyecto.services.ProyectoService;

import java.util.List;

@RestController
@RequestMapping("api/proyecto")
@CrossOrigin( "*")
public class ProyectoController {


    @Autowired
    private ProyectoService proyectoService;



    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    @PostMapping("/crear")
    public Proyecto save(@RequestBody Proyecto entity){
        return proyectoService.save(entity);
    }
    //read
    @GetMapping("/listar/{id}")
    public Proyecto findById(@PathVariable long id){
        return proyectoService.findById(id);
    }
    @PutMapping("/actualizar")
    public Proyecto update(@RequestBody Proyecto entity) {
        return proyectoService.save(entity);
    }

    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable long id){
        Proyecto proyecto = proyectoService.findById(id);
        proyectoService.delete(proyecto);
    }

   @GetMapping("/listar")

    public List<Proyecto> findAll() {
        return proyectoService.findAll();
    }
}