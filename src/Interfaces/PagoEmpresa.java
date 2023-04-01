package Interfaces;

import Compañia.Empresa;

public interface PagoEmpresa extends Pago {
    void PagarImpuestos(Empresa empresa);
}
