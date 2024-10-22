package Ejercicios_matrices;

import java.util.Scanner;

/* Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y transponerla en la segunda. */
public class Ejercicio_6 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int matriz1[][], matrizDos[][], nFilas, nColumnas;
    nFilas = 5; 
    nColumnas = 9; 

   
    matriz1 = new int[nFilas][nColumnas];

    
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nColumnas; j++) {
        System.out.print("Matriz [" + i + "] [" + (j + 1) + "]: ");
        matriz1[i][j] = entrada.nextInt();
      }
    }

    // Imprimir la primera matriz
    System.out.println("\nResultado de la matriz 1:");
    System.out.println("-------------------------------------------------");
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nColumnas; j++) {
        System.out.print(matriz1[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("-------------------------------------------------");

    // Gestionando la segunda matriz (transpuesta)
    matrizDos = new int[nColumnas][nFilas]; // Cambiar dimensiones para la transposición

    // Llenar la matriz transpuesta
    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nColumnas; j++) {
        matrizDos[j][i] = matriz1[i][j]; // Transposición
      }
    }

    // Imprimir la segunda matriz
    System.out.println("\nResultado de la matriz 2 (transpuesta):");
    System.out.println("-------------------------------------------------");
    for (int i = 0; i < nColumnas; i++) {
      for (int j = 0; j < nFilas; j++) {
        System.out.print(matrizDos[i][j] + " ");
      }
      System.out.println("");
    }

    entrada.close();
  }
}
