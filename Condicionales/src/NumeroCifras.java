import java.util.Scanner;

public class NumeroCifras {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir al usuario que ingrese un número
    System.out.print("Ingresa un número entre 0 y 99,999: ");
    int numero = scanner.nextInt();

    // Verificar si el número está en el rango permitido
    if (numero < 0 || numero > 99999) {
      System.out.println("Número fuera del rango permitido.");
    } else {
      // Convertir el número a cadena para contar las cifras
      String numeroStr = Integer.toString(numero);
      int cantidadCifras = numeroStr.length();
      System.out.println("El número tiene " + cantidadCifras + " cifra(s).");
    }

    // Cerrar el scanner
    scanner.close();
  }
}

