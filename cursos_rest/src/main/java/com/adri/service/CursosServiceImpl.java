package com.adri.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adri.dao.CursosDao;
import com.adri.model.Curso;

/**
 * Clase encargada de realizar el CRUD
 * 
 * @param listar() Listamos todos los cursos
 * @param buscar Buscamos un curso por el codigo
 * @param agregar Agregamos un curso entero
 * @param eliminar Eliminamos un curso entero
 * @param actualizar Actualizamos la duracion del curso mediante su cosigo
 * @param listarPrecio Listamos solo los cursos que esten entre los dos precios pasados
 */

@Service
public class CursosServiceImpl implements CursosService {

    @Autowired
    CursosDao dao;

    @Override
    public List<Curso> listar() {
        return dao.findAll();
    }

    @Override
    public Curso buscar(int codigo) {
        
        return dao.findById(codigo).orElse(null);
    }

    @Override
    public List<Curso> agregar(Curso curso) {
       
        dao.save(curso);

        return dao.findAll();
    }

    @Override
    public List<Curso> eliminar(int codigo) {
        
        dao.deleteById(codigo);
        
        return dao.findAll();
    }

    @Override
    public void actualizar(int codigo, int duracion) {

        Curso cursoAct = buscar(codigo);
        cursoAct.setDuracion(duracion);
        dao.save(cursoAct);
    }

    @Override
    public List<Curso> listarPrecio(int min, int max) {
        return dao.findByPrecioBetween(min, max);
    }
    
}
