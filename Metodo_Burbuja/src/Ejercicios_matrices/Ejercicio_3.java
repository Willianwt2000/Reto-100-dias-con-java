/*Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla */
package Ejercicios_matrices;

import java.util.Scanner;

public class Ejercicio_3 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int[][] matriz = new int[3][3];

    // Rellenar la primera matriz
    System.out.println("Digite los números de la primera matriz:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("Matriz [" + i + "] [" + j + "] : ");
        matriz[i][j] = entrada.nextInt();
      }
    }

    // Imprimir las matriz original
    System.out.println("Matriz original");
    System.out.println("-------------------------------------------------");

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.printf(matriz[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("-------------------------------------------------");

    // Trasnponiendo la matriz
    int aux;
    System.out.println("Transponiendo la matriz");

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < i; j++) {
        aux = matriz[i][j];
        matriz[i][j] = matriz[j][i];
        matriz[j][i] = aux;
      }
    }

    System.out.println("La matriz transpuesta es: ");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println("");
    }

    entrada.close();

  }

}
