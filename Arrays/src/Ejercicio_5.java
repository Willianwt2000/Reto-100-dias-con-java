import java.util.Scanner;

public class Ejercicio_5 {
  public static void main(String[] args) {
    Scanner entradas = new Scanner(System.in);

    int[] elementosA = new int[10], elementosB = new int[10];
    var elementoC = new int[20];

    // solicitando datos para el primer arreglo;
    System.out.println("Digite 10 números enteros para el primer arreglo:");
    for (int i = 0; i < 10; i++) {
      elementosA[i] = entradas.nextInt();
    }

    // solicitando datos para el segundo arreglo;
    System.out.println("Digite 10 números enteros para el segundo arreglo:");
    for (int i = 0; i < 10; i++) {
      elementosB[i] = entradas.nextInt();
    }

    //fucionando elementos de los arreglos;
    int j = 0;
    
    for (int i = 0; i < 10; i++) { // i = 1
      elementoC[j] = elementosA[i]; //Primer elemento A //i=1 valores(1,2)
      j++;//1 2
      elementoC[j] = elementosB[i]; //Primer elemento B i = 1 valor 1,2
      j++; // 2 3

    }

    System.out.println("\nEl tercer arreglo es: ");
    for (int i = 0; i < elementoC.length; i++) {
      System.out.print("["+elementoC[i]+"]"+" ");
    }

    entradas.close();
  }
}
