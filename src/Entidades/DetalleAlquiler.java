/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
public class DetalleAlquiler  {

    
    private int idDetalleAlquiler;
    private boolean espeli;
    private double precioUnitario;
    private int cantidad;
    private String descripcion;
    private int idAlquiler;
    private int idProducto;
   

    public DetalleAlquiler() {
    }

    public DetalleAlquiler(int idDetalleAlquiler) {
        this.idDetalleAlquiler = idDetalleAlquiler;
    }

    public DetalleAlquiler(int idDetalleAlquiler, boolean espeli, double precioUnitario, int cantidad) {
        this.idDetalleAlquiler = idDetalleAlquiler;
        this.espeli = espeli;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public int getIdDetalleAlquiler() {
        return idDetalleAlquiler;
    }

    public void setIdDetalleAlquiler(int idDetalleAlquiler) {
        this.idDetalleAlquiler = idDetalleAlquiler;
    }

    public boolean getEspeli() {
        return espeli;
    }

    public void setEspeli(boolean espeli) {
        this.espeli = espeli;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }


    
}
