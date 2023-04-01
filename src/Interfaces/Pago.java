package Interfaces;

import Compañia.Empresa;
import Personas.Persona;

import java.math.BigDecimal;

public interface Pago {
    StringBuilder Cobrar(Persona persona, Empresa empresa, Double monto);
    StringBuilder Pagar(Persona persona, Empresa empresa, Double monto);
}
