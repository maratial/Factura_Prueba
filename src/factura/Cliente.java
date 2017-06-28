/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author alumno
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String calle;
    private Number altura;
    private String pis_dto;
    private String observaciones;
    private Localidad localidad;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCalle() {
        return calle;
    }

    public Number getAltura() {
        return altura;
    }

    public String getPis_dto() {
        return pis_dto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setAltura(Number altura) {
        this.altura = altura;
    }

    public void setPis_dto(String pis_dto) {
        this.pis_dto = pis_dto;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Localidad getLocalidad() {
        return localidad;
    }
    
}
