/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class TipoMulta {

    
    private int idTipoMulta;
    private String concepto;
    private double montoMulta;
    private String descripcion;
    
    public TipoMulta() {
    }

    public TipoMulta(int idTipoMulta) {
        this.idTipoMulta = idTipoMulta;
    }

    public TipoMulta(int idTipoMulta, String concepto, double montoMulta) {
        this.idTipoMulta = idTipoMulta;
        this.concepto = concepto;
        this.montoMulta = montoMulta;
    }

    public int getIdTipoMulta() {
        return idTipoMulta;
    }

    public void setIdTipoMulta(int idTipoMulta) {
        this.idTipoMulta = idTipoMulta;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getMontoMulta() {
        return montoMulta;
    }

    public void setMontoMulta(double montoMulta) {
        this.montoMulta = montoMulta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
