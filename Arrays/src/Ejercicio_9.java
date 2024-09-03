import java.util.Scanner;

public class Ejercicio_9 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int tabla[] = new int[10]; //Creacion de arreglo con 10 elementos entero.
    int ultimo;
    System.out.println("Llenar arreglo");
    for (int i = 0; i < 10; i++) {
      System.out.print((i+1) + ". Digite un numero: ");
      tabla[i] = entrada.nextInt();
    }

    ultimo = tabla[9]; //Guardar el ultimo elemento.

    //Posicionar elementos del arreglo
    for (int i = 8; i >= 0 ; i--) {
      tabla[i+1] = tabla[i]; //Abanzar una pocicion abajo en el arreglo
    }

    tabla[0] = ultimo; //Insertar ultimo elemento como el primero.

    //Mostrando elementos de la tabla;

    System.out.println("Los nuevos elementos de la tabla es: ");
    for (int i = 0; i < 10; i++) {
      System.out.print("[" +tabla[i] +"]");
    }

    entrada.close();
  }
}
