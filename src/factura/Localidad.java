/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author PC06
 */
public class Localidad {
    private Class Partido;
    private String Nombre;
    private String Alias;
    private String Cod_Area;

    public Class getPartido() {
        return Partido;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getAlias() {
        return Alias;
    }

    public String getCod_Area() {
        return Cod_Area;
    }

    public void setPartido(Class Partido) {
        this.Partido = Partido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public void setCod_Area(String Cod_Area) {
        this.Cod_Area = Cod_Area;
    }
    
    
}
