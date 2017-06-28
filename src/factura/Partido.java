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
public class Partido{
    private Provincia provincia;
    private String Nombre;
    private String Alias;

    public Provincia getProvincia() {
        return provincia;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getAlias() {
        return Alias;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }
    
}
