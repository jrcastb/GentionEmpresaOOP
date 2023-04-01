package Interfaces;

import Personas.Empleado;

public interface PagoEmpleado extends Pago{
    Double SueldoNeto(Empleado empleado); //calcular salario neto de un empleado
}
