package Compañia;

import Interfaces.PagoEmpresa;
import Personas.Persona;
import Ubicacion.Direccion;
import Constantes.Constants;
import java.math.BigDecimal;
import java.util.List;

public class Empresa implements PagoEmpresa {
    private String nombre;
    private String nit;
    private List<Departamento> departamentos;
    private Direccion direccion;
    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Empresa(){

    }
    public Empresa(String nombre, String nit, List<Departamento> departamentos, Direccion direccion, BigDecimal balance) {
        this.nombre = nombre;
        this.nit = nit;
        this.departamentos = departamentos;
        this.direccion = direccion;
        this.balance = balance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", departamentos=" + departamentos +
                ", direccion=" + direccion +
                '}';
    }

    @Override
    public StringBuilder Cobrar(Persona persona, Empresa empresa, Double monto) {

        StringBuilder result = new StringBuilder();

        BigDecimal empresaResult = empresa.getBalance().add(BigDecimal.valueOf(monto));

        BigDecimal personaResult = persona.getBalance().subtract(BigDecimal.valueOf(monto));

        result.append("La empresa ")
                .append(empresa.getNombre())
                .append(" cobró un monto de ")
                .append(monto)
                .append(" a la persona ")
                .append(persona.getNombre() + " ")
                .append(persona.getApellido());

        return result;
    }

    @Override
    public StringBuilder Pagar(Persona persona, Empresa empresa, Double monto) {
        StringBuilder result = new StringBuilder();

        BigDecimal personaResult = persona.getBalance().add(BigDecimal.valueOf(monto));

        BigDecimal empresaResult = empresa.getBalance().subtract(BigDecimal.valueOf(monto));

        result.append("La empresa ")
                .append(empresa.getNombre())
                .append(" cobró un monto de ")
                .append(monto)
                .append(" a la persona ")
                .append(persona.getNombre() + " ")
                .append(persona.getApellido());

        return result;
    }

    @Override
    public void PagarImpuestos(Empresa empresa) {
        System.out.println("Pagando impuesto de renta sobre utilidades, la empresa pagó: " +
                empresa.getBalance().multiply(BigDecimal.valueOf(Constants.RENTA)));
        System.out.println("Se realizó un cobro del " + Constants.empresa.get("RENTA") * 100 + "%" +
                "correspondiente a la renta sobre utilidades");
    }

    //TODO: Metodo para dar de alta departamentos
    //Con un HashSet en lugar de una List podemos evitar la validación de valores repetidos.
    public void crearDepartamento(Departamento departamento){
        if (!departamentos.contains(departamento)){
            departamentos.add(departamento);
            System.out.println("se agregó el departamento " + departamento);
        }
    }
    //TODO: Metodo para dar de baja departamentos
    public void eliminarDepartamento(Departamento departamento){
        if (departamentos.contains(departamento)){
            departamentos.remove(departamento);
            System.out.println("se eliminó el departamento " + departamento);
        }
    }

}
