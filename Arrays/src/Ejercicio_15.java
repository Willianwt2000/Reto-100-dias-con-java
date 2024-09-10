import java.util.Scanner;

public class Ejercicio_15 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int tabla[] = new int[10];
    boolean creciente;
    int nBusqueda;
    boolean encontrado = false;

    do {
      // Llenando el arreglo
      System.out.println("Digite 10 números enteros en orden creciente:");
      for (int i = 0; i < 10; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        tabla[i] = entrada.nextInt();
      }

      // Comprobar si el arreglo está ordenado en orden creciente
      creciente = true;
      for (int i = 0; i < 9; i++) {
        if (tabla[i] > tabla[i + 1]) {
          creciente = false;
          break;
        }
      }

      if (!creciente) {
        System.out.println("\nEl arreglo no está ordenado de forma creciente. Vuelva a digitar.");
      }

    } while (!creciente);

    // Buscando elemento en el arreglo
    System.out.print("\nDigite el número que desea buscar: ");
    nBusqueda = entrada.nextInt();

    for (int i = 0; i < tabla.length; i++) {
      if (nBusqueda == tabla[i]) {
        System.out.println("El número " + nBusqueda + " se encuentra en la posición => " + i);
        encontrado = true;
        break; //Para que una vez que se encuentre , no seguir iterando
      }
    }

    if (!encontrado) {
      System.out.println("El número " + nBusqueda + " no fue encontrado.");
    }

    entrada.close();
  }
}
