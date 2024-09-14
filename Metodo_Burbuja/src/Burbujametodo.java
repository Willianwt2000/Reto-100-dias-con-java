import java.util.Scanner;

public class Burbujametodo {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int tabla[], tamanio;

    System.out.print("Defina el tamaño de la tabla: ");
    tamanio = entrada.nextInt();
    tabla = new int[tamanio];

    // Llenar arreglo
    for (int i = 0; i < tamanio; i++) {
      System.out.print("Digite el numero " + (i + 1) + ": ");
      tabla[i] = entrada.nextInt();
    }

    // Imprimir arreglo antes de ordenar
    System.out.println("Tabla antes de ordenar:");
    for (int i = 0; i < tabla.length; i++) {
      System.out.print("[" + tabla[i] + "] ");
    }
    System.out.println();

    // Ordenar con el método burbuja
    int aux; // La variable auxiliar es para intercambiar los valores
    for (int i = 0; i < (tamanio - 1); i++) {
      for (int j = 0; j < (tamanio - i - 1); j++) {
        if (tabla[j] > tabla[j + 1]) { // Comparar elementos consecutivos
          aux = tabla[j];
          tabla[j] = tabla[j + 1];
          tabla[j + 1] = aux;
        }
      }
    }

    // Imprimir la tabla ordenada de forma creciente
    System.out.println("Tabla ordenada de forma creciente:");
    for (int i = 0; i < tamanio; i++) {
      System.out.print("[" + tabla[i] + "] ");
    }
    System.out.println();

    // Imprimir la tabla ordenada de forma decreciente
    System.out.println("Tabla ordenada de forma decreciente:");
    for (int i = (tamanio - 1); i >= 0; i--) {
      System.out.print("[" + tabla[i] + "] ");
    }
    System.out.println();

    entrada.close();
  }
}
