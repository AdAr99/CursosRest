package com.adri.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    private int codigo;
    private String nombre;
    private int duracion;
    private int precio;
   
    public Curso() {
    }

    public Curso(int codigo) {
        this.codigo = codigo;
    }

    public Curso(int codigo, String nombre, int duracion, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    
    
}
