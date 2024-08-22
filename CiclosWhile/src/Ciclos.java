import java.util.Scanner;

public class Ciclos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite la cantidad de numero que desea ver en la pantalla: ");
    
    int contador = entrada.nextInt();
    int i = 2;
    while (i <= contador) {
      System.out.println(i);
      i += 2;
    }

    entrada.close();
  }
}