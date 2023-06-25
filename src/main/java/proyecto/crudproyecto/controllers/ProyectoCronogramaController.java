package proyecto.crudproyecto.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import proyecto.crudproyecto.entities.ProyectoCronograma;
import proyecto.crudproyecto.services.ProyectoCronogramaService;

import java.util.List;

@RestController
@RequestMapping("api/proyectocronograma")
@CrossOrigin( "*")
public class ProyectoCronogramaController {


    @Autowired
    private ProyectoCronogramaService proyectocronogramaService;



    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    @PostMapping("/crear")
    public ProyectoCronograma save(@RequestBody ProyectoCronograma entity){
        return proyectocronogramaService.save(entity);
    }
    //read
    @GetMapping("/listar/{id}")
    public ProyectoCronograma findById(@PathVariable long id){
        return proyectocronogramaService.findById(id);
    }
    @PutMapping("/actualizar")
    public ProyectoCronograma update(@RequestBody ProyectoCronograma entity) {
        return proyectocronogramaService.save(entity);
    }

    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable long id){
        ProyectoCronograma proyectocronograma = proyectocronogramaService.findById(id);
        proyectocronogramaService.delete(proyectocronograma);
    }

    @GetMapping("/listar")
    public List<ProyectoCronograma> findAll(){
        return (List<ProyectoCronograma>) proyectocronogramaService.findAll();
    }
}