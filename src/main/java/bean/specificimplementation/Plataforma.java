/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.specificimplementation;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author a024441493z
 */
@Entity
@Table(name = "plataforma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plataforma.findAll", query = "SELECT p FROM Plataforma p")
    , @NamedQuery(name = "Plataforma.findById", query = "SELECT p FROM Plataforma p WHERE p.id = :id")
    , @NamedQuery(name = "Plataforma.findByDescripcion", query = "SELECT p FROM Plataforma p WHERE p.descripcion = :descripcion")})
public class Plataforma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idPlataforma")
    private Collection<Plataformajuego> plataformajuegoCollection;

    public Plataforma() {
    }

    public Plataforma(Integer id) {
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

    @XmlTransient
    public Collection<Plataformajuego> getPlataformajuegoCollection() {
        return plataformajuegoCollection;
    }

    public void setPlataformajuegoCollection(Collection<Plataformajuego> plataformajuegoCollection) {
        this.plataformajuegoCollection = plataformajuegoCollection;
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
        if (!(object instanceof Plataforma)) {
            return false;
        }
        Plataforma other = (Plataforma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.specificimplementation.Plataforma[ id=" + id + " ]";
    }
    
}
