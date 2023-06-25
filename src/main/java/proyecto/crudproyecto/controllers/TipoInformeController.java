package proyecto.crudproyecto.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import proyecto.crudproyecto.entities.TipoInforme;
import proyecto.crudproyecto.services.TipoInformeService;

import java.util.List;

@RestController
@RequestMapping("api/tipoinforme")
@CrossOrigin( "*")
public class TipoInformeController {


    @Autowired
    private TipoInformeService tipoinformeService;



    //crear
    //metod delimitador de acceso,tipo de dato que retorna,nombre del metodo/funcion
    @PostMapping("/crear")
    public TipoInforme save(@RequestBody TipoInforme entity){
        return tipoinformeService.save(entity);
    }
    //read
    @GetMapping("/listar/{id}")
    public TipoInforme findById(@PathVariable long id){
        return tipoinformeService.findById(id);
    }
    @PutMapping("/actualizar")
    public TipoInforme update(@RequestBody TipoInforme entity) {
        return tipoinformeService.save(entity);
    }

    @DeleteMapping("eliminar/{id}")
    public void delete(@PathVariable long id){
        TipoInforme tipoinforme = tipoinformeService.findById(id);
        tipoinformeService.delete(tipoinforme);
    }

    @GetMapping("/listar")
    public List<TipoInforme> findAll(){
        return (List<TipoInforme>) tipoinformeService.findAll();
    }
}