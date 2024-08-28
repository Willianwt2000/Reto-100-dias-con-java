import java.util.Scanner;

public class Ejercicio_6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Crear dos arreglos de 10 números enteros cada uno
    int[] tablaA = new int[12];
    int[] tablaB = new int[12];
    int[] tablaC = new int[24];

    // Leer la primera tabla
    System.out.println("Introduce los 12 números para la tabla A:");
    for (int i = 0; i < tablaA.length; i++) {
      tablaA[i] = scanner.nextInt();
    }

    // Leer la segunda tabla
    System.out.println("Introduce los 12 números para la tabla B:");
    for (int i = 0; i < tablaB.length; i++) {
      tablaB[i] = scanner.nextInt();
    }

    // Crear el tercer arreglo mezclada o fusionada
    int j = 0;


    for (int i = 0; i < 12; i++) {
      if (j < tablaC.length) { // Asegúrate de no exceder el tamaño de tablaC
        tablaC[j] = tablaA[i];
        j++;
      }
      if (j < tablaC.length) { // Asegúrate de no exceder el tamaño de tablaC
        tablaC[j] = tablaB[i];
        j++;
      }
      System.out.println(j);
    }

    System.out.println("\nEl tercer arreglo es: ");
    for (int i = 0; i < 24; i++) {
      System.out.print("["+tablaC[i]+"]"+" ");
    }



    scanner.close();
  }
}
