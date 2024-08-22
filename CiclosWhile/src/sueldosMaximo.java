import java.util.Scanner;

public class sueldosMaximo {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int n = 0,sueldoMaximo = 0,sueldo,i = 1;


    while (n <= 0) {

      System.out.println("Digite un numero: ");
      n = entrada.nextInt();

      while ( i <= n){
        System.out.println("Digite un sueldo: ");
        sueldo = entrada.nextInt();

        if (sueldo <= 0) {
           System.out.println("El sueldo debe ser mayor a 0");
          break;
        }

        if (sueldo > sueldoMaximo) {
          sueldoMaximo = sueldo;
        }

        i++;
        
      } 

    }
 
    System.out.println("El sueldo maximo es: "+sueldoMaximo);

    System.out.println("Contador "+i);


    entrada.close();
  }
}
