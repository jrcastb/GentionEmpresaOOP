package Ubicacion;

public class DireccionBuilder {
    private String calle;
    private Integer numero;
    private Integer codigoPostal;
    private String ciudad;
    private String localidad;

    public Direccion build(){
        return new Direccion(this);
    }

    public DireccionBuilder calle(String calle){
        this.calle = calle;
        return this;
    }
    public DireccionBuilder numero(Integer numero){
        this.numero = numero;
        return this;
    }
    public DireccionBuilder codigoPostal(Integer codigoPostal){
        this.codigoPostal = codigoPostal;
        return this;
    }
    public DireccionBuilder ciudad(String ciudad){
        this.ciudad = ciudad;
        return this;
    }
    public DireccionBuilder localidad(String localidad){
        this.localidad = localidad;
        return this;
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
}
