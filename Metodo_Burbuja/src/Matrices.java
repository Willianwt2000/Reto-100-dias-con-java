import java.util.Scanner;

import javax.swing.*;

public class Matrices {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int matriz[][],nFilas,nColumnas;

    //Pedir filas y columnas----
    nFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el  numero de filas: "));
    nColumnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el  numero de columnas: "));

    //Definir matriz
    matriz = new int[nFilas][nColumnas];


    //Pedir datos para la matiz al usuario
    for (int i = 0; i < nFilas; i++) {
      // El segundo bucle for es para el numero de columnas
      for (int j = 0; j < nColumnas; j++) {
        System.out.print("Matriz ["+i+"] ["+ j +"] :");
        matriz[i][j] = entrada.nextInt();
      }
    }


    
    //El primer bucle for, es para el numero de filaz {{},{},{}} 3  filas
    System.out.println("\nLa matriz es: ");
    for (int i = 0; i < nFilas; i++) {
      // El segundo bucle for es para el numero de columnas
      for (int j = 0; j < nColumnas; j++) {
        System.out.print(matriz[i][j]);
      }
      System.out.println();
    }

    entrada.close();
  }
}
