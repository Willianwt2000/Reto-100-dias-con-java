import java.util.Scanner;

public class TablaMultiplicar {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int num,resultado ;

    for(int i = 1; i <= 10; i++) {
      System.out.println("Digite un numero: ");
      num = entrada.nextInt();

      for(int j = 1; j<= 10; j++) {
        resultado = num*j;
        System.out.println(num+"x"+j +" = "+ resultado);
      }

    }

    entrada.close();
  }
}
