/*
 Ejercicio_14: Leer dos series de 10 enteros, que estaran ordenados crecientemente. 
 copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
 */

import java.util.Scanner;

public class Ejercicio_14 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    var creciente = true;
    int tabla1[] = new int[10];
    int tabla2[] = new int[10];


    System.out.println("Llenar el arreglo");

    do {
      //Llenando la primera serie
      for (int i = 0; i < tabla1.length; i++) {
        System.out.print("Digite un numero: "+(i+1)+":");
        tabla1[i] = entrada.nextInt();
      }

      //Comprobar si el arreglo esta ordenado en orden creciente.
      for (int i = 0; i < 4; i++) {
        if (tabla1[i] < tabla1[i+1]) { //creciente 1-2-3
          creciente = true;
        }

        if (tabla1[i] > tabla1[i+1]) {
          creciente = false; // decreciente 3-2-1
          break;
        }
      }

      if (creciente == false) {
        System.out.println("\nEl arreglo no esta ordenado de forma creciente,vuelva a digitar\n");
      }

    } while (creciente == false);


    System.out.println("\n Llenando segunda serie:\n");
    do {
      //Llenando la segunda serie
      for (int i = 0; i < tabla2.length; i++) {
        System.out.print("Digite el numero: "+(i+1)+":");
        tabla2[i] = entrada.nextInt();
      }

      //Comprobar si el arreglo esta ordenado en orden creciente.
      for (int i = 0; i < 4; i++) {
        if (tabla2[i] < tabla2[i+1]) { //creciente 1-2-3
          creciente = true;
        }

        if (tabla2[i] > tabla2[i+1]) {
          creciente = false; // decreciente 3-2-1
          break;
        }
      }

      if (creciente == false) {
        System.out.println("\nEl arreglo no esta ordenado de forma creciente,vuelva a digitar\n");
      }

    } while (creciente == false);

  //declarando tamaño y j para el arreglo c
    int tamanio,j = 0;
    tamanio = tabla1.length + tabla2.length;
    int tabla3[] = new int[tamanio];

    //llenando el primer arrglo en tabla3
    for (int i = 0; i < tabla1.length; i++) {
      tabla3[j++] = tabla1[i]; //se puede incrementar j dentro de los corchetes o fuera
    }

    //llenando el segundo arrglo en tabla3
    for (int i = 0; i < tabla2.length; i++) {
      tabla3[j] = tabla2[i];
      j++;  // tambien se puede incrementar fuera
    }


    System.out.println("\nImprimiendo 3ra tabla");
    for (int i = 0; i < tamanio; i++) { //Imprimiendo las tercera tabla
      System.out.print("["+tabla3[i]+"]");
    }

    //Metodo burbuja
    int aux; // La variable auxiliar es para intercambiar los valores
    for (int i = 0; i < (tabla3.length -1); i++) {
      for (int k = 0; k < (tabla3.length -1); k++) {
        if (tabla3[k] > tabla3[k + 1]) { // Comparar elementos consecutivos
          aux = tabla3[k];
          tabla3[k] = tabla3[k + 1];
          tabla3[k + 1] = aux;
        }
      }
  }
    System.out.println("");
    System.out.println("\nTabla_3 ordenada de forma creciente:");
   
    for (int i = 0; i < tabla3.length; i++) {
      System.out.print("[" + tabla3[i] + "] ");
    }
 


  
    entrada.close();
  }
}
