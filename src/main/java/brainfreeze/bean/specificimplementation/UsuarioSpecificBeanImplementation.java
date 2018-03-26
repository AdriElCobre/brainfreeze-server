/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brainfreeze.bean.specificimplementation;

import brainfreeze.bean.genericimplementation.TableGenericBeanImplementation;
import brainfreeze.bean.helper.MetaBeanHelper;
import brainfreeze.bean.meta.publicinterface.MetaObjectBeanInterface;
import brainfreeze.bean.meta.publicinterface.MetaPropertyBeanInterface;
import com.google.gson.annotations.Expose;
import brainfreeze.helper.EnumHelper;
import brainfreeze.helper.constant.RegexConstants;


/**
 *
 * @author a024441493z
 */

@MetaObjectBeanInterface(
        TableName = "usuario",
        SingularDescription = "Usuario",
        PluralDescription = "Usuarios",
        Icon = "fa fa-user",
        Type = EnumHelper.SourceType.Table
)

public class UsuarioSpecificBeanImplementation extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Nombre",
            LongName = "Nombre",
            Description = "Nombre del usuario",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedName,
            RegexHelp = RegexConstants.capitalizedName_Help,
            IsForeignKeyDescriptor = true,
            Width = 3,
            MaxLength = 100,
            IsVisible = true
    )
    private String nombre;
    
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "login",
            LongName = "Login",
            Description = "Login para entrar en el sistema",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.nameWithEndingNumbers,
            RegexHelp = RegexConstants.nameWithEndingNumbers_Help,
            MaxLength = 15,
            IsVisible = false
    )
    private String login;

    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.Password
    )
    private String password;

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "email",
            LongName = "Correo electrónico",
            Description = "Correo electrónico del usuario",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.email,
            RegexHelp = RegexConstants.email_Help,
            MaxLength = 50,
            IsVisible = false
    )
    private String email;
    
    
    
    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.Token
    )
    private String token;

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "¿Activo?",
            LongName = "¿Usuario activo?",
            Description = "¿Usuario activo?",
            Type = EnumHelper.FieldType.Boolean,
            IsRequired = true,
            IsVisible = false
    )
    private Integer activo;
    
       @Expose
    @MetaPropertyBeanInterface(
            ShortName = "¿Validado?",
            LongName = "¿Usuario validado?",
            Description = "¿Usuario validado?",
            Type = EnumHelper.FieldType.Boolean,
            IsRequired = true,
            IsVisible = false
    )
    private Integer validado;

    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_tipousuario = 0;
    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Tipo",
            LongName = "Tipo usuario",
            Description = "Tipo de usuario",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "tipousuario",
            Width = 4
    )
    private MetaBeanHelper obj_tipousuario = null;
    
    
    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Juegos del usuario",
            LongName = "Juegos del usuario",
            Description = "Usuarios del usuario",
            Type = EnumHelper.FieldType.Link,
            References = "juego"
    )
    private Integer link_juego = null;
    
    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Guias del usuario",
            LongName = "Guias del usuario",
            Description = "Guias del usuario",
            Type = EnumHelper.FieldType.Link,
            References = "guia"
    )
    private Integer link_guia = null;
    
    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Comentario del usuario a una guia ",
            LongName = "Comentarios del usuario en guias ",
            Description = "Comentarios del usuario en guias ",
            Type = EnumHelper.FieldType.Link,
            References = "comentarioguia"
    )
    private Integer link_comentarioguia = null;
    
    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Noticias del usuario",
            LongName = "Noticias del usuario",
            Description = "Noticias del usuario",
            Type = EnumHelper.FieldType.Link,
            References = "noticia"
    )
    private Integer link_noticia = null;
    
    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Comentario a una noticia",
            LongName = "Comentarios del usuario en noticias ",
            Description = "Comentarios del usuario en noticias ",
            Type = EnumHelper.FieldType.Link,
            References = "comentarionoticia"
    )
    private Integer link_comentarionoticia = null;

    public UsuarioSpecificBeanImplementation() {
    }

    public UsuarioSpecificBeanImplementation(Integer id) {
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getValidado() {
        return validado;
    }

    public void setValidado(Integer validado) {
        this.validado = validado;
    }

    public Integer getId_tipousuario() {
        return id_tipousuario;
    }

    public void setId_tipousuario(Integer id_tipousuario) {
        this.id_tipousuario = id_tipousuario;
    }

    public MetaBeanHelper getObj_tipousuario() {
        return obj_tipousuario;
    }

    public void setObj_tipousuario(MetaBeanHelper obj_tipousuario) {
        this.obj_tipousuario = obj_tipousuario;
    }

    public Integer getLink_juego() {
        return link_juego;
    }

    public void setLink_juego(Integer link_juego) {
        this.link_juego = link_juego;
    }

    public Integer getLink_guia() {
        return link_guia;
    }

    public void setLink_guia(Integer link_guia) {
        this.link_guia = link_guia;
    }

    public Integer getLink_comentarioguia() {
        return link_comentarioguia;
    }

    public void setLink_comentarioguia(Integer link_comentarioguia) {
        this.link_comentarioguia = link_comentarioguia;
    }

    public Integer getLink_noticia() {
        return link_noticia;
    }

    public void setLink_noticia(Integer link_noticia) {
        this.link_noticia = link_noticia;
    }

    public Integer getLink_comentarionoticia() {
        return link_comentarionoticia;
    }

    public void setLink_comentarionoticia(Integer link_comentarionoticia) {
        this.link_comentarionoticia = link_comentarionoticia;
    }
    
    
    
    
}
