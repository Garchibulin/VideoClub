/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Simon
 */
@Entity
@Table(name = "tbl_devolucion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Devolucion.findAll", query = "SELECT d FROM Devolucion d"),
    @NamedQuery(name = "Devolucion.findByIdDevolucion", query = "SELECT d FROM Devolucion d WHERE d.idDevolucion = :idDevolucion"),
    @NamedQuery(name = "Devolucion.findByNotas", query = "SELECT d FROM Devolucion d WHERE d.notas = :notas")})
public class Devolucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Devolucion")
    private Integer idDevolucion;
    @Column(name = "Notas")
    private String notas;
    @JoinColumn(name = "Id_Detalle_Alquiler", referencedColumnName = "Id_Detalle_Alquiler")
    @ManyToOne(optional = false)
    private DetalleAlquiler idDetalleAlquiler;
    @JoinColumn(name = "Id_Tipo_Multa", referencedColumnName = "Id_Tipo_Multa")
    @ManyToOne(optional = false)
    private TipoMulta idTipoMulta;

    public Devolucion() {
    }

    public Devolucion(Integer idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public Integer getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(Integer idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public DetalleAlquiler getIdDetalleAlquiler() {
        return idDetalleAlquiler;
    }

    public void setIdDetalleAlquiler(DetalleAlquiler idDetalleAlquiler) {
        this.idDetalleAlquiler = idDetalleAlquiler;
    }

    public TipoMulta getIdTipoMulta() {
        return idTipoMulta;
    }

    public void setIdTipoMulta(TipoMulta idTipoMulta) {
        this.idTipoMulta = idTipoMulta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDevolucion != null ? idDevolucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devolucion)) {
            return false;
        }
        Devolucion other = (Devolucion) object;
        if ((this.idDevolucion == null && other.idDevolucion != null) || (this.idDevolucion != null && !this.idDevolucion.equals(other.idDevolucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseDeDatos.Devolucion[ idDevolucion=" + idDevolucion + " ]";
    }
    
}
