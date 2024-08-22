import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int opcion = 1, num = 5;
    int i = 1;

    do {
      if (i <= 1) System.out.println("Digite el numero secreto"); // Esto lo dira una vez
      opcion = entrada.nextInt();
      
      if (opcion == num) {
        System.out.println("FELICIDADES EN HORA BUENA!");
        break;
      } else if (i == 3)  System.out.println("GAME OVER!");

      if (i  < 3) System.out.println("Intente de nuevo"); //Esto lo imprimira en el 2do intento4
      i++;
    } while (i <= 3);
    entrada.close();
  }
}
