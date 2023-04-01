package Compañia;

import Personas.Persona;

import java.time.LocalDate;

public class Contrato {
    private LocalDate fechaCreacion;
    private Persona persona;
    private Empresa empresa;
    private Double monto;

    public Contrato(){

    }
    public Contrato(LocalDate fechaCreacion, Persona persona, Empresa empresa, Double monto) {
        this.fechaCreacion = fechaCreacion;
        this.persona = persona;
        this.empresa = empresa;
        this.monto = monto;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "fechaCreacion=" + fechaCreacion +
                ", persona=" + persona +
                ", empresa=" + empresa +
                ", monto=" + monto +
                '}';
    }
}
