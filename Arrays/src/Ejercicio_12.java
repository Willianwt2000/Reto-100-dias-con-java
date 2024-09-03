/*Ejercicio 12:  Leer por teclado una tabla de 10 elementos numericos  enteros y una posicion entre (0 y  9).
 * Eliminar el elemento situado en  la posicion dada sin dejar hueco.
 */

import java.util.Scanner;

public class Ejercicio_12 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int tabla[] = new int[10];
    int posicion;

    //Llenando tabla
    System.out.println("Llenar tabla.");
    for (int i = 0; i < tabla.length; i++) {
      System.out.print((i+1)+ ".Digite un numero: ");
      tabla[i] = entrada.nextInt();
    }

    //Pidiendo popsicion al usuario para eliminar
    do {
      System.out.print("Ingrese la posición (entre 0-9) que desea eliminar: ");
      posicion=entrada.nextInt();

    } while (posicion>=10 || posicion<0);


    //Eliminar posicion
    for (int i = 0; i < 9; i++) {
      if (i>=posicion){
        tabla[i]=tabla[i+1];
      }

      System.out.print(tabla[i] + "_");
    }

    entrada.close();
  }
}
