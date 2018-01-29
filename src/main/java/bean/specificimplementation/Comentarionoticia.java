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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author a024441493z
 */
@Entity
@Table(name = "comentarionoticia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comentarionoticia.findAll", query = "SELECT c FROM Comentarionoticia c")
    , @NamedQuery(name = "Comentarionoticia.findById", query = "SELECT c FROM Comentarionoticia c WHERE c.id = :id")
    , @NamedQuery(name = "Comentarionoticia.findByFechacreacion", query = "SELECT c FROM Comentarionoticia c WHERE c.fechacreacion = :fechacreacion")
    , @NamedQuery(name = "Comentarionoticia.findByTitulo", query = "SELECT c FROM Comentarionoticia c WHERE c.titulo = :titulo")})
public class Comentarionoticia implements Serializable {

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
    @Column(name = "texto")
    private byte[] texto;
    @JoinColumn(name = "id_noticia", referencedColumnName = "id")
    @ManyToOne
    private Noticia idNoticia;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario idUsuario;

    public Comentarionoticia() {
    }

    public Comentarionoticia(Integer id) {
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

    public byte[] getTexto() {
        return texto;
    }

    public void setTexto(byte[] texto) {
        this.texto = texto;
    }

    public Noticia getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(Noticia idNoticia) {
        this.idNoticia = idNoticia;
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
        if (!(object instanceof Comentarionoticia)) {
            return false;
        }
        Comentarionoticia other = (Comentarionoticia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.specificimplementation.Comentarionoticia[ id=" + id + " ]";
    }
    
}
