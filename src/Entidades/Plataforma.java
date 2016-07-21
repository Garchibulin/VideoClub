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
@Table(name = "tbl_plataforma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plataforma.findAll", query = "SELECT p FROM Plataforma p"),
    @NamedQuery(name = "Plataforma.findByIdPlataforma", query = "SELECT p FROM Plataforma p WHERE p.idPlataforma = :idPlataforma"),
    @NamedQuery(name = "Plataforma.findByNombre", query = "SELECT p FROM Plataforma p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Plataforma.findByDescripcion", query = "SELECT p FROM Plataforma p WHERE p.descripcion = :descripcion")})
public class Plataforma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Plataforma")
    private Integer idPlataforma;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlataforma")
    private List<Videojuego> videojuegoList;

    public Plataforma() {
    }

    public Plataforma(Integer idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public Plataforma(Integer idPlataforma, String nombre) {
        this.idPlataforma = idPlataforma;
        this.nombre = nombre;
    }

    public Integer getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(Integer idPlataforma) {
        this.idPlataforma = idPlataforma;
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
        hash += (idPlataforma != null ? idPlataforma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plataforma)) {
            return false;
        }
        Plataforma other = (Plataforma) object;
        if ((this.idPlataforma == null && other.idPlataforma != null) || (this.idPlataforma != null && !this.idPlataforma.equals(other.idPlataforma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseDeDatos.Plataforma[ idPlataforma=" + idPlataforma + " ]";
    }
    
}
