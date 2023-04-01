package Personas;

import Constantes.EstadoCivil;

import java.math.BigDecimal;

public class PersonaBuilder {
    private Integer id;
    private String documento;
    private String nombre;
    private String apellido;
    private BigDecimal balance;
    private Integer edad;
    private EstadoCivil estadoCivil;
    public PersonaBuilder(){

    }
    public Persona build(){
        Persona persona = new Persona(this);
        return persona;
    }

    public PersonaBuilder id(Integer id){
        this.id = id;
        return this;
    }
    public PersonaBuilder documento(String documento){
        this.documento = documento;
        return this;
    }
    public PersonaBuilder nombre(String nombre, String Apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        return this;
    }

    public PersonaBuilder balance(BigDecimal balance){
        this.balance = balance;
        return this;
    }

    public PersonaBuilder edad(Integer edad){
        this.edad = edad;
        return this;
    }

    public PersonaBuilder estadoCivil(EstadoCivil estadoCivil){
        this.estadoCivil = estadoCivil;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
