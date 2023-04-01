package Compañia;

import Personas.Empleado;

import java.util.List;


public class Departamento {

    private Integer id;
    private String nombre;
    private String categoria;
    private Empresa empresa;
    private List<Empleado> empleados;

    public Departamento(){

    }
    public Departamento(Integer id, String nombre, String categoria, Empresa empresa, List<Empleado> empleados) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.empresa = empresa;
        this.empleados = empleados;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", empresa=" + empresa +
                ", empleados=" + empleados +
                '}';
    }

    //TODO: Metodo para dar de alta empleados
    public void crearEmpleado(Empleado empleado){
        if (!empleados.contains(empleado)){
            empleados.add(empleado);
            System.out.println("Se agregó el empleado " + empleado);
        }
    }

    //TODO: Metodo para dar de baja empleados
    public void eliminarEmpleado(Empleado empleado){
        if (empleados.contains(empleado)){
            empleados.remove(empleado);
            System.out.println("se eliminó el empleado " + empleado);
        }
    }
}
