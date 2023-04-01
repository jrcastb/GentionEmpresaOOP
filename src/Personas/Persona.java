package Personas;

import Compañia.Empresa;
import Constantes.EstadoCivil;
import Interfaces.Pago;

import java.math.BigDecimal;

public class Persona implements Pago {
    private Integer id;
    private String documento;
    private String nombre;
    private String apellido;
    private BigDecimal balance;
    private Integer edad;
    private EstadoCivil estadoCivil;

    public Persona(){

    }
    public Persona(Integer id, String documento, String nombre, String apellido, BigDecimal balance, Integer edad, EstadoCivil estadoCivil) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.balance = balance;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }
    public Persona(PersonaBuilder builder){
        this.id = builder.getId();
        this.documento = builder.getDocumento();
        this.nombre = builder.getNombre();
        this.apellido = builder.getApellido();
        this.balance = builder.getBalance();
        this.edad = builder.getEdad();
        this.estadoCivil = builder.getEstadoCivil();
    }

    public static PersonaBuilder builder(){
        return new PersonaBuilder();
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

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", balance=" + balance +
                ", edad=" + edad +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }

    @Override
    public StringBuilder Cobrar(Persona persona, Empresa empresa, Double monto) {

        StringBuilder result = new StringBuilder();

        BigDecimal personaResult = persona.getBalance().add(BigDecimal.valueOf(monto));

        BigDecimal empresaResult = empresa.getBalance().subtract(BigDecimal.valueOf(monto));

        result.append("La empresa ")
                .append(empresa)
                .append("Pagó un monto de ")
                .append(monto)
                .append("a la persona ")
                .append(persona);

        return result;
    }

    @Override
    public StringBuilder Pagar(Persona persona, Empresa empresa, Double monto) {
        StringBuilder result = new StringBuilder();

        BigDecimal empresaResult = empresa.getBalance().add(BigDecimal.valueOf(monto));

        BigDecimal personaResult = persona.getBalance().subtract(BigDecimal.valueOf(monto));

        result.append("La empresa ")
                .append(empresa)
                .append("Pagó un monto de ")
                .append(monto)
                .append("a la persona ")
                .append(persona);

        return result;

    }
}
