import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner entradas = new Scanner(System.in);
    double guillermo, luis, juan, resultado;

    System.out.println("Cuantos Dolares tiene Guillermo: ");
    guillermo = entradas.nextDouble();

    luis = guillermo / 2;
    System.out.println("La cantidad que posee Luis es de: $" + luis);

    juan = (guillermo + luis) / 2;
    System.out.println("La cantidad que posee juan es de: $" + juan);

    resultado = guillermo + luis + juan;

    System.out.println("\nEl resultado de la suma de Guillermo,Luis y Juan es: $"+resultado);

  }
}
