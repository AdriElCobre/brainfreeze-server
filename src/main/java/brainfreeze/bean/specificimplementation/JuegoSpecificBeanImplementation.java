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
        Icon = "fa fa-user",
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
            IsForeignKeyDescriptor = false,
            Width = 3,
            MaxLength = 100,
            IsVisible = false
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
            IsVisible = false
    )
    private String desarrolladora;

    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Fecha",
            LongName = "Fecha",
            Description = "Fecha del lanzamiento",
            Type = EnumHelper.FieldType.Date,
            IsRequired = true,
            RegexPattern = RegexConstants.capitalizedName,
            RegexHelp = RegexConstants.capitalizedName_Help,
            IsForeignKeyDescriptor = true,
            Width = 3,
            MaxLength = 100
    )
    private Date fechalanzamiento;
    
    
    @Expose
    @MetaPropertyBeanInterface(
            ShortName = "Precio",
            LongName = "precio",
            Description = "Precio del juego",
            Type = EnumHelper.FieldType.Decimal
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
    private Integer id_administrador = 0;

    @Expose(deserialize = false)
    @MetaPropertyBeanInterface(
            ShortName = "Admin",
            LongName = "Administrador",
            Description = "Administrador que lo añade",
            Type = EnumHelper.FieldType.ForeignObject,
            IsRequired = true,
            References = "administrador",
            Width = 4
    )
    private MetaBeanHelper obj_administrador = null;

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

    public Integer getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(Integer id_administrador) {
        this.id_administrador = id_administrador;
    }

    public MetaBeanHelper getObj_administrador() {
        return obj_administrador;
    }

    public void setObj_administrador(MetaBeanHelper obj_administrador) {
        this.obj_administrador = obj_administrador;
    }
    
    
    
}
