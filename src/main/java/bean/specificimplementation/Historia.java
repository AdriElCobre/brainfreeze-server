/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.specificimplementation;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author a024441493z
 */
@Entity
@Table(name = "historia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historia.findAll", query = "SELECT h FROM Historia h")
    , @NamedQuery(name = "Historia.findById", query = "SELECT h FROM Historia h WHERE h.id = :id")
    , @NamedQuery(name = "Historia.findByDescripcion", query = "SELECT h FROM Historia h WHERE h.descripcion = :descripcion")
    , @NamedQuery(name = "Historia.findByFechalanzamiento", query = "SELECT h FROM Historia h WHERE h.fechalanzamiento = :fechalanzamiento")
    , @NamedQuery(name = "Historia.findByVersion", query = "SELECT h FROM Historia h WHERE h.version = :version")})
public class Historia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fechalanzamiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechalanzamiento;
    @Size(max = 255)
    @Column(name = "version")
    private String version;
    @JoinColumn(name = "id_juego", referencedColumnName = "id")
    @ManyToOne
    private Juego idJuego;

    public Historia() {
    }

    public Historia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechalanzamiento() {
        return fechalanzamiento;
    }

    public void setFechalanzamiento(Date fechalanzamiento) {
        this.fechalanzamiento = fechalanzamiento;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Juego getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Juego idJuego) {
        this.idJuego = idJuego;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historia)) {
            return false;
        }
        Historia other = (Historia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.specificimplementation.Historia[ id=" + id + " ]";
    }
    
}
