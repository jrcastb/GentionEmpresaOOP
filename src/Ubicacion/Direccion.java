package Ubicacion;

import Personas.PersonaBuilder;

public class Direccion {
    private String calle;
    private Integer numero;
    private Integer codigoPostal;
    private String ciudad;
    private String localidad;

    public Direccion(){

    }
    public Direccion(String calle, Integer numero, Integer codigoPostal, String ciudad, String localidad) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.localidad = localidad;
    }
    public Direccion(DireccionBuilder builder){
        this.calle = builder.getCalle();
        this.numero = builder.getNumero();
        this.codigoPostal = builder.getCodigoPostal();
        this.ciudad = builder.getCiudad();
        this.localidad = builder.getLocalidad();
    }

    public static DireccionBuilder builder(){
        return new DireccionBuilder();
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", codigoPostal=" + codigoPostal +
                ", ciudad='" + ciudad + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
