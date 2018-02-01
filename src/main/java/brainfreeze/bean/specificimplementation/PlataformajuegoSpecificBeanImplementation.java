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
        TableName = "plataformajuego",
        SingularDescription = "plataforma juego",
        PluralDescription = "plataformas juegos",
        Icon = "fa fa-user",
        Type = EnumHelper.SourceType.Table
)

public class PlataformajuegoSpecificBeanImplementation extends TableGenericBeanImplementation {

    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_plataforma = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Plat",
            LongName = "Plataforma",
            Description = "Plataforma en la que se juega",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "plataforma",
            Width = 4
    )
    private MetaBeanHelper obj_plataforma = null;

    @Expose(serialize = false)
    @MetaPropertyBeanInterface(
            Type = EnumHelper.FieldType.ForeignId
    )
    private Integer id_juego = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Juego",
            LongName = "Juego",
            Description = "Juego al que se juega",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "juego",
            Width = 4
    )
    private MetaBeanHelper obj_juego = null;

    public PlataformajuegoSpecificBeanImplementation() {
    }

    public PlataformajuegoSpecificBeanImplementation(Integer id) {
        this.id = id;
    }

    public Integer getId_plataforma() {
        return id_plataforma;
    }

    public void setId_plataforma(Integer id_plataforma) {
        this.id_plataforma = id_plataforma;
    }

    public MetaBeanHelper getObj_plataforma() {
        return obj_plataforma;
    }

    public void setObj_plataforma(MetaBeanHelper obj_plataforma) {
        this.obj_plataforma = obj_plataforma;
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
