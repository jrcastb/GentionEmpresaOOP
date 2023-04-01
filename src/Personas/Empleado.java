package Personas;

import Constantes.Constants;
import Constantes.EstadoCivil;
import Interfaces.PagoEmpleado;
import Ubicacion.Direccion;
import Compañia.Departamento;

import java.math.BigDecimal;
import java.util.Objects;

public class Empleado extends Persona implements PagoEmpleado {
    private Double sueldo;
    private String cargo;
    private Direccion direccion;
    private Departamento departamento;

    public Empleado() {
    }

    public Empleado(Double sueldo, String cargo, Direccion direccion, Departamento departamento) {
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.direccion = direccion;
        this.departamento = departamento;
    }

    public Empleado(Integer id, String documento, String nombre, String apellido, BigDecimal balance, Integer edad, EstadoCivil estadoCivil, Double sueldo, String cargo, Direccion direccion, Departamento departamento) {
        super(id, documento, nombre, apellido, balance, edad, estadoCivil);
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.direccion = direccion;
        this.departamento = departamento;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", direccion=" + direccion +
                ", departamento=" + departamento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(sueldo, empleado.sueldo) && Objects.equals(cargo, empleado.cargo) && Objects.equals(direccion, empleado.direccion) && Objects.equals(departamento, empleado.departamento);
    }

    @Override
    public Double SueldoNeto(Empleado empleado) {
        Double sueldoParcial = empleado.getSueldo();

        sueldoParcial = sueldoParcial - (sueldoParcial* Constants.empleados.get("SALUD"));
        sueldoParcial = sueldoParcial - (sueldoParcial* Constants.PENSION);
        Double sueldoFinal = sueldoParcial - (sueldoParcial*Constants.empleados.get("RETENCION"));

        return sueldoFinal;
    }
}
