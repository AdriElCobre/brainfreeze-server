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
        TableName = "comentarioguia",
        SingularDescription = "Comentario guia",
        PluralDescription = "Comentarios guias",
        Icon = "fa fa-user",
        Type = EnumHelper.SourceType.Table
)

public class ComentarioguiaSpecificBeanImplementation extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Fecha",
            LongName = "Fecha",
            Description = "Fecha de la creacion",
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
            LongName = "Titulo del comentario",
            Description = "Titulo que le ponemos a la guia",
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
            LongName = "Texto del comentario",
            Description = "Texto que forma la guia",
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
    private Integer id_guia = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Guia",
            LongName = "Guia",
            Description = "Guia de la cual se escribe",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "guia",
            Width = 4
    )
    private MetaBeanHelper obj_guia = null;
    
    
    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_usuario = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Usuario",
            LongName = "Usuario",
            Description = "Usuario que escribe el comentario",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "usuario",
            Width = 4
    )
    private MetaBeanHelper obj_usuario = null;

    public ComentarioguiaSpecificBeanImplementation() {
    }

    public ComentarioguiaSpecificBeanImplementation(Integer id) {
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

    public Integer getId_guia() {
        return id_guia;
    }

    public void setId_guia(Integer id_guia) {
        this.id_guia = id_guia;
    }

    public MetaBeanHelper getObj_guia() {
        return obj_guia;
    }

    public void setObj_guia(MetaBeanHelper obj_guia) {
        this.obj_guia = obj_guia;
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