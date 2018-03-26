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
import java.util.Date;

/**
 *
 * @author a024441493z
 */
@MetaObjectBeanInterface(
        TableName = "juego",
        SingularDescription = "Juego",
        PluralDescription = "Juegos",
        Icon = "fa fa-gamepad",
        Type = EnumHelper.SourceType.Table
)

public class JuegoSpecificBeanImplementation extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Nombre",
            LongName = "Nombre",
            Description = "Nombre del juego",
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
            ShortName = "Desar.",
            LongName = "Desarrolladora",
            Description = "Desarrolladora del juego",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedName,
            RegexHelp = RegexConstants.capitalizedName_Help,
            IsForeignKeyDescriptor = false,
            Width = 3,
            MaxLength = 100,
            IsVisible = true
    )
    private String desarrolladora;

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Fecha",
            LongName = "Fecha lanzamiento",
            Description = "Fecha del lanzamiento",
            Type = EnumHelper.FieldType.Date,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedName,
            RegexHelp = RegexConstants.capitalizedName_Help,
            IsForeignKeyDescriptor = false,
            Width = 3,
            MaxLength = 100
    )
    private Date fechalanzamiento;

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Precio",
            LongName = "precio",
            Description = "Precio del juego",
            Type = EnumHelper.FieldType.Decimal,
            IsVisible = false
    // RegexHelp = "un numero correcto",
    //IsRequired = true
    )
    private Double precio;

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Edad",
            LongName = "Edad mínima",
            Description = "Edad mínima para jugar",
            Type = EnumHelper.FieldType.Integer
    // RegexHelp = "un numero correcto",
    //IsRequired = true
    )
    private Integer edadminima;

    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_usuario = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "usuario",
            LongName = "Usuario",
            Description = "Usuario que lo añade",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "usuario",
            IsVisible = false,
            Width = 4
    )
    private MetaBeanHelper obj_usuario = null;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Personajes del juego",
            LongName = "Personajes del juego",
            Description = "Personajes del juego",
            Type = EnumHelper.FieldType.Link,
            References = "personaje"
    )
    private Integer link_personaje = null;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Versiones del juego",
            LongName = "Versiones del juego",
            Description = "Versiones del juego",
            Type = EnumHelper.FieldType.Link,
            References = "historia"
    )
    private Integer link_historia = null;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Plataformas",
            LongName = "Plataformas del juego",
            Description = "Plataformas donde se juega el juego",
            Type = EnumHelper.FieldType.Link,
            References = "plataformajuego"
    )
    private Integer link_plataformajuego = null;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Guias",
            LongName = "Guias del juego",
            Description = "Guias para este juego",
            Type = EnumHelper.FieldType.Link,
            References = "guia"
    )
    private Integer link_guia = null;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Noticias",
            LongName = "Noticias sobre el juego",
            Description = "Noticias que salen del juego juego",
            Type = EnumHelper.FieldType.Link,
            References = "noticia"
    )
    private Integer link_noticia = null;

    public JuegoSpecificBeanImplementation() {
    }

    public JuegoSpecificBeanImplementation(Integer id) {
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

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public MetaBeanHelper getObj_usuario() {
        return obj_usuario;
    }

    public void setObj_usuario(MetaBeanHelper obj_usuario) {
        this.obj_usuario = obj_usuario;
    }

    public Integer getLink_personaje() {
        return link_personaje;
    }

    public void setLink_personaje(Integer link_personaje) {
        this.link_personaje = link_personaje;
    }

    public Integer getLink_historia() {
        return link_historia;
    }

    public void setLink_historia(Integer link_historia) {
        this.link_historia = link_historia;
    }

    public Integer getLink_plataformajuego() {
        return link_plataformajuego;
    }

    public void setLink_plataformajuego(Integer link_plataformajuego) {
        this.link_plataformajuego = link_plataformajuego;
    }

    public Integer getLink_guia() {
        return link_guia;
    }

    public void setLink_guia(Integer link_guia) {
        this.link_guia = link_guia;
    }

    public Integer getLink_noticia() {
        return link_noticia;
    }

    public void setLink_noticia(Integer link_noticia) {
        this.link_noticia = link_noticia;
    }
    
    

}
