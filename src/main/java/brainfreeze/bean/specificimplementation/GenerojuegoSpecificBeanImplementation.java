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


/**
 *
 * @author a024441493z
 */

@MetaObjectBeanInterface(
        TableName = "generojuego",
        SingularDescription = "Género juego",
        PluralDescription = "Géneros juegos",
        Icon = "fa fa-user",
        Type = EnumHelper.SourceType.Table
)

public class GenerojuegoSpecificBeanImplementation extends TableGenericBeanImplementation {

   @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_genero = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Género",
            LongName = "Género",
            Description = "Género del juego",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "genero",
            Width = 4
    )
    private MetaBeanHelper obj_genero = null;

    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_juego = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Juego",
            LongName = "Juego",
            Description = "Juego que se juega",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "juego",
            Width = 4
    )
    private MetaBeanHelper obj_juego = null;

    public GenerojuegoSpecificBeanImplementation() {
    }

    public GenerojuegoSpecificBeanImplementation(Integer id) {
        this.id = id;
    }

    public Integer getId_genero() {
        return id_genero;
    }

    public void setId_genero(Integer id_genero) {
        this.id_genero = id_genero;
    }

    public MetaBeanHelper getObj_genero() {
        return obj_genero;
    }

    public void setObj_genero(MetaBeanHelper obj_genero) {
        this.obj_genero = obj_genero;
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

   

  
    
    
    
    
}
