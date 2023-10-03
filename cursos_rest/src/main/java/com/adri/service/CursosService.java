package com.adri.service;

import java.util.List;

import com.adri.model.Curso;

public interface CursosService {
    List<Curso> listar();
    Curso buscar(int codigo);
    List<Curso> agregar(Curso curso);
    List<Curso> eliminar(int codigo);
    void actualizar(int codigo, int duracion);
    List<Curso> listarPrecio(int min, int max);
}
