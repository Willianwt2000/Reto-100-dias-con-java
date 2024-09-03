import java.util.Scanner;

/*Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la primera, y a continuacion los
 elementos impares
 */
public class Ejercicio_13 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int tabla[] = new int[10];

    //ingresar elementos para el arreglo
    for (int i = 0; i < tabla.length; i++) {
      System.out.println((i+1)+ ".Digite un numero: ");
      tabla[i] = entrada.nextInt();

    }
  }
}
