package Ejercicios_matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y cada columna */

public class Ejercicio_6 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int matriz[][], nFilas, nColumnas, sumaFilas = 0, sumaColumnas;
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas que desee en la tabla")); // filas = 2
    nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas que desee en la tabla")); // columnas
                                                                                                             // = 3

    // Definiendo longtud de la tabla o de la matriz
    matriz = new int[nFilas][nColumnas];

    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nColumnas; j++) {
        System.out.print("Matriz [" + i + "] [" + (j + 1) + "]: ");
        matriz[i][j] = entrada.nextInt();
      }
    }

    // Imprimir matriz
    System.out.println("\nResultado de la matriz: ");
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nColumnas; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println("");
    }

    // Sumar filas y columnas

    // suma de filas
    System.out.println("\nSuma de filas: ");
    for (int i = 0; i < nFilas; i++) {
      sumaFilas = 0; //cada vez que el iterador llegue a 3 la variable sumaFIlas vuelve a ser 0
      for (int j = 0; j < nFilas; j++) {
        sumaFilas += matriz[i][j];
      }
      System.out.println("La suma de la fila ["+ i +"] es: "+sumaFilas);
    }

    // suma de columnas
    System.out.println("\nSuma de Columnas: ");
    for (int j = 0; j < nColumnas; j++) {
      sumaColumnas = 0; //cada vez que el iterador llegue a 3 la variable sumaFIlas vuelve a ser 0
      for (int i = 0; i < nFilas; i++) {
        sumaColumnas += matriz[i][j];
      }
      System.out.println("La suma de la fila ["+ j +"] es: "+sumaColumnas);
    }

    entrada.close();
  }
}
