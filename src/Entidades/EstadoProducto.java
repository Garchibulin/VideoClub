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
@Table(name = "tbl_estado_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoProducto.findAll", query = "SELECT e FROM EstadoProducto e"),
    @NamedQuery(name = "EstadoProducto.findByIdEstadoProducto", query = "SELECT e FROM EstadoProducto e WHERE e.idEstadoProducto = :idEstadoProducto"),
    @NamedQuery(name = "EstadoProducto.findByNombreEstado", query = "SELECT e FROM EstadoProducto e WHERE e.nombreEstado = :nombreEstado"),
    @NamedQuery(name = "EstadoProducto.findByDescripcion", query = "SELECT e FROM EstadoProducto e WHERE e.descripcion = :descripcion")})
public class EstadoProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Estado_Producto")
    private Integer idEstadoProducto;
    @Basic(optional = false)
    @Column(name = "Nombre_Estado")
    private String nombreEstado;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstadoProducto")
    private List<Videojuego> videojuegoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstadoProducto")
    private List<Pelicula> peliculaList;

    public EstadoProducto() {
    }

    public EstadoProducto(Integer idEstadoProducto) {
        this.idEstadoProducto = idEstadoProducto;
    }

    public EstadoProducto(Integer idEstadoProducto, String nombreEstado) {
        this.idEstadoProducto = idEstadoProducto;
        this.nombreEstado = nombreEstado;
    }

    public Integer getIdEstadoProducto() {
        return idEstadoProducto;
    }

    public void setIdEstadoProducto(Integer idEstadoProducto) {
        this.idEstadoProducto = idEstadoProducto;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Videojuego> getVideojuegoList() {
        return videojuegoList;
    }

    public void setVideojuegoList(List<Videojuego> videojuegoList) {
        this.videojuegoList = videojuegoList;
    }

    @XmlTransient
    public List<Pelicula> getPeliculaList() {
        return peliculaList;
    }

    public void setPeliculaList(List<Pelicula> peliculaList) {
        this.peliculaList = peliculaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoProducto != null ? idEstadoProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoProducto)) {
            return false;
        }
        EstadoProducto other = (EstadoProducto) object;
        if ((this.idEstadoProducto == null && other.idEstadoProducto != null) || (this.idEstadoProducto != null && !this.idEstadoProducto.equals(other.idEstadoProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseDeDatos.EstadoProducto[ idEstadoProducto=" + idEstadoProducto + " ]";
    }
    
}
