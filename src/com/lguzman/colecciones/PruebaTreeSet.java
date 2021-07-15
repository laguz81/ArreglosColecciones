package com.lguzman.colecciones;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author lguzman
 */
public class PruebaTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("****** Manejo Treeset - Arbol ordena automáticamente*****");
        TreeSet<String> listaPersonas = new TreeSet<>();
        listaPersonas.add("Luis");
        listaPersonas.add("Antonio");
        listaPersonas.add("Samir");
        listaPersonas.add("Pablo");
        System.out.println(listaPersonas);

        System.out.println("******Ordenación personalizada - Comparable x numero*****");
        Articulo uno = new Articulo(1, "Este Articulo 1");
        Articulo dos = new Articulo(200, "Articulo 2");
        Articulo tres = new Articulo(3, "Articulo 3");

        TreeSet<Articulo> listaArticulos = new TreeSet<>();
        listaArticulos.add(dos);
        listaArticulos.add(uno);
        listaArticulos.add(tres);

        imprime(listaArticulos);

        System.out.println("******Ordenación personalizada - Comparator x Descripcion *****");

        Articulo comparatorArticulo = new Articulo();
        TreeSet<Articulo> ordenaArticulos = new TreeSet<>(comparatorArticulo);
        ordenaArticulos.add(tres);
        ordenaArticulos.add(dos);
        ordenaArticulos.add(uno);

        imprime(ordenaArticulos);

    }

    public static void imprime(TreeSet<Articulo> lista) {
        for (Articulo articulo : lista) {
            System.out.println(articulo.getNumArticulo() + "-" + articulo.getDescripcion());
        }
    }
}

class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

    private int numArticulo;
    private String descripcion;

    public Articulo() {

    }

    public Articulo(int num, String desc) {
        this.numArticulo = num;
        this.descripcion = desc;
    }

    public int getNumArticulo() {
        return this.numArticulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public int compareTo(Articulo t) {
        return numArticulo - t.numArticulo;
    }

    @Override
    public int compare(Articulo a, Articulo b) {
        String desc1 = a.getDescripcion();
        String desc2 = b.getDescripcion();
        return desc1.compareTo(desc2);
    }

}
