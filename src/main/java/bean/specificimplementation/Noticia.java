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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author a024441493z
 */
@Entity
@Table(name = "noticia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Noticia.findAll", query = "SELECT n FROM Noticia n")
    , @NamedQuery(name = "Noticia.findById", query = "SELECT n FROM Noticia n WHERE n.id = :id")
    , @NamedQuery(name = "Noticia.findByFechacreacion", query = "SELECT n FROM Noticia n WHERE n.fechacreacion = :fechacreacion")
    , @NamedQuery(name = "Noticia.findByTitulo", query = "SELECT n FROM Noticia n WHERE n.titulo = :titulo")})
public class Noticia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Size(max = 255)
    @Column(name = "titulo")
    private String titulo;
    @Lob
    @Size(max = 16777215)
    @Column(name = "texto")
    private String texto;
    @OneToMany(mappedBy = "idNoticia")
    private Collection<Comentarionoticia> comentarionoticiaCollection;
    @JoinColumn(name = "id_juego", referencedColumnName = "id")
    @ManyToOne
    private Juego idJuego;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario idUsuario;

    public Noticia() {
    }

    public Noticia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @XmlTransient
    public Collection<Comentarionoticia> getComentarionoticiaCollection() {
        return comentarionoticiaCollection;
    }

    public void setComentarionoticiaCollection(Collection<Comentarionoticia> comentarionoticiaCollection) {
        this.comentarionoticiaCollection = comentarionoticiaCollection;
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
        if (!(object instanceof Noticia)) {
            return false;
        }
        Noticia other = (Noticia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.specificimplementation.Noticia[ id=" + id + " ]";
    }
    
}
