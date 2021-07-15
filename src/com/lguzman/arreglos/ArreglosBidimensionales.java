package com.lguzman.arreglos;

/**
 *
 * @author lguzman
 */
public class ArreglosBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matriz;
        matriz = new int[3][4];
        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[0][2] = 30;
        matriz[0][3] = 40;

        matriz[1][0] = 50;
        matriz[1][1] = 60;
        matriz[1][2] = 70;
        matriz[1][3] = 80;

        matriz[2][0] = 90;
        matriz[2][1] = 100;
        matriz[2][2] = 110;
        matriz[2][3] = 120;

        for (int fila = 0; fila < 3; fila++) {
            System.out.println();
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("[" + fila + "," + columna + "] = " + matriz[fila][columna] + "  ");
            }
        }
        
         System.out.println("");

        int[][] matriz2 = {{10,20,30,40},
        {50,60,70,80},
        {90,100,110,120}};
        
        for (int[] fila : matriz2) {
            System.out.println("");
            for (int columna : fila) {
               System.out.print(columna + " ");
            }
        }

    }

}
