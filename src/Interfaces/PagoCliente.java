package Interfaces;

import Compañia.Empresa;
import Personas.Cliente;

public interface PagoCliente extends Pago{
    StringBuilder ContratarServicio(Cliente cliente, Empresa empresa, Double monto, String servicio);
}
