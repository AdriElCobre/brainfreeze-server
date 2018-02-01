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
        TableName = "genero",
        SingularDescription = "Género",
        PluralDescription = "Géneros",
        Icon = "fa fa-list-alt",
        Type = EnumHelper.SourceType.Table
)


public class GeneroSpecificBeanImplementation extends TableGenericBeanImplementation {

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Género",
            LongName = "Género del juego",
            Description = "Género en el que se clasifica un juego",
            Type = EnumHelper.FieldType.String,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedSentence,
            RegexHelp = RegexConstants.capitalizedSentence_Help,
            IsForeignKeyDescriptor = true
    )
    private String descripcion = "";

    public GeneroSpecificBeanImplementation() {
    }

    public GeneroSpecificBeanImplementation(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
    
    
}
