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
import javax.persistence.Lob;
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
@Table(name = "guia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guia.findAll", query = "SELECT g FROM Guia g")
    , @NamedQuery(name = "Guia.findById", query = "SELECT g FROM Guia g WHERE g.id = :id")
    , @NamedQuery(name = "Guia.findByFehchacreacion", query = "SELECT g FROM Guia g WHERE g.fehchacreacion = :fehchacreacion")
    , @NamedQuery(name = "Guia.findByTitulo", query = "SELECT g FROM Guia g WHERE g.titulo = :titulo")})
public class Guia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fehchacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fehchacreacion;
    @Size(max = 255)
    @Column(name = "titulo")
    private String titulo;
    @Lob
    @Column(name = "texto")
    private byte[] texto;
    @OneToMany(mappedBy = "idGuia")
    private Collection<Comentarioguia> comentarioguiaCollection;
    @JoinColumn(name = "id_juego", referencedColumnName = "id")
    @ManyToOne
    private Juego idJuego;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario idUsuario;

    public Guia() {
    }

    public Guia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFehchacreacion() {
        return fehchacreacion;
    }

    public void setFehchacreacion(Date fehchacreacion) {
        this.fehchacreacion = fehchacreacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public byte[] getTexto() {
        return texto;
    }

    public void setTexto(byte[] texto) {
        this.texto = texto;
    }

    @XmlTransient
    public Collection<Comentarioguia> getComentarioguiaCollection() {
        return comentarioguiaCollection;
    }

    public void setComentarioguiaCollection(Collection<Comentarioguia> comentarioguiaCollection) {
        this.comentarioguiaCollection = comentarioguiaCollection;
    }

    public Juego getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Juego idJuego) {
        this.idJuego = idJuego;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof Guia)) {
            return false;
        }
        Guia other = (Guia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.specificimplementation.Guia[ id=" + id + " ]";
    }
    
}
