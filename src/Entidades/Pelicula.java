/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Pelicula  {

    private int idPelicula;
    private String titulo;
    private int duracion;
    private int anio;
    private String sinopsis;
    private double precio;    
    private int idGenero;
    private int idClasificacion;

    public Pelicula() {
    }

    public Pelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Pelicula(int idPelicula, String titulo, double precio) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.precio = precio;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the idGenero
     */
    public int getIdGenero() {
        return idGenero;
    }

    /**
     * @param idGenero the idGenero to set
     */
    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
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

    

    
}
