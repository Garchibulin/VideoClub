/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Clasificacion  {

    
    private int idClasificacion;
    private String nombre;
    private String descripcion;

    public Clasificacion() {
    }

    public Clasificacion(int idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public Clasificacion(int idClasificacion, String nombre) {
        this.idClasificacion = idClasificacion;
        this.nombre = nombre;
    }

    public int getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(int idClasificacion) {
        this.idClasificacion = idClasificacion;
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
