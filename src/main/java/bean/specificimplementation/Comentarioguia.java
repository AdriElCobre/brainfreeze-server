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
@Table(name = "comentarioguia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comentarioguia.findAll", query = "SELECT c FROM Comentarioguia c")
    , @NamedQuery(name = "Comentarioguia.findByIdcomentarioguia", query = "SELECT c FROM Comentarioguia c WHERE c.idcomentarioguia = :idcomentarioguia")
    , @NamedQuery(name = "Comentarioguia.findByFechacreacion", query = "SELECT c FROM Comentarioguia c WHERE c.fechacreacion = :fechacreacion")
    , @NamedQuery(name = "Comentarioguia.findByTitulo", query = "SELECT c FROM Comentarioguia c WHERE c.titulo = :titulo")})
public class Comentarioguia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcomentarioguia")
    private Integer idcomentarioguia;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Size(max = 255)
    @Column(name = "titulo")
    private String titulo;
    @Lob
    @Column(name = "texto")
    private byte[] texto;
    @JoinColumn(name = "id_guia", referencedColumnName = "id")
    @ManyToOne
    private Guia idGuia;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario idUsuario;

    public Comentarioguia() {
    }

    public Comentarioguia(Integer idcomentarioguia) {
        this.idcomentarioguia = idcomentarioguia;
    }

    public Integer getIdcomentarioguia() {
        return idcomentarioguia;
    }

    public void setIdcomentarioguia(Integer idcomentarioguia) {
        this.idcomentarioguia = idcomentarioguia;
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

    public Guia getIdGuia() {
        return idGuia;
    }

    public void setIdGuia(Guia idGuia) {
        this.idGuia = idGuia;
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
        hash += (idcomentarioguia != null ? idcomentarioguia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comentarioguia)) {
            return false;
        }
        Comentarioguia other = (Comentarioguia) object;
        if ((this.idcomentarioguia == null && other.idcomentarioguia != null) || (this.idcomentarioguia != null && !this.idcomentarioguia.equals(other.idcomentarioguia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.specificimplementation.Comentarioguia[ idcomentarioguia=" + idcomentarioguia + " ]";
    }
    
}
