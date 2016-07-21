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
@Table(name = "tbl_tipo_multa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoMulta.findAll", query = "SELECT t FROM TipoMulta t"),
    @NamedQuery(name = "TipoMulta.findByIdTipoMulta", query = "SELECT t FROM TipoMulta t WHERE t.idTipoMulta = :idTipoMulta"),
    @NamedQuery(name = "TipoMulta.findByConcepto", query = "SELECT t FROM TipoMulta t WHERE t.concepto = :concepto"),
    @NamedQuery(name = "TipoMulta.findByMontoMulta", query = "SELECT t FROM TipoMulta t WHERE t.montoMulta = :montoMulta"),
    @NamedQuery(name = "TipoMulta.findByDescripcion", query = "SELECT t FROM TipoMulta t WHERE t.descripcion = :descripcion")})
public class TipoMulta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Tipo_Multa")
    private Integer idTipoMulta;
    @Basic(optional = false)
    @Column(name = "Concepto")
    private String concepto;
    @Basic(optional = false)
    @Column(name = "Monto_Multa")
    private double montoMulta;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoMulta")
    private List<Devolucion> devolucionList;

    public TipoMulta() {
    }

    public TipoMulta(Integer idTipoMulta) {
        this.idTipoMulta = idTipoMulta;
    }

    public TipoMulta(Integer idTipoMulta, String concepto, double montoMulta) {
        this.idTipoMulta = idTipoMulta;
        this.concepto = concepto;
        this.montoMulta = montoMulta;
    }

    public Integer getIdTipoMulta() {
        return idTipoMulta;
    }

    public void setIdTipoMulta(Integer idTipoMulta) {
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
        hash += (idTipoMulta != null ? idTipoMulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMulta)) {
            return false;
        }
        TipoMulta other = (TipoMulta) object;
        if ((this.idTipoMulta == null && other.idTipoMulta != null) || (this.idTipoMulta != null && !this.idTipoMulta.equals(other.idTipoMulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseDeDatos.TipoMulta[ idTipoMulta=" + idTipoMulta + " ]";
    }
    
}
