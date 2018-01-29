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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author a024441493z
 */
@Entity
@Table(name = "personaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personaje.findAll", query = "SELECT p FROM Personaje p")
    , @NamedQuery(name = "Personaje.findById", query = "SELECT p FROM Personaje p WHERE p.id = :id")
    , @NamedQuery(name = "Personaje.findByNombre", query = "SELECT p FROM Personaje p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Personaje.findByDescripcion", query = "SELECT p FROM Personaje p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Personaje.findByFaccion", query = "SELECT p FROM Personaje p WHERE p.faccion = :faccion")})
public class Personaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "faccion")
    private String faccion;
    @JoinColumn(name = "id_clase", referencedColumnName = "id")
    @ManyToOne
    private Clase idClase;
    @JoinColumn(name = "id_juego", referencedColumnName = "id")
    @ManyToOne
    private Juego idJuego;

    public Personaje() {
    }

    public Personaje(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getFaccion() {
        return faccion;
    }

    public void setFaccion(String faccion) {
        this.faccion = faccion;
    }

    public Clase getIdClase() {
        return idClase;
    }

    public void setIdClase(Clase idClase) {
        this.idClase = idClase;
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
        if (!(object instanceof Personaje)) {
            return false;
        }
        Personaje other = (Personaje) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.specificimplementation.Personaje[ id=" + id + " ]";
    }
    
}
