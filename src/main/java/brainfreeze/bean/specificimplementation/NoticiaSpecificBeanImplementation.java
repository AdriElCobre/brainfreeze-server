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
        TableName = "Noticia",
        SingularDescription = "Noticia",
        PluralDescription = "Noticias",
        Icon = "fa fa-user",
        Type = EnumHelper.SourceType.Table
)

public class NoticiaSpecificBeanImplementation extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Fecha",
            LongName = "Fecha",
            Description = "Fecha de la creacion de la noticia",
            Type = EnumHelper.FieldType.Date,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedName,
            RegexHelp = RegexConstants.capitalizedName_Help,
            IsForeignKeyDescriptor = true,
            Width = 3,
            MaxLength = 100
    )
    private Date fechacreacion;
    
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Titulo",
            LongName = "Titulo de la noticia",
            Description = "Titulo que le ponemos a la noticia",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedSentence,
            RegexHelp = RegexConstants.capitalizedSentence_Help,
            IsForeignKeyDescriptor = true
    )
    private String titulo = "";
    
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Texto",
            LongName = "Texto de la noticia",
            Description = "Texto que forma la noticia",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedSentence,
            RegexHelp = RegexConstants.capitalizedSentence_Help,
            IsForeignKeyDescriptor = true
    )
    private String texto = "";
    
    
    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_juego = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Juego",
            LongName = "Juego",
            Description = "Juego del cual se escribe",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "juego",
            Width = 4
    )
    private MetaBeanHelper obj_juego = null;
    
    
    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_usuario = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Usuario",
            LongName = "Usuario",
            Description = "Usuario que escribe la noticia",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "usuario",
            Width = 4
    )
    private MetaBeanHelper obj_usuario = null;

    public NoticiaSpecificBeanImplementation() {
    }

    public NoticiaSpecificBeanImplementation(Integer id) {
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

    public Integer getId_juego() {
        return id_juego;
    }

    public void setId_juego(Integer id_juego) {
        this.id_juego = id_juego;
    }

    public MetaBeanHelper getObj_juego() {
        return obj_juego;
    }

    public void setObj_juego(MetaBeanHelper obj_juego) {
        this.obj_juego = obj_juego;
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

    
    
    
    
    
}
