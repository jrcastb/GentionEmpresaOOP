package Constantes;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final Double RENTA = 0.35D;
    public static final Double SALUD = 0.12D;
    public static final Double PENSION = 0.16D;
    public static final Double RETENCION = 0.05D;

    public static final Map<String, Double> empleados = new HashMap<>();
    static {
        empleados.put("SALUD", 0.12D);
        empleados.put("PENSION", 0.16D);
        empleados.put("RETENCION", 0.05D);
    }
    public static final Map<String, Double> empresa = new HashMap<>();
    static {
        empleados.put("RENTA", 0.35D);
    }
}
