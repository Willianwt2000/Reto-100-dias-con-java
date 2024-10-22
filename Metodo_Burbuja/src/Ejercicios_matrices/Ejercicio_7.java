package Ejercicios_matrices;

public class Ejercicio_7 {
  public static void main(String[] args) {
    int matriz[][] = new int[5][5];

    //Rellenando la matriz

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        if (i == 0 || i == 4) { //Delimita las columnas
          matriz[i][j] = 1;
        } else if (j == 0 || j == 4) {
          matriz[i][j] = 1;
        } else
          matriz[i][j] = 0;
      }
    }

    System.out.println("\nLa matriz es: \n");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        System.out.print(matriz[i][j]+" ");
      }
      System.out.println("");
    }
  }
}
