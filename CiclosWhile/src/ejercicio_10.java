import java.util.Scanner;

public class ejercicio_10 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num,contador = 0, sumaTotal= 0;

     for(int i = 1; i <= 10; i++) {
       System.out.println("Digite un numero: ");
       num = entrada.nextInt();

       if (num > 1) {
        System.out.println("Digite otro numero: ");
        num = entrada.nextInt();
       }
      sumaTotal += num;
      contador++;
     }


     System.out.println("La suma total de los 10 numeros digitado es: "+sumaTotal);
    System.out.println("Cantidad de numeros Digitados: "+contador);
    entrada.close();
  }
}
