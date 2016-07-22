/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Tematica  {

    private int idTematica;
    private String nombre;
    private String descripcion;
    
    public Tematica() {
    }

    public Tematica(int idTematica) {
        this.idTematica = idTematica;
    }

    public Tematica(int idTematica, String nombre) {
        this.idTematica = idTematica;
        this.nombre = nombre;
    }

    public int getIdTematica() {
        return idTematica;
    }

    public void setIdTematica(int idTematica) {
        this.idTematica = idTematica;
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
