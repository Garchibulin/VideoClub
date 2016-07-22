/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Devolucion {

    private int idDevolucion;
    private String notas;
    private int idDetalleAlquiler;
    private int idTipoMulta;

    public Devolucion() {
    }

    public Devolucion(int idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public int getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(int idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public void setIdTipoMulta(int idTipoMulta) {
        this.idTipoMulta = idTipoMulta;
    }

    /**
     * @return the idDetalleAlquiler
     */
    public int getIdDetalleAlquiler() {
        return idDetalleAlquiler;
    }

    /**
     * @param idDetalleAlquiler the idDetalleAlquiler to set
     */
    public void setIdDetalleAlquiler(int idDetalleAlquiler) {
        this.idDetalleAlquiler = idDetalleAlquiler;
    }

    /**
     * @return the idTipoMulta
     */
    public int getIdTipoMulta() {
        return idTipoMulta;
    }

}
