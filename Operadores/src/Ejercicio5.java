import java.util.Scanner;

public class Ejercicio5 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    //Ejercicio 5: Hacer un programa que calcule el cuadrado de una suma.

    Scanner entrada = new Scanner(System.in);

    int base1, base2;
    int sumaCuadrado,sumaCuadrado2;

    //Pedir datos, LA base
    System.out.println("Digite el primera base: ");
    base1 = entrada.nextInt();
    System.out.println("Digite la segunda base: ");
    base2 = entrada.nextInt();

     // Calcular la suma de las bases y luego su cuadrado
    sumaCuadrado = (base1 + base2) * (base1 + base2);  //Esta es una forma de realizar el calculo. del cuadrado de una suma

    System.out.println("La suma es: "+sumaCuadrado);

    //sumaCuadrado2 = suma * suma;  
    //System.out.println("El resultado del cuadrado de una suma es: "+sumaCuadrado2);
    
    entrada.close();
  }
}
