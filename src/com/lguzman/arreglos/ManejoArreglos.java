package com.lguzman.arreglos;

import java.util.Scanner;

/**
 * Clase Principal ejemplo de arreglos
 *
 * @author lguzman
 */
public class ManejoArreglos {

    /**
     * Ingreso principal
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("/**** Manejo de Arreglo ***/"); 
        String opcionLetra;
        
        do {
            System.out.println("a. Opción a");
            System.out.println("b. Opción b");
            System.out.println("c. Salir");
            System.out.print("*** Escoja la opción: ");
            Scanner reader = new Scanner(System.in);
            opcionLetra = reader.next().toLowerCase();

            int numero;
            switch (opcionLetra) {
                case "a":
                    int tamanioArreglo;
                    int multiplo;
                    do {
                        System.out.println("Operación a:");
                        System.out.print("Ingrese el tamaño del arreglo o 0 para regresar al menú principal: ");
                        reader = new Scanner(System.in);
                        numero = reader.nextInt();
                        if (numero != 0) {
                            tamanioArreglo = numero;
                            System.out.print("Ingrese un número para calcular los múltiplos o 0 para regresar al menú principal: ");
                            numero = reader.nextInt();
                            if (numero != 0) {
                                multiplo = numero;
                                System.out.println("Calculando....");
                                Opcion opciona = new Opcion(tamanioArreglo, multiplo);                               
                                opciona.mostrar();
                                break;
                            }
                        }
                    } while (numero != 0);
                    break;

                case "b":
                    Opcion opcionb = new Opcion();
                    System.out.println("Operación b:");
                    System.out.println("Ingrese los números de la lista o 0 para imprimir la lista y regresar al menú principal: ");
                    do {
                        reader = new Scanner(System.in);
                        numero = reader.nextInt();
                        if (numero != 0) {
                            opcionb.add(numero);
                        } else {
                            opcionb.mostrar();
                        }

                    } while (numero != 0);
                    break;
                case "c":
                    System.out.println("Gracias por usar Manejo de arreglos, programa terminado .....\n");
                    break;
                default:
                    System.out.println(" ---- Opción no válida ----\n");
            }
        } while (!opcionLetra.equals("c"));
    }

}
