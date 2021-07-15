/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lguzman.colecciones;

import com.lguzman.colecciones.model.Cliente;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 *
 * @author lguzman
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Luis", "001", 100.555);
        Cliente cli2 = new Cliente("Omar", "002", 1000);
        Cliente cli3 = new Cliente("Sara", "003", 5000);
        Cliente cli4 = new Cliente("Ernesto", "004", 355.27);
        Cliente cli5 = new Cliente("Luis", "001", 100.555);

        System.out.println(cli1.hashCode());

        System.out.println(cli5.hashCode());

        System.out.println("******* Manejo de Set - no duplicados ******");
        //Escoger la coleccion que se ajuste
        // Se repiten
        // Operaciones CRUD frecuencia
        // Solo consulta ordenada
        Set<Cliente> listaSetClientes = new HashSet<>(); //new Set<>();
        listaSetClientes.add(cli2);
        System.out.println("Ingreso a la lista de " + cli2.getNombre());
        listaSetClientes.add(cli1);
        System.out.println("Ingreso a la lista de " + cli1.getNombre());

        listaSetClientes.add(cli3);
        System.out.println("Ingreso a la lista de " + cli3.getNombre());
        listaSetClientes.add(cli4);
        System.out.println("Ingreso a la lista de " + cli4.getNombre());

        System.out.println("******* Impresión en cualquier orden ******");
        for (Cliente cliente : listaSetClientes) {
            System.out.printf("Nombre: %s  Cuenta: %s  Saldo: %1.2f \n", cliente.getNombre(), cliente.getNroCuenta(), cliente.getSaldo());
        }

        //control de objetos duplicados equals  hashCode
        System.out.println("******* Agregamos a la lista otra vez a Luis ******");
        listaSetClientes.add(cli5);
        System.out.println();
        System.out.println("******* Controla los duplicados no aparece Luis 2 veces ******");
        for (Cliente cliente : listaSetClientes) {
            System.out.printf("Nombre: %s  Cuenta:%s  Saldo: %1.2f \n", cliente.getNombre(), cliente.getNroCuenta(), cliente.getSaldo());
//            if (cliente.getNroCuenta().equals("002")){
//                listaSetClientes.remove(cliente);
//            }
        }
        System.out.println();
        System.out.println("El cliente 1 es igual al cliente 5 " + cli1.equals(cli5));

        System.out.println("cliente 1 hashcode: " + cli1.hashCode());
        System.out.println("cliente 5 hashcode: " + cli5.hashCode());

        System.out.println("******* Recorrido por iterator y eliminación ******");
        //iteradores  next, hasnext remove
        Iterator<Cliente> it = listaSetClientes.iterator();

        while (it.hasNext()) {
            /*String nombre = it.next().getNombre();
            System.out.print(nombre + " ");

            String nroCuenta = it.next().getNroCuenta();
            System.out.println(nroCuenta);*/

            Cliente cliente = it.next();
            System.out.println(cliente.getNombre() + " " + cliente.getNroCuenta());

              
            if (cliente.getNroCuenta().equals("003")) {
                System.out.println("******* Eliminación de la lista la cuenta 003 ******");
                it.remove();
            }

        }

        for (Cliente cliente : listaSetClientes) {
            System.out.printf("Nombre: %s  Cuenta:%s  Saldo: %1.2f \n", cliente.getNombre(), cliente.getNroCuenta(), cliente.getSaldo());
        }

        System.out.println();
        System.out.println("******* Manejo de List soporta duplicados ******");
        //Manejo de Listas  ArrayList
        List<Cliente> listClientes = new ArrayList<>();
        listClientes.add(cli1);
        listClientes.add(cli2);
        listClientes.add(cli3);
        listClientes.add(cli4);
        listClientes.add(cli5);

        System.out.println("******* Impresión de acuerdo al orden inicial ******");

        for (Cliente cliente : listClientes) {
            System.out.printf("Nombre: %s  Cuenta:%s  Saldo: %1.2f \n", cliente.getNombre(), cliente.getNroCuenta(), cliente.getSaldo());
        }

        System.out.println();
        List<Cliente> listLinkClientes = new LinkedList<>();
        listLinkClientes.add(cli1);
        listLinkClientes.add(cli2);
        listLinkClientes.add(cli3);
        listLinkClientes.add(cli4);
        listLinkClientes.add(cli5);

        for (Cliente cliente : listLinkClientes) {
            System.out.printf("Nombre: %s  Cuenta:%s  Saldo: %1.2f \n", cliente.getNombre(), cliente.getNroCuenta(), cliente.getSaldo());
        }

        System.out.println();
        //cast
        ListIterator<Cliente> iterator = (ListIterator<Cliente>) listLinkClientes.iterator();
        iterator.next();
        System.out.println("******* Insertamos otro Ernesto después del primero ******");
        iterator.add(cli4);

        for (Cliente cliente : listLinkClientes) {
            System.out.printf("Nombre: %s  Cuenta:%s  Saldo: %1.2f \n", cliente.getNombre(), cliente.getNroCuenta(), cliente.getSaldo());
        }

    }

}
