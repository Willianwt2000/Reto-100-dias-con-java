import java.util.Scanner;

public class CicloFor {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int contador,resultado;
    System.out.println("Digite la cantidad de terminos que deseas para la tabla: ");
    contador = entrada.nextInt();

    for (int i = 1; i <= 20; i++) {

      for (int j = 1; j <= contador; j++) {
        resultado = i*j;
        System.out.println(i + "x" + j + "=" + resultado);

      }
    }
    entrada.close();
  }
}