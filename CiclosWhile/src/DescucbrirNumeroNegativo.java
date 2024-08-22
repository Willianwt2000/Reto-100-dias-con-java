import java.util.Scanner;

public class DescucbrirNumeroNegativo {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int numeros,numNegativo = 0;

    for(int i = 1; i <= 10; i++) {
      System.out.println("Digite un numero: ");
      numeros = entrada.nextInt();

      if (numeros < 0) numNegativo++;
      
    }

    if (numNegativo == 1) {  
      System.out.println("Se ha introducido "+numNegativo+ " numero negativo");
    } else {
      System.out.println("Se ha introducido "+numNegativo+ " numeros negativos");

    }

    entrada.close();
  }
}
