import java.util.Scanner;

public class factoria {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int factoria = 1, num;

    System.out.println("Digite un numero, para determinar su factorial: ");
    num = entrada.nextInt();

    for(int i = 1; i <= num; i++) {
      factoria *= i;
    }

    System.out.println("El factorial de "+num+" es: "+factoria);

    entrada.close();
  }
}
