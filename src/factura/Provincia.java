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
public class Provincia {
    private Pais pais;
    private String Nombre;
    private String Alias;

    public Pais getPais() {
        return pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getAlias() {
        return Alias;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }
    
}


