package proyecto.crudproyecto.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import proyecto.crudproyecto.entities.Informe;
import proyecto.crudproyecto.services.InformeService;

import java.util.List;

@RestController
@RequestMapping("api/informe")
@CrossOrigin( "*")
public class InformeController {


    @Autowired
    private InformeService informeService;



    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    @PostMapping("/crear")
    public Informe save(@RequestBody Informe entity){
        return informeService.save(entity);
    }
    //read
    @GetMapping("/listar/{id}")
    public Informe findById(@PathVariable long id){
        return informeService.findById(id);
    }
    @PutMapping("/actualizar")
    public Informe update(@RequestBody Informe entity) {
        return informeService.save(entity);
    }

    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable long id){
        Informe informe = informeService.findById(id);
        informeService.delete(informe);
    }

    @GetMapping("/listar")
    public List<Informe> findAll(){
        return (List<Informe>) informeService.findAll();
    }
}