import java.util.Scanner;

public class Prueba {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int primero = 0,segundo = 1,total;

    for (int i = 3; i < 10; i++) {
      total = primero + segundo;
      primero = segundo;
      segundo = total;
      System.out.print(total+"");
    }


    entrada.close();
  }
}
