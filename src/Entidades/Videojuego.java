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
@Table(name = "tbl_videojuego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Videojuego.findAll", query = "SELECT v FROM Videojuego v"),
    @NamedQuery(name = "Videojuego.findByIdVideojuego", query = "SELECT v FROM Videojuego v WHERE v.idVideojuego = :idVideojuego"),
    @NamedQuery(name = "Videojuego.findByNombre", query = "SELECT v FROM Videojuego v WHERE v.nombre = :nombre"),
    @NamedQuery(name = "Videojuego.findByDescripcion", query = "SELECT v FROM Videojuego v WHERE v.descripcion = :descripcion"),
    @NamedQuery(name = "Videojuego.findByPrecio", query = "SELECT v FROM Videojuego v WHERE v.precio = :precio")})
public class Videojuego implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Videojuego")
    private Integer idVideojuego;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Precio")
    private double precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto1")
    private List<DetalleAlquiler> detalleAlquilerList;
    @JoinColumn(name = "Id_Clasificacion", referencedColumnName = "Id_Clasificacion")
    @ManyToOne(optional = false)
    private Clasificacion idClasificacion;
    @JoinColumn(name = "Id_Estado_Producto", referencedColumnName = "Id_Estado_Producto")
    @ManyToOne(optional = false)
    private EstadoProducto idEstadoProducto;
    @JoinColumn(name = "Id_Plataforma", referencedColumnName = "Id_Plataforma")
    @ManyToOne(optional = false)
    private Plataforma idPlataforma;
    @JoinColumn(name = "Id_Tematica", referencedColumnName = "Id_Tematica")
    @ManyToOne(optional = false)
    private Tematica idTematica;

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

    public Integer getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(Integer idVideojuego) {
        this.idVideojuego = idVideojuego;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @XmlTransient
    public List<DetalleAlquiler> getDetalleAlquilerList() {
        return detalleAlquilerList;
    }

    public void setDetalleAlquilerList(List<DetalleAlquiler> detalleAlquilerList) {
        this.detalleAlquilerList = detalleAlquilerList;
    }

    public Clasificacion getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(Clasificacion idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public EstadoProducto getIdEstadoProducto() {
        return idEstadoProducto;
    }

    public void setIdEstadoProducto(EstadoProducto idEstadoProducto) {
        this.idEstadoProducto = idEstadoProducto;
    }

    public Plataforma getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(Plataforma idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public Tematica getIdTematica() {
        return idTematica;
    }

    public void setIdTematica(Tematica idTematica) {
        this.idTematica = idTematica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVideojuego != null ? idVideojuego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Videojuego)) {
            return false;
        }
        Videojuego other = (Videojuego) object;
        if ((this.idVideojuego == null && other.idVideojuego != null) || (this.idVideojuego != null && !this.idVideojuego.equals(other.idVideojuego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseDeDatos.Videojuego[ idVideojuego=" + idVideojuego + " ]";
    }
    
}
