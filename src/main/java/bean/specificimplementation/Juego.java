/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.specificimplementation;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author a024441493z
 */
@Entity
@Table(name = "juego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Juego.findAll", query = "SELECT j FROM Juego j")
    , @NamedQuery(name = "Juego.findById", query = "SELECT j FROM Juego j WHERE j.id = :id")
    , @NamedQuery(name = "Juego.findByNombre", query = "SELECT j FROM Juego j WHERE j.nombre = :nombre")
    , @NamedQuery(name = "Juego.findByDesarrolladora", query = "SELECT j FROM Juego j WHERE j.desarrolladora = :desarrolladora")
    , @NamedQuery(name = "Juego.findByFechalanzamiento", query = "SELECT j FROM Juego j WHERE j.fechalanzamiento = :fechalanzamiento")
    , @NamedQuery(name = "Juego.findByPrecio", query = "SELECT j FROM Juego j WHERE j.precio = :precio")
    , @NamedQuery(name = "Juego.findByEdadminima", query = "SELECT j FROM Juego j WHERE j.edadminima = :edadminima")
    , @NamedQuery(name = "Juego.findByIdUsuario", query = "SELECT j FROM Juego j WHERE j.idUsuario = :idUsuario")})
public class Juego implements Serializable {

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
    @Column(name = "desarrolladora")
    private String desarrolladora;
    @Column(name = "fechalanzamiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechalanzamiento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Column(name = "edadminima")
    private Integer edadminima;
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @OneToMany(mappedBy = "idJuego")
    private Collection<Historia> historiaCollection;
    @JoinColumn(name = "id_administrador", referencedColumnName = "id")
    @ManyToOne
    private Administrador idAdministrador;
    @OneToMany(mappedBy = "idJuego")
    private Collection<Noticia> noticiaCollection;
    @OneToMany(mappedBy = "idJuego")
    private Collection<Guia> guiaCollection;
    @OneToMany(mappedBy = "idJuego")
    private Collection<GeneroJuego> generoJuegoCollection;
    @OneToMany(mappedBy = "idJuego")
    private Collection<Personaje> personajeCollection;
    @OneToMany(mappedBy = "idJuego")
    private Collection<Plataformajuego> plataformajuegoCollection;

    public Juego() {
    }

    public Juego(Integer id) {
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

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public Date getFechalanzamiento() {
        return fechalanzamiento;
    }

    public void setFechalanzamiento(Date fechalanzamiento) {
        this.fechalanzamiento = fechalanzamiento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getEdadminima() {
        return edadminima;
    }

    public void setEdadminima(Integer edadminima) {
        this.edadminima = edadminima;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @XmlTransient
    public Collection<Historia> getHistoriaCollection() {
        return historiaCollection;
    }

    public void setHistoriaCollection(Collection<Historia> historiaCollection) {
        this.historiaCollection = historiaCollection;
    }

    public Administrador getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Administrador idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @XmlTransient
    public Collection<Noticia> getNoticiaCollection() {
        return noticiaCollection;
    }

    public void setNoticiaCollection(Collection<Noticia> noticiaCollection) {
        this.noticiaCollection = noticiaCollection;
    }

    @XmlTransient
    public Collection<Guia> getGuiaCollection() {
        return guiaCollection;
    }

    public void setGuiaCollection(Collection<Guia> guiaCollection) {
        this.guiaCollection = guiaCollection;
    }

    @XmlTransient
    public Collection<GeneroJuego> getGeneroJuegoCollection() {
        return generoJuegoCollection;
    }

    public void setGeneroJuegoCollection(Collection<GeneroJuego> generoJuegoCollection) {
        this.generoJuegoCollection = generoJuegoCollection;
    }

    @XmlTransient
    public Collection<Personaje> getPersonajeCollection() {
        return personajeCollection;
    }

    public void setPersonajeCollection(Collection<Personaje> personajeCollection) {
        this.personajeCollection = personajeCollection;
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
        if (!(object instanceof Juego)) {
            return false;
        }
        Juego other = (Juego) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.specificimplementation.Juego[ id=" + id + " ]";
    }
    
}
