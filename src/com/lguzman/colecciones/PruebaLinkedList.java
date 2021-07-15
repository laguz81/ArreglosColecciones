/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lguzman.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author lguzman
 */
public class PruebaLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> paises = new LinkedList<>();
        //ArrayList<String> paises = new ArrayList<>();
        paises.add("Ecuador");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Perú");

       
        LinkedList<String> capitales = new LinkedList<>();
        //ArrayList<String> capitales = new ArrayList<>();
        capitales.add("Quito");
        capitales.add("Bogotá");
        capitales.add("DF");
        capitales.add("Lima");

        System.out.println(paises);
        System.out.println(capitales);

        //Ecuador
        //Quito
        //Colombia
        //Bogota
        //Mexico
        //DF
        //Perú
        //Lima
        ListIterator<String> itPaises = paises.listIterator();
        ListIterator<String> itCapitales = capitales.listIterator();

        while (itCapitales.hasNext()) {
            if (itPaises.hasNext()) {
                itPaises.next();
            }
            itPaises.add(itCapitales.next());
        }
        System.out.println(paises);

        itCapitales = capitales.listIterator();

        ///2 ejercicio Eliminar capitales pares
        while (itCapitales.hasNext()) {
            itCapitales.next();
            if (itCapitales.hasNext()) {
                itCapitales.next();
                itCapitales.remove();
            }

        }
        System.out.println(capitales);        
        
        //3 Ejercicio eliminar de paises la lista de capitales anterior
         paises.removeAll(capitales);
         System.out.println(paises);
    }

}
