import java.util.Scanner;

/*Ejercicio_13     Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la primera, y a continuacion los
 elementos impares
 */
public class Ejercicio_13 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int tabla[] = new int[10];
    int conteoPar = 0,conteoImpar = 0;

    //ingresar elementos para el arreglo
    System.out.println("Llenar tabla");
    for (int i = 0; i < tabla.length; i++) {
      System.out.print((i+1)+ ".Digite un numero: ");
      tabla[i] = entrada.nextInt();

      if (tabla[i] % 2 == 0) { //Evaluar si los numeros digitados son pares o impares
        conteoPar++;
      } else {
        conteoImpar++;
      }
    }

    //Crear arreglos para que almacene los numeros pares e impares
    int tablaPar[] = new int[conteoPar];
    int tablaImpar[] = new int[conteoImpar];

    conteoPar = 0;
    conteoImpar = 0;

    //Almacenando los numeros pares e impares en sus arreglos correspondientes
    for (int i = 0; i < tabla.length; i++) { //
      if (tabla[i] % 2 == 0) {
        tablaPar[conteoPar] = tabla[i];
        conteoPar++;
      } else {
        tablaImpar[conteoImpar] = tabla[i];
        conteoImpar++;
      }
    }

    //Imprimiendo arreglos par e impar
    System.out.println("\nArreglo pares" );
    for (int i = 0; i < conteoPar; i++) {
      System.out.print("["+tablaPar[i]+"]");
    }

    System.out.println("\nArreglo impares" );
    for (int i = 0; i < conteoImpar; i++) {
      System.out.print("["+tablaImpar[i]+"]");
    }

    entrada.close();

  }
}
