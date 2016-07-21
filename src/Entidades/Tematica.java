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
@Table(name = "tbl_tematica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tematica.findAll", query = "SELECT t FROM Tematica t"),
    @NamedQuery(name = "Tematica.findByIdTematica", query = "SELECT t FROM Tematica t WHERE t.idTematica = :idTematica"),
    @NamedQuery(name = "Tematica.findByNombre", query = "SELECT t FROM Tematica t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tematica.findByDescripcion", query = "SELECT t FROM Tematica t WHERE t.descripcion = :descripcion")})
public class Tematica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Tematica")
    private Integer idTematica;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTematica")
    private List<Videojuego> videojuegoList;

    public Tematica() {
    }

    public Tematica(Integer idTematica) {
        this.idTematica = idTematica;
    }

    public Tematica(Integer idTematica, String nombre) {
        this.idTematica = idTematica;
        this.nombre = nombre;
    }

    public Integer getIdTematica() {
        return idTematica;
    }

    public void setIdTematica(Integer idTematica) {
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

    @XmlTransient
    public List<Videojuego> getVideojuegoList() {
        return videojuegoList;
    }

    public void setVideojuegoList(List<Videojuego> videojuegoList) {
        this.videojuegoList = videojuegoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTematica != null ? idTematica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tematica)) {
            return false;
        }
        Tematica other = (Tematica) object;
        if ((this.idTematica == null && other.idTematica != null) || (this.idTematica != null && !this.idTematica.equals(other.idTematica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseDeDatos.Tematica[ idTematica=" + idTematica + " ]";
    }
    
}
