/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Simon
 */
@Entity
@Table(name = "tbl_detalle_alquiler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleAlquiler.findAll", query = "SELECT d FROM DetalleAlquiler d"),
    @NamedQuery(name = "DetalleAlquiler.findByIdDetalleAlquiler", query = "SELECT d FROM DetalleAlquiler d WHERE d.idDetalleAlquiler = :idDetalleAlquiler"),
    @NamedQuery(name = "DetalleAlquiler.findByEspeli", query = "SELECT d FROM DetalleAlquiler d WHERE d.espeli = :espeli"),
    @NamedQuery(name = "DetalleAlquiler.findByPrecioUnitario", query = "SELECT d FROM DetalleAlquiler d WHERE d.precioUnitario = :precioUnitario"),
    @NamedQuery(name = "DetalleAlquiler.findByCantidad", query = "SELECT d FROM DetalleAlquiler d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetalleAlquiler.findByDescripcion", query = "SELECT d FROM DetalleAlquiler d WHERE d.descripcion = :descripcion")})
public class DetalleAlquiler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Detalle_Alquiler")
    private Integer idDetalleAlquiler;
    @Basic(optional = false)
    @Column(name = "Espeli")
    private boolean espeli;
    @Basic(optional = false)
    @Column(name = "Precio_Unitario")
    private double precioUnitario;
    @Basic(optional = false)
    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "Descripcion")
    private String descripcion;
    @JoinColumn(name = "Id_Alquiler", referencedColumnName = "Id_Alquiler")
    @ManyToOne(optional = false)
    private Alquiler idAlquiler;
    @JoinColumn(name = "Id_Producto", referencedColumnName = "Id_Pelicula")
    @ManyToOne(optional = false)
    private Pelicula idProducto;
    @JoinColumn(name = "Id_Producto", referencedColumnName = "Id_Videojuego")
    @ManyToOne(optional = false)
    private Videojuego idProducto1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDetalleAlquiler")
    private List<Devolucion> devolucionList;

    public DetalleAlquiler() {
    }

    public DetalleAlquiler(Integer idDetalleAlquiler) {
        this.idDetalleAlquiler = idDetalleAlquiler;
    }

    public DetalleAlquiler(Integer idDetalleAlquiler, boolean espeli, double precioUnitario, int cantidad) {
        this.idDetalleAlquiler = idDetalleAlquiler;
        this.espeli = espeli;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public Integer getIdDetalleAlquiler() {
        return idDetalleAlquiler;
    }

    public void setIdDetalleAlquiler(Integer idDetalleAlquiler) {
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

    public Alquiler getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(Alquiler idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Pelicula getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Pelicula idProducto) {
        this.idProducto = idProducto;
    }

    public Videojuego getIdProducto1() {
        return idProducto1;
    }

    public void setIdProducto1(Videojuego idProducto1) {
        this.idProducto1 = idProducto1;
    }

    @XmlTransient
    public List<Devolucion> getDevolucionList() {
        return devolucionList;
    }

    public void setDevolucionList(List<Devolucion> devolucionList) {
        this.devolucionList = devolucionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleAlquiler != null ? idDetalleAlquiler.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleAlquiler)) {
            return false;
        }
        DetalleAlquiler other = (DetalleAlquiler) object;
        if ((this.idDetalleAlquiler == null && other.idDetalleAlquiler != null) || (this.idDetalleAlquiler != null && !this.idDetalleAlquiler.equals(other.idDetalleAlquiler))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseDeDatos.DetalleAlquiler[ idDetalleAlquiler=" + idDetalleAlquiler + " ]";
    }
    
}
