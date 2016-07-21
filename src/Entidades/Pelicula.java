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
@Table(name = "tbl_pelicula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pelicula.findAll", query = "SELECT p FROM Pelicula p"),
    @NamedQuery(name = "Pelicula.findByIdPelicula", query = "SELECT p FROM Pelicula p WHERE p.idPelicula = :idPelicula"),
    @NamedQuery(name = "Pelicula.findByTitulo", query = "SELECT p FROM Pelicula p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "Pelicula.findByDuracion", query = "SELECT p FROM Pelicula p WHERE p.duracion = :duracion"),
    @NamedQuery(name = "Pelicula.findByAnio", query = "SELECT p FROM Pelicula p WHERE p.anio = :anio"),
    @NamedQuery(name = "Pelicula.findBySinopsis", query = "SELECT p FROM Pelicula p WHERE p.sinopsis = :sinopsis"),
    @NamedQuery(name = "Pelicula.findByPrecio", query = "SELECT p FROM Pelicula p WHERE p.precio = :precio")})
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Pelicula")
    private Integer idPelicula;
    @Basic(optional = false)
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Duracion")
    private Integer duracion;
    @Column(name = "Anio")
    private Integer anio;
    @Column(name = "Sinopsis")
    private String sinopsis;
    @Basic(optional = false)
    @Column(name = "Precio")
    private double precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    private List<DetalleAlquiler> detalleAlquilerList;
    @JoinColumn(name = "Id_Clasificacion", referencedColumnName = "Id_Clasificacion")
    @ManyToOne(optional = false)
    private Clasificacion idClasificacion;
    @JoinColumn(name = "Id_Estado_Producto", referencedColumnName = "Id_Estado_Producto")
    @ManyToOne(optional = false)
    private EstadoProducto idEstadoProducto;
    @JoinColumn(name = "Id_Genero", referencedColumnName = "Id_Genero")
    @ManyToOne(optional = false)
    private Genero idGenero;

    public Pelicula() {
    }

    public Pelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Pelicula(Integer idPelicula, String titulo, double precio) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.precio = precio;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
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

    public Genero getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Genero idGenero) {
        this.idGenero = idGenero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPelicula != null ? idPelicula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelicula)) {
            return false;
        }
        Pelicula other = (Pelicula) object;
        if ((this.idPelicula == null && other.idPelicula != null) || (this.idPelicula != null && !this.idPelicula.equals(other.idPelicula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseDeDatos.Pelicula[ idPelicula=" + idPelicula + " ]";
    }
    
}
