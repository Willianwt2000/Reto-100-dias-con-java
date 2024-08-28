
import java.util.Scanner;

public class OrdenarNumeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[10];

    // Leer 10 números enteros
    System.out.println("Ingrese 10 números enteros:");
    for (int i = 0; i < 10; i++) {
      numeros[i] = scanner.nextInt();
    }

    // Mostrar los números en el orden deseado
    System.out.println("Los números en el orden deseado son:");
    int inicio = 0;
    int fin = 9;

    while (inicio <= fin) {
      // Mostrar el número al inicio
      System.out.print(numeros[inicio] + " ");
      inicio++;

      // Mostrar el número al final (si aún no se ha cruzado con el inicio)
      if (inicio <= fin) {
        System.out.print(numeros[fin] + " ");
        fin--;
      }
    }

    // Cerrar el scanner
    scanner.close();
  }
}
