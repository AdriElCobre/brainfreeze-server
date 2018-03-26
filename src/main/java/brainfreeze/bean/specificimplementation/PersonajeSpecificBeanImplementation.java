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
        TableName = "personaje",
        SingularDescription = "Personaje",
        PluralDescription = "Personajes",
        Icon = "fa fa-user",
        Type = EnumHelper.SourceType.Table
)


public class PersonajeSpecificBeanImplementation extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Nombre",
            LongName = "Nombre",
            Description = "Nombre del personaje",
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
            ShortName = "Pers",
            LongName = "Personaje de un juego",
            Description = "Personaje que aparece en un juego",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedSentence,
            RegexHelp = RegexConstants.capitalizedSentence_Help,
            IsForeignKeyDescriptor = true
    )
    private String descripcion = "";
    
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Fac",
            LongName = "Faccion del personaje",
            Description = "Facción a la que pertenece el personaje",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedSentence,
            RegexHelp = RegexConstants.capitalizedSentence_Help,
            IsForeignKeyDescriptor = false
    )
    private String faccion = "";
    
    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_juego = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Juego",
            LongName = "Juego",
            Description = "Juego al que pertenece el personaje",
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
    private Integer id_clase = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Clase",
            LongName = "Clase",
            Description = "Clase del personaje",
            Type = EnumHelper.FieldType.ForeignObject,
            
            References = "clase",
            Width = 4
    )
    private MetaBeanHelper obj_clase = null;

    public PersonajeSpecificBeanImplementation() {
    }

    public PersonajeSpecificBeanImplementation(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFaccion() {
        return faccion;
    }

    public void setFaccion(String faccion) {
        this.faccion = faccion;
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

    public Integer getId_clase() {
        return id_clase;
    }

    public void setId_clase(Integer id_clase) {
        this.id_clase = id_clase;
    }

    public MetaBeanHelper getObj_clase() {
        return obj_clase;
    }

    public void setObj_clase(MetaBeanHelper obj_clase) {
        this.obj_clase = obj_clase;
    }

    
    
    
    
    
}
