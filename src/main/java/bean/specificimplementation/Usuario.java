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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findById", query = "SELECT u FROM Usuario u WHERE u.id = :id")
    , @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login")
    , @NamedQuery(name = "Usuario.findByPassword", query = "SELECT u FROM Usuario u WHERE u.password = :password")
    , @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email")})
public class Usuario implements Serializable {

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
    @Column(name = "login")
    private String login;
    @Size(max = 255)
    @Column(name = "password")
    private String password;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "idUsuario")
    private Collection<Comentarionoticia> comentarionoticiaCollection;
    @OneToMany(mappedBy = "idUsuario")
    private Collection<Noticia> noticiaCollection;
    @OneToMany(mappedBy = "idUsuario")
    private Collection<Comentarioguia> comentarioguiaCollection;
    @OneToMany(mappedBy = "idUsuario")
    private Collection<Guia> guiaCollection;

    public Usuario() {
    }

    public Usuario(Integer id) {
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Comentarionoticia> getComentarionoticiaCollection() {
        return comentarionoticiaCollection;
    }

    public void setComentarionoticiaCollection(Collection<Comentarionoticia> comentarionoticiaCollection) {
        this.comentarionoticiaCollection = comentarionoticiaCollection;
    }

    @XmlTransient
    public Collection<Noticia> getNoticiaCollection() {
        return noticiaCollection;
    }

    public void setNoticiaCollection(Collection<Noticia> noticiaCollection) {
        this.noticiaCollection = noticiaCollection;
    }

    @XmlTransient
    public Collection<Comentarioguia> getComentarioguiaCollection() {
        return comentarioguiaCollection;
    }

    public void setComentarioguiaCollection(Collection<Comentarioguia> comentarioguiaCollection) {
        this.comentarioguiaCollection = comentarioguiaCollection;
    }

    @XmlTransient
    public Collection<Guia> getGuiaCollection() {
        return guiaCollection;
    }

    public void setGuiaCollection(Collection<Guia> guiaCollection) {
        this.guiaCollection = guiaCollection;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.specificimplementation.Usuario[ id=" + id + " ]";
    }
    
}
