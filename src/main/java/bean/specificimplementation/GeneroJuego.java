/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.specificimplementation;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author a024441493z
 */
@Entity
@Table(name = "genero juego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GeneroJuego.findAll", query = "SELECT g FROM GeneroJuego g")
    , @NamedQuery(name = "GeneroJuego.findById", query = "SELECT g FROM GeneroJuego g WHERE g.id = :id")})
public class GeneroJuego implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "id_genero", referencedColumnName = "id")
    @ManyToOne
    private Genero idGenero;
    @JoinColumn(name = "id_juego", referencedColumnName = "id")
    @ManyToOne
    private Juego idJuego;

    public GeneroJuego() {
    }

    public GeneroJuego(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Genero getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Genero idGenero) {
        this.idGenero = idGenero;
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
        if (!(object instanceof GeneroJuego)) {
            return false;
        }
        GeneroJuego other = (GeneroJuego) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.specificimplementation.GeneroJuego[ id=" + id + " ]";
    }
    
}
