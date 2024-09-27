package Ejercicios_matrices;

import java.util.Scanner;

/* Ejercicio 4: Crear una matriz de tamaño 7x7 y rellenarla de forma que 
  de forma que los elementos de la diagonal principal sea 1 y el resto 0.
 */
public class Ejercicio_4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int matriz[][] = new int[7][7];

    // Llenando la matriz
    System.out.println("Llenando la matriz: ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        System.out.print("Matriz: [" + i + "] [" + j + "]: ");
        matriz[i][j] = entrada.nextInt();

        if (i == j) {
          matriz[i][j] = 1; // Elementos de la diagonal principal
        } else {
          matriz[i][j] = 0; // Resto de los elementos
        }
      }
    }

    // Imprimiendo la matriz
    System.out.println("Llenando la matriz: ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println("");
    }

    entrada.close();
  }
}
