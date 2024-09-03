import java.util.Scanner;

public class Ejercicio_8 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int tabla[] = new int[10]; // Creacion de arreglo con 10 elementos entero.
    int numero, posicion;
    System.out.println("Llenar arreglo");
    for (int i = 0; i < 10; i++) {
      System.out.print((i + 1) + ". Digite un numero: ");
      tabla[i] = entrada.nextInt();
    }

    // Pidiendo numero y posicion para sustituir.
    System.out.println("insertando numero y su indice o posicion");
    System.out.println("Digite un numero: ");
    numero = entrada.nextInt();
    System.out.println("Digite el indice o su posicion: ");
    posicion = entrada.nextInt();

    // Validar la posición
    if (posicion < 0 || posicion >= 10) {
      System.out.println("Posición inválida. Debe estar entre 0 y 9.");
    } else {
      // Desplazar los elementos hacia la derecha
      for (int i = 9; i > posicion; i--) {
        tabla[i] = tabla[i - 1];
      }

      // Insertar el nuevo número en la posición deseada
      tabla[posicion] = numero;

      // Mostrando elementos de la tabla;

      System.out.println("Los nuevos elementos de la tabla es: ");
      for (int i = 0; i < 10; i++) {
        System.out.print("[" + tabla[i] + "]");
      }

      entrada.close();
    }
  }
}