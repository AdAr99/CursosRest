package com.adri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adri.model.Curso;
import com.adri.service.CursosService;

@RestController
public class CursosController {
    
   
    @Autowired
    CursosService service;

    @GetMapping(value="curso", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> listar(){
        return service.listar();
    }

    /**
     * @param codigo
     * 
     */
    @GetMapping(value="curso/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso buscar(@PathVariable int codigo){

        return service.buscar(codigo);
    }

    /**
     * @param curso
     * @return
     */
    @PostMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> agregar(@RequestBody Curso curso){
        return service.agregar(curso);
    }

    /**
     * @param codigo
     * @return
     */
    @DeleteMapping(value="curso/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> eliminar(@PathVariable int codigo){
        return service.eliminar(codigo);
    }

    /**
     * @param codigo
     * @param duracion
     */
    @PutMapping(value = "curso/{codigo}/{duracion}")
    public void actualizar(@PathVariable int codigo,@PathVariable int duracion){
        service.actualizar(codigo, duracion);
    }

    /**
     * @param min
     * @param max
     * @return
     */
    @GetMapping(value="curso/{min}/{max}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> listarPrecio(@PathVariable int min,@PathVariable int max){
        return service.listarPrecio(min, max);
    }
}
