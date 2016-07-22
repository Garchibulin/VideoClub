/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
public class Plataforma  {

    
    private int idPlataforma;
    private String nombre;
    private String descripcion;
    
    public Plataforma() {
    }

    public Plataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public Plataforma(int idPlataforma, String nombre) {
        this.idPlataforma = idPlataforma;
        this.nombre = nombre;
    }

    public Integer getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
