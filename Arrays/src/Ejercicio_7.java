import java.util.Scanner;

public class Ejercicio_7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] tablaA = new int[10];
    boolean creciente = false, decreciente= false;

    // Leer la  tabla A
    System.out.print("Digite 10 numeros:");
    for (int i = 0; i < tablaA.length; i++) {
      tablaA[i] = scanner.nextInt();

    
    }

    for (int i = 0; i < 9; i++) {
      if (tablaA[i] < tablaA[i + 1]) { //1-2-3-4-5
        creciente = true;
      }

      if (tablaA[i] > tablaA[ i + 1]) { //decreciente 5-4 -3-2-1
        decreciente = true;
      }

    
    }
     //Organizacion de los arreglos
    if (creciente == true && decreciente == false) {
      System.out.println("\nEl arreglo esta organizado de forma creciente...");
    } else if (decreciente == true && creciente == false) {
      System.out.println("El arreglo esta organizado de forma decreciente...");
    } else if(creciente == true && decreciente == true) {
      System.out.println("El arreglo esta desorganizado");
    } else if(creciente == false && decreciente == false) {
      System.out.println("Todos los numeros son iguales");

    }


    scanner.close();
  }
}
