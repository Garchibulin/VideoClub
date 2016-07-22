/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Videojuego  {

    
    private int idVideojuego;
    private int idTematica;
    private int idPlataforma;
    private int idClasificacion;
    private int idEstadoProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    
    

    public Videojuego() {
    }

    public Videojuego(Integer idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public Videojuego(Integer idVideojuego, String nombre, double precio) {
        this.idVideojuego = idVideojuego;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * @return the idVideojuego
     */
    public int getIdVideojuego() {
        return idVideojuego;
    }

    /**
     * @param idVideojuego the idVideojuego to set
     */
    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    /**
     * @return the idTematica
     */
    public int getIdTematica() {
        return idTematica;
    }

    /**
     * @param idTematica the idTematica to set
     */
    public void setIdTematica(int idTematica) {
        this.idTematica = idTematica;
    }

    /**
     * @return the idPlataforma
     */
    public int getIdPlataforma() {
        return idPlataforma;
    }

    /**
     * @param idPlataforma the idPlataforma to set
     */
    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    /**
     * @return the idClasificacion
     */
    public int getIdClasificacion() {
        return idClasificacion;
    }

    /**
     * @param idClasificacion the idClasificacion to set
     */
    public void setIdClasificacion(int idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    /**
     * @return the idEstadoProducto
     */
    public int getIdEstadoProducto() {
        return idEstadoProducto;
    }

    /**
     * @param idEstadoProducto the idEstadoProducto to set
     */
    public void setIdEstadoProducto(int idEstadoProducto) {
        this.idEstadoProducto = idEstadoProducto;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}