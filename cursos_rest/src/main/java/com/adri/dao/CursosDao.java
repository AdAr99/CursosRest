package com.adri.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adri.model.Curso;

public interface CursosDao extends JpaRepository<Curso, Integer>{
    
    List<Curso> findByPrecioBetween(int min, int max);

}
