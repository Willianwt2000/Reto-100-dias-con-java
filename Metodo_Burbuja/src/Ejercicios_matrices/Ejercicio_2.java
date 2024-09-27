package Ejercicios_matrices;

import java.util.Scanner;
/*Ejercicio 2: Crear y cargar dos matrices de tamaño 3x3, sumarla y mostrar su suma */

public class Ejercicio_2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int[][] matriz = new int[3][3];
    int[][] matrizDos = new int[3][3];

    // Rellenar la primera matriz
    System.out.println("Digite los números de la primera matriz:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("Matriz [" + i + "] [" + j + "] : ");
        matriz[i][j] = entrada.nextInt();
      }
    }

    // Rellenar la segunda matriz
    System.out.println("\nDigite los números de la segunda matriz:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print("Segunda matriz [" + i + "] [" + j + "] : ");
        matrizDos[i][j] = entrada.nextInt();
      }
    }

    // Sumar las matrices
    int[][] matrizSuma = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        matrizSuma[i][j] = matriz[i][j] + matrizDos[i][j];
      }
    }

    // Imprimir las matrices y su suma
    System.out.println("\t\t\tMatriz 1\t\tMatriz 2\t\tSuma");
    System.out.println("-------------------------------------------------");
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.printf("%5d ", matriz[i][j]);
      }
      System.out.print(" | ");
      for (int j = 0; j < 3; j++) {
        System.out.printf("%5d ", matrizDos[i][j]);
      }
      System.out.print(" | ");
      for (int j = 0; j < 3; j++) {
        System.out.printf("%5d ", matrizSuma[i][j]);
      }
      System.out.println();
    }

    entrada.close();
  }
}
