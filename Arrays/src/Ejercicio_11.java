/*Ejercicio 11: Leer 5 elementos numericos que se introduciran ordenados de formas crecientes. Esto lo guardareos en una tabla
* de tamaño 10. Leer un numero N, e insertarlo en el lugar adecuado para que la tabla continue*/

import java.util.Scanner;
public class Ejercicio_11 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int tabla[] = new int[10];
    int numero;
    int sitio_num = 0, j = 0;
    boolean creciente = true;

    System.out.println("Llenar el arreglo");

    do {
      //Llenando el arreglo
      for (int i = 0; i < 5; i++) {
        System.out.print("Digite un numero: ");
        tabla[i] = entrada.nextInt();
      }

      //Comprobar si el arreglo esta ordenado en orden creciente.
      for (int i = 0; i < 4; i++) {
        if (tabla[i] < tabla[i+1]) { //creciente 1-2-3
          creciente = true;
        }

        if (tabla[i] > tabla[i+1]) {
          creciente = false; // decreciente 3-2-1
          break;
        }
      }

      if (creciente == false) {
        System.out.println("\nEl arreglo no esta ordenado de forma creciente,vuelva a digitar\n");
      }

    } while (creciente == false);

    //Insetar numero
    //esto es paa darnos cuenta en que posicion vamos a introducir  el numero
    System.out.print("Digite un elemento a insertar: ");
    numero = entrada.nextInt();
    while (tabla[j] < numero && j<5) {
      sitio_num++;
      j++;
    }

    //Trasladar una posicion en el arreglo a los elementos que van detras de numero
    for (int i = 4; i >= sitio_num; i--) {
      tabla[i+1] = tabla[i];
    }

    //Insertar el numero que el usuario puso
    tabla[sitio_num] = numero;
    

    // Imprimiendo valores de la tabla o arreglo
    System.out.println("\nEl arreglo o la tabla queda: ");
    for (int i = 0; i < tabla.length; i++) {
      System.out.print("[" + tabla[i] + "]"+"_");
    }

    entrada.close();
  }
}
