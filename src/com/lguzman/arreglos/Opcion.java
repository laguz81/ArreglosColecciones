package com.lguzman.arreglos;

import java.util.Arrays;

/**
 *
 * @author lguzman
 */
public class Opcion {
    
    private int arrayNumeros[];
    private String nombre;
    

    public Opcion(int tamanioArreglo, int multiplo) {
        this.arrayNumeros = new int[tamanioArreglo];
        for (int i = 0; i < tamanioArreglo; i++) {
            this.arrayNumeros[i] = multiplo * (i + 1);
        }
    }

    public Opcion() {
    }

    public void add(int numero) {
        boolean bEncontro = false;
        int tamanioActual = 0;
        if (this.arrayNumeros != null) {
            tamanioActual = this.arrayNumeros.length;
            if (tamanioActual > 0) {
                for (int i = 0; i < tamanioActual; i++) {
                    if (arrayNumeros[i] == numero) {
                        bEncontro = true;
                        break;
                    }
                }
            }
        }
        if (!bEncontro) {
            //varias formas
            //forma 1
            int nuevoTamanio = tamanioActual + 1;
            /*int arrNuevo[] = new int[nuevoTamanio];
            for (int i = 0; i < tamanioActual; i++) {
                arrNuevo[i] = this.arrayNumeros[i];
            }
            arrNuevo[nuevoTamanio - 1] = numero;
            this.arrayNumeros = arrNuevo;
             */
            //forma 2
            /*int arrNuevo[] = Arrays.copyOf(this.arrayNumeros == null ? new int[nuevoTamanio] : this.arrayNumeros, nuevoTamanio);
            arrNuevo[nuevoTamanio - 1] = numero;
            this.arrayNumeros = arrNuevo;
            */
            this.arrayNumeros = Arrays.copyOf(this.arrayNumeros == null ? new int[nuevoTamanio] : this.arrayNumeros, nuevoTamanio);
             this.arrayNumeros [nuevoTamanio - 1] = numero;           
        } else {
            System.out.println("Ya se encuentra ingresado el número: " + numero + " en la lista, ingrese otro");
        }
    }

    /**
     * Funcion imprimir arreglo en pantalla
     */
    public void mostrar() {

        if (this.arrayNumeros != null) {
            System.out.println("Arreglo Resultado");
            for (int i = 0; i < this.arrayNumeros.length; i++) {
                System.out.println("arreglo[" + i + "] = " + this.arrayNumeros[i]);
            }

            System.out.println("Arreglo resultado: " + Arrays.toString(this.arrayNumeros));
        } else {
            System.out.println(" Arreglo vacío..");
        }
        System.out.println("-------");
        System.out.println("");
    }

}
