import java.util.Scanner;

public class MediasDeNumeros {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int contador = 0,numeros,sumaTotalPositivo=0,sumaTotalNegativo=0;
    float mediasPositivos = 0,mediasNegativos = 0;
    int contadorPositivos = 0,contadorNegativo = 0,cantidadCero = 0;

    for(int i=1; i <= 10; i++) {
      System.out.println("Digite un numero:");
      numeros = entrada.nextInt();

      //condicionales para la suma y el promedio de los positivos.
      if (numeros > 0) {
        contadorPositivos++;
        sumaTotalPositivo += numeros;
      } else if (numeros < 0) {
        contadorNegativo++;
        sumaTotalNegativo += numeros;
      } else {
        cantidadCero++;
      }
      contador++;
      
    }

    if (contadorPositivos == 0){
      System.out.println("No se puede sacar el promedio de los positivos.");
    } else  {
      System.out.println("Promedio de los numeros negativos es: "+(mediasNegativos = (float) sumaTotalNegativo / contadorNegativo));
    }
    System.out.println("Promedio de los numeros positivos es: "+(mediasPositivos = (float) sumaTotalPositivo / contadorPositivos));

    //Imprimir cantidades de 0 promedio numeros positivos y negativos...
    System.out.println("La suma iterativa de los positivos es: "+sumaTotalPositivo);
    System.out.println("La suma iterativa de los negativos es: "+sumaTotalNegativo);
   
  
  
    //System.out.println("Promedio positivo: "+mediasPositivos);

    System.out.println("Contador de numeros positivos: "+contadorPositivos);
    System.out.println("Contador de numeros negativos: "+contadorNegativo);
    System.out.println("La cantidad  de ceros existentes es: "+cantidadCero);

    //Total de numeros 
    System.out.println("Cantidad de numeros digitados es: "+contador);
    entrada.close();
  }
}
