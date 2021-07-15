package com.lguzman.colecciones;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author lguzman
 */
public class PruebaTreeSet2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("******Ordenación personalizada - Comparable x numero*****");
        Articulo2 uno = new Articulo2(1, "Este Articulo 1");
        Articulo2 dos = new Articulo2(200, "Articulo 2");
        Articulo2 tres = new Articulo2(3, "Articulo 3");

        TreeSet<Articulo2> listaArticulos = new TreeSet<>();
        listaArticulos.add(dos);
        listaArticulos.add(uno);
        listaArticulos.add(tres);

        imprime(listaArticulos);

        System.out.println("******Ordenación personalizada - Comparator x Descripcion *****");

        ComparatorArticulos comparatorArticulos = new ComparatorArticulos();
        TreeSet<Articulo2> ordenaArticulos = new TreeSet<>(comparatorArticulos);
        ordenaArticulos.add(tres);
        ordenaArticulos.add(dos);
        ordenaArticulos.add(uno);
        imprime(ordenaArticulos);

        System.out.println("******Ordenación personalizada - Comparator x Descripcion con clases anonimas*****");
        TreeSet<Articulo2> ordenaArticulos2 = new TreeSet<>(new Comparator<Articulo2>() {
            public int compare(Articulo2 a, Articulo2 b) {
                String desc1 = a.getDescripcion();
                String desc2 = b.getDescripcion();
                return desc1.compareTo(desc2);
            }
        });
        ordenaArticulos2.add(tres);
        ordenaArticulos2.add(dos);
        ordenaArticulos2.add(uno);

        imprime(ordenaArticulos2);

    }

    public static void imprime(TreeSet<Articulo2> lista) {
        for (Articulo2 articulo : lista) {
            System.out.println(articulo.getNumArticulo() + "-" + articulo.getDescripcion());
        }
    }
}

class Articulo2 implements Comparable<Articulo2> {

    private int numArticulo;
    private String descripcion;

    public Articulo2() {

    }

    public Articulo2(int num, String desc) {
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
    public int compareTo(Articulo2 t) {
        return numArticulo - t.numArticulo;
    }

}

class ComparatorArticulos implements Comparator<Articulo2> {

    @Override
    public int compare(Articulo2 a, Articulo2 b) {
        String desc1 = a.getDescripcion();
        String desc2 = b.getDescripcion();
        return desc1.compareTo(desc2);
    }

}
