/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Simon
 */
@Entity
@Table(name = "tbl_alquiler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alquiler.findAll", query = "SELECT a FROM Alquiler a"),
    @NamedQuery(name = "Alquiler.findByIdAlquiler", query = "SELECT a FROM Alquiler a WHERE a.idAlquiler = :idAlquiler"),
    @NamedQuery(name = "Alquiler.findByFechaAlquiler", query = "SELECT a FROM Alquiler a WHERE a.fechaAlquiler = :fechaAlquiler"),
    @NamedQuery(name = "Alquiler.findByFechaDevolucion", query = "SELECT a FROM Alquiler a WHERE a.fechaDevolucion = :fechaDevolucion"),
    @NamedQuery(name = "Alquiler.findByMontoAlquiler", query = "SELECT a FROM Alquiler a WHERE a.montoAlquiler = :montoAlquiler")})
public class Alquiler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Alquiler")
    private Integer idAlquiler;
    @Basic(optional = false)
    @Column(name = "Fecha_Alquiler")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlquiler;
    @Basic(optional = false)
    @Column(name = "Fecha_Devolucion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDevolucion;
    @Basic(optional = false)
    @Column(name = "Monto_Alquiler")
    private double montoAlquiler;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAlquiler")
    private List<DetalleAlquiler> detalleAlquilerList;
    @JoinColumn(name = "Id_Cliente", referencedColumnName = "Id_Cliente")
    @ManyToOne(optional = false)
    private Cliente idCliente;

    public Alquiler() {
    }

    public Alquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Alquiler(Integer idAlquiler, Date fechaAlquiler, Date fechaDevolucion, double montoAlquiler) {
        this.idAlquiler = idAlquiler;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.montoAlquiler = montoAlquiler;
    }

    public Integer getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getMontoAlquiler() {
        return montoAlquiler;
    }

    public void setMontoAlquiler(double montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }

    @XmlTransient
    public List<DetalleAlquiler> getDetalleAlquilerList() {
        return detalleAlquilerList;
    }

    public void setDetalleAlquilerList(List<DetalleAlquiler> detalleAlquilerList) {
        this.detalleAlquilerList = detalleAlquilerList;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlquiler != null ? idAlquiler.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alquiler)) {
            return false;
        }
        Alquiler other = (Alquiler) object;
        if ((this.idAlquiler == null && other.idAlquiler != null) || (this.idAlquiler != null && !this.idAlquiler.equals(other.idAlquiler))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseDeDatos.Alquiler[ idAlquiler=" + idAlquiler + " ]";
    }
    
}
