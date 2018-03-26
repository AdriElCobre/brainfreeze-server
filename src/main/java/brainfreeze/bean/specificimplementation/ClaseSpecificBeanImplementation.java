/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brainfreeze.bean.specificimplementation;

import brainfreeze.bean.genericimplementation.TableGenericBeanImplementation;
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
        TableName = "clase",
        SingularDescription = "Clase",
        PluralDescription = "Clases",
        Icon = "fa fa-list-alt",
        Type = EnumHelper.SourceType.Table
)

public class ClaseSpecificBeanImplementation extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Clase",
            LongName = "Clase del personaje",
            Description = "Clase del personaje de un juego",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedSentence,
            RegexHelp = RegexConstants.capitalizedSentence_Help,
            IsForeignKeyDescriptor = true
    )
    private String descripcion = "";
    
    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Personajes de la clase",
            LongName = "Personajes de la clase",
            Description = "Personajes de la clase",
            Type = EnumHelper.FieldType.Link,
            References = "personaje"
    )
    private Integer link_personaje = null;
    

    public ClaseSpecificBeanImplementation() {
    }

    public ClaseSpecificBeanImplementation(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getLink_personaje() {
        return link_personaje;
    }

    public void setLink_personaje(Integer link_personaje) {
        this.link_personaje = link_personaje;
    }

    
    
    
    
    
}
