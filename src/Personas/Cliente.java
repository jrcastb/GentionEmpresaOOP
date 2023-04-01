package Personas;

import Compañia.Contrato;
import Compañia.Empresa;
import Constantes.EstadoCivil;
import Interfaces.PagoCliente;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cliente extends Persona implements PagoCliente {

    private Empresa empresa;
    private Empleado empleado;
    public Cliente(){

    }
    public Cliente(Empresa empresa, Empleado empleado) {
        this.empresa = empresa;
        this.empleado = empleado;
    }

    public Cliente(Integer id, String documento, String nombre, String apellido, BigDecimal balance, Integer edad, EstadoCivil estadoCivil, Empresa empresa, Empleado empleado) {
        super(id, documento, nombre, apellido, balance, edad, estadoCivil);
        this.empresa = empresa;
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "empresa=" + empresa +
                ", empleado=" + empleado +
                '}';
    }

    @Override
    public StringBuilder ContratarServicio(Cliente cliente, Empresa empresa, Double monto, String servicio) {
        Contrato contrato = new Contrato();
        contrato.setPersona(cliente);
        contrato.setEmpresa(empresa);
        contrato.setFechaCreacion(LocalDate.now());
        contrato.setMonto(monto);

        StringBuilder response = new StringBuilder();
        response.append("El cliente ")
                .append(cliente.getNombre() + " ")
                .append(cliente.getApellido())
                .append(" contrató el servicio de ")
                .append(servicio)
                .append(" con la empresa ")
                .append(empresa.getNombre());

        return response;
    }
}
