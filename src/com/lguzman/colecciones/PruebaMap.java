package com.lguzman.colecciones;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lguzman
 */
public class PruebaMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("****** Manejo Map - HashMap sin orden*****");
        Map<String, Empleado> mapEmpleados = new HashMap<>();
        mapEmpleados.put("100", new Empleado("Luis 100"));
        mapEmpleados.put("2000", new Empleado("Antonio 2000"));
        mapEmpleados.put("300", new Empleado("Balteri 300"));
        mapEmpleados.put("5000", new Empleado("Zole 5000"));

        System.out.println(mapEmpleados);

        System.out.println("******eliminacion 2000*****");
        mapEmpleados.remove("2000");
        System.out.println(mapEmpleados);

        System.out.println("******duplicados 5000 se reemplaza*****");
        mapEmpleados.put("5000", new Empleado("Zole 5001"));
        System.out.println(mapEmpleados);
        
         System.out.println("******manejo interfaz Entryset*****");
         
         System.out.println(mapEmpleados.entrySet());
         for (Map.Entry<String, Empleado> entry : mapEmpleados.entrySet()) {
            String clave = entry.getKey();
            Empleado empleado = entry.getValue();
             System.out.println("clave: " + clave + " empleado=" + empleado);
        }
    }

}

class Empleado {

    private String nombre;
    private double sueldo;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.sueldo = 1000;
    }

    @Override
    public String toString() {
        return "[ Nombre: " + this.nombre + ", sueldo: " + this.sueldo + "]\n";
    }

}
