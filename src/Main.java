import Compañia.Departamento;
import Compañia.Empresa;
import Constantes.EstadoCivil;
import Personas.Empleado;
import Personas.Persona;
import Ubicacion.Direccion;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Persona persona = Persona.builder()
                .id(1)
                .nombre("Jose", "Castillo")
                .documento("10254963ASD")
                .balance(BigDecimal.valueOf(10000000))
                .edad(26)
                .estadoCivil(EstadoCivil.CASADO)
                .build();

        // 0. Crear dirección de la empresa
        Direccion direccionNodo = Direccion.builder()
                .calle("Calle falsa")
                .numero(123)
                .codigoPostal(1001011)
                .ciudad("Bogota")
                .localidad("Suba")
                .build();
        Direccion direccionFelipe = Direccion.builder()
                .calle("Calle falsa")
                .numero(123)
                .codigoPostal(1001011)
                .ciudad("Bogota")
                .localidad("Suba")
                .build();
        // 1. Crear Departamento
        Departamento sistemas = new Departamento();
        // 2. Crear Empleados
        Empleado Felipe = new Empleado(2, "10489628", "Felipe", "Castro", BigDecimal.valueOf(2158845154D),35,
                EstadoCivil.UNION_LIBRE, 1500000D,"Desarrollador", direccionFelipe, sistemas);
        // 3. Crear una empresa
        Empresa nodo = new Empresa("NODO", "1574889-H", new ArrayList<>(), direccionNodo, BigDecimal.valueOf(1124856677557D));

        System.out.println(Felipe.SueldoNeto(Felipe));
    }
}